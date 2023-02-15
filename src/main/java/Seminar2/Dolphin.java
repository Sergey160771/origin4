package Seminar2;

public class Dolphin extends Predator implements Swimable {

    public Dolphin(String nickname) {
        super (nickname);
    }


    public String toString() {
        return "I'm dolphin. " + super.toString () + " .I speak "+ say() + ".I eat "
                + feed() + ". My speed is swimming " + speedOfSwimming ();
    }

    @Override
    public String say() {
        return "Fu-fu";
    }

    @Override
    public int speedOfSwimming() {
        return 15;
    }
}

