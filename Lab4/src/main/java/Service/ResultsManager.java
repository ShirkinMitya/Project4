package Service;

import Character.Player;
import Game.Result;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ResultsManager {

    private ArrayList<Result> resultList = new ArrayList<>();

    public DefaultTableModel EndGameTop(Player human, String text) throws IOException {
        resultList.add(new Result(text, human.getPoints()));
        resultList.sort(Comparator.comparing(Result::getPoints).reversed());
        WriteToExcel();
        return CreateTableModel();
    }

    public DefaultTableModel CreateTableModel() {
        DefaultTableModel model = new DefaultTableModel();
        for (int i = 0; i < resultList.size(); i++) {
            if (i < 10) {
                model.setValueAt(resultList.get(i).getName(), i, 0);
                model.setValueAt(resultList.get(i).getPoints(), i, 1);
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
        File f = new File("C:\\Users\\Мария\\Desktop\\Results.xlsx");
        book.write(new FileOutputStream(f));
        book.close();
    }

    public void ReadFromExcel() throws IOException {
        XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Мария\\Desktop\\Results.xlsx");
        XSSFSheet sh = book.getSheetAt(0);
        for (int i = 1; i <= sh.getLastRowNum(); i++) {
            resultList.add(new Result(sh.getRow(i).getCell(1).getStringCellValue(), (int) sh.getRow(i).getCell(2).getNumericCellValue()));
        }
    }

    public ArrayList<Result> getResults() {
        return this.resultList;
    }

}
