import java.util.Objects;

public class Fruit {
    private int weight;
    private String color;

    public Fruit() {
    }

    public Fruit(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return weight == fruit.weight &&
                color.equals(fruit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }
}
