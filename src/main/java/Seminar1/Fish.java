package Seminar1;

public class Fish extends Product {
    private  String cookingMethod;


    public Fish(String name, Double price, String cookingMethod) {
        super (name, price);
        this.cookingMethod=cookingMethod;

    }

    @Override
    public String toString() {
        return String.format ("%s cookingMethod = %s  ", super.toString (), cookingMethod);
    }
}


