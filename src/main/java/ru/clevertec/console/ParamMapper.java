package ru.clevertec.console;

import java.util.Objects;

public class ParamMapper {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public ParamMapper() {
    }

    public ParamMapper(int id, int quantity) {
        this.id = id;
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
        return "ParamMapper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParamMapper that = (ParamMapper) o;
        return id == that.id && Double.compare(that.price, price) == 0 && quantity == that.quantity && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantity);
    }

/* Don't remember why i have left this method.
        @Override
        public String toString() {
            return "ParamMapper{" +
                    "id=" + id +
                    ", quantity=" + quantity +
                    '}';
        }*/
}
