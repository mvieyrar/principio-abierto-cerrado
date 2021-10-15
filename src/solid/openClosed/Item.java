package solid.openClosed;

public class Item {
    private int id;
    private double price;
    private double weight;
    private int quantity;

    public Item(int id, double price, double weight, int quantity) {
        this.id = id;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
