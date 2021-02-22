package model;

import java.util.Objects;

public class Size {
    private double height;
    private double length;
    private double perimeter;

    public Size() {
    }

    public Size(double height, double length) {
        this.height = height;
        this.length = length;
        setPerimeter();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        setPerimeter();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        setPerimeter();
    }

    public double getPerimeter() {
        return perimeter;
    }

    private void setPerimeter(){
        this.perimeter = this.height + this.length;
    }

    @Override
    public String toString() {
        return "Size{" +
                "height=" + height +
                ", length=" + length +
                ", perimeter=" + perimeter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return Double.compare(size.height, height) == 0 &&
                Double.compare(size.length, length) == 0 &&
                Double.compare(size.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, length, perimeter);
    }
}
