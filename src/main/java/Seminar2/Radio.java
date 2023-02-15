package Seminar2;

public class Radio implements Sayable {


    public String say(){
       return "HiHiHi";
    }
    public String toString() {
        return "I'm radio. " + super.toString () + " .I speak "+ say();
    }
}
