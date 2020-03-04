package Task_6;

public class Parameters {
    private String name_items;
    private int cost;
    private int weigth;

    public Parameters(String name_items, int cost, int weigth) {
        this.name_items = name_items;
        this.cost = cost;
        this.weigth = weigth;
    }

    public String getName_items() {
        return name_items;
    }

    public void setName_items(String name_items) {
        this.name_items = name_items;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
}
