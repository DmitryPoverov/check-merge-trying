package ru.clevertec.console;

public class ParamMapper {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public ParamMapper() {
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
/*    @Override
    public String toString() {
        return "ParamMapper{" +
                "id=" + id +
                ", quantity=" + quantity +
                '}';
    }*/
    @Override
    public String toString() {
        return "ParamMapper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
