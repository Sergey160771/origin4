package Seminar2;

public class Dog extends Predator implements Runable {

    public Dog(String nickname) {
        super (nickname);
    }

    public String toString() {
        return "I'm dog. " + super.toString () + " .I speak "+ say()+".I eat "
                + feed() + ". My speed is " + speedOfRun ();
    }

    public String say() {
        return "gav-gav";
    }

    @Override
    public int speedOfRun() {
        return 20;

    }
}