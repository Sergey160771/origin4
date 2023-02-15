package Seminar2;


public class Butterfly extends Herbivores implements Flyable {
    public Butterfly(String nickname) {
        super (nickname);

    }

    @Override
    public int speedOfFly() {
        return 10;
    }

    public String toString() {
        return "I'm butterfly. " + super.toString() + " .I speak "+ say() + ".I eat " + feed() +
                ". My speed is " + speedOfFly ();
    }

    @Override
    public String say() {
        return "hhhh";
    }
}

