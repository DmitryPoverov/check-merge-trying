package ru.clevertec.console;

public class CheckItem {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public CheckItem() {
    }

    public CheckItem(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public CheckItem(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" + id + ", " + name + ", " + price + "$, " + quantity + '}';
    }
}
