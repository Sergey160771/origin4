package Seminar2;

public class Duck extends Herbivores implements Flyable, Runable, Swimable {


    public Duck(String nickname) {
        super (nickname);
    }



    public String toString() {
        return "I'm duck. " + super.toString () +" .I speak "+ say() +".I eat "
                + feed() + ". My speed is " +
                speedOfRun () + ", speed of fly " + speedOfFly () +
                ". My speed is swimming " + speedOfSwimming ();
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public String say() {
        return "Krya-krya";
    }

    @Override
    public int speedOfSwimming() {
        return 8;
    }
    @Override
    public int speedOfFly() {
        return 50;
    }
}


