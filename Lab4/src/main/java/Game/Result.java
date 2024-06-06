package Game;

public class Result {

    private String name;
    private int points;

    public Result(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

}
