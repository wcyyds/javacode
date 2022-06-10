package javakaohe;

import java.util.Objects;

public class Fruit {
    private float weight;
    private String color;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Float.compare(fruit.weight, weight) == 0 && color.equals(fruit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }
}