package Game;

public class Items {

    private String name;
    private int count;

    public Items(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }
}
