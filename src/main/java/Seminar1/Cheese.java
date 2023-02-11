package Seminar1;

public class Cheese extends Product {
    private String view;

    public Cheese(String name, Double price, String view) {
        super (name, price);
        this.view=view;
    }

    @Override
    public String toString() {
        return String.format ("%s view = %s  ", super.toString (), view);
    }
}
