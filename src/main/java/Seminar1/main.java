package Seminar1;

public class main {

    public static void main(String[] args) {

        WendingMachine store=new WendingMachine ();

        store.addProduct (new Product ("Lays", 123.45))
                .addProduct (new Product ("Fanta", 55.76))
                .addProduct (new Product ("Cola", 55.76))
                .addProduct (new Product ("nuts", 30.80))
                .addProduct (new CursedProducts ("milk", 65.80, 7))
                .addProduct (new Beer ("alcohol free", 67.89))
                .addProduct (new Beer ("notbeer", 67.89, 99))
                .addProduct (new Fish ("vobla", 200.50, "dried"))
                .addProduct (new Fish ("bream", 150.30, "smoked"));

        System.out.println (store);

        System.out.println ("searching for ay's");
        System.out.println (store.findProduct ("ys"));

        System.out.println ("buying Lay's");
        store.buy ("Lays", 123.45);
        System.out.println (store);

        System.out.println ("buying fan's");
        store.buy ("fan", 43.21);
        System.out.println (store);

        System.out.println ("buying a's");
        store.buy ("Cola", 55.76);
        System.out.println (store);

        System.out.println ("buying a's");
        store.buy ("milk", 65.80);
        System.out.println (store);

        System.out.println ("buying a's");
        store.buy ("alcohol free", 67.89);
        System.out.println (store);

        System.out.println ("buying a's");
        store.buy ("bream",150.30 );
        System.out.println (store);

    }
}

