package Seminar2;

public class Shark extends Animal implements Swimable {
    public Shark(String nickname) {
        super (nickname);
    }

    @Override
    public String feed() {
        return null;
    }

    public String toString() {
        return "I'm Shark. " + super.toString () + " .I speak "+ say() +".I eat "
                + feed() + ". My speed is swimming " + speedOfSwimming ();
    }

    @Override
    public String say() {
        return "Fa-fa";
    }

    @Override
    public int speedOfSwimming() {
        return 30;
    }
}
