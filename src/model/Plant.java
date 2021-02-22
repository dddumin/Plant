package model;

import java.util.Objects;

public class Plant {
    private String name;
    private String color;
    private double count;
    private double lifeTime;
    private double price;
    private Size size;

    public Plant() {
        this.name = "";
        this.color = "";
        this.size = new Size();
    }

    public Plant(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public Plant(String name, String color, int count, int lifeTime, double price, double height, double length) {
        this(name, price);
        this.color = color;
        this.count = count;
        this.lifeTime = lifeTime;
        this.size = new Size(height, length);
    }

    public void evalCount(double d){
        this.count += d;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public void setLifeTime(double lifeTime) {
        this.lifeTime = lifeTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getCount() {
        return count;
    }

    public double getLifeTime() {
        return lifeTime;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", count=" + count +
                ", lifeTime=" + lifeTime +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.count, count) == 0 &&
                Double.compare(plant.lifeTime, lifeTime) == 0 &&
                Double.compare(plant.price, price) == 0 &&
                Objects.equals(name, plant.name) &&
                Objects.equals(color, plant.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, count, lifeTime, price);
    }
}
