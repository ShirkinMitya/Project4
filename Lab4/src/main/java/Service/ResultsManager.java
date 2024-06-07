package Service;

import Character.Player;
import Game.Result;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ResultsManager {

    String fileName = "Results.xlsx";
    private ArrayList<Result> resultList = new ArrayList<>();

    private static Path getDownloadsFolderPath() {
        String userHome = System.getProperty("user.home");
        if (userHome != null) {
            Path downloadsFolderPath = Paths.get(userHome, "Downloads");
            if (Files.exists(downloadsFolderPath) && Files.isDirectory(downloadsFolderPath)) {
                return downloadsFolderPath;
            }
        }
        return null;
    }

    public DefaultTableModel EndGameTop(Player player, String text) throws IOException {
        resultList.add(new Result(text, player.getPoints()));
        resultList.sort(Comparator.comparing(Result::getPoints).reversed());
        WriteToExcel();
        return CreateTableModel();
    }

    public DefaultTableModel CreateTableModel() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Имя", "Баллы"}, 0);

        for (int i = 0; i < resultList.size(); i++) {
            if (i < 10) {
                model.addRow(new Object[]{resultList.get(i).getName(), resultList.get(i).getPoints()});
            }
        }

        return model;
    }

    public void WriteToExcel() throws IOException {

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Результаты ТОП 10");
        XSSFRow r = sheet.createRow(0);
        r.createCell(0).setCellValue("№");
        r.createCell(1).setCellValue("Имя");
        r.createCell(2).setCellValue("Количество баллов");
        for (int i = 0; i < resultList.size(); i++) {
            if (i < 10) {
                XSSFRow r2 = sheet.createRow(i + 1);
                r2.createCell(0).setCellValue(i + 1);
                r2.createCell(1).setCellValue(resultList.get(i).getName());
                r2.createCell(2).setCellValue(resultList.get(i).getPoints());
            }
        }
        Path downloadsFolderPath = getDownloadsFolderPath();
        if (downloadsFolderPath == null) {
            System.out.println("Downloads folder not found.");
            return;
        }
        File file = new File(downloadsFolderPath.resolve(fileName).toString());
        try (FileOutputStream fos = new FileOutputStream(file)) {
            book.write(fos);
        } finally {
            book.close();
        }
    }

    public void ReadFromExcel() throws IOException {
        Path downloadsFolderPath = getDownloadsFolderPath();
        if (downloadsFolderPath == null) {
            System.out.println("Downloads folder not found.");
            return;
        }
        File file = new File(downloadsFolderPath.resolve(fileName).toString());
        try {
            XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(file));
            XSSFSheet sh = book.getSheetAt(0);
            for (int i = 1; i <= sh.getLastRowNum(); i++) {
                resultList.add(new Result(sh.getRow(i).getCell(1).getStringCellValue(), (int) sh.getRow(i).getCell(2).getNumericCellValue()));
            }
        } catch (NoSuchFileException e) {
        } catch (InvalidOperationException ex) {
        }
    }

    public ArrayList<Result> getResults() {
        return this.resultList;
    }

}
