package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        // chiamo oggetto Prodotto, andando a chiamare costruttore e creando un istanza
        // personalizzata
        Prodotto prodotto1 = new Prodotto("gomma", "buona per cancellare", 0.99f, 22);
        Prodotto prodotto2 = new Prodotto("matita", "non si rompre mai la punta", 3.50f, 22);
        // Stampo tabella prodotti a schermo
        System.out.println("+----------PRODOTTO 1-------------+");
        System.out.println(prodotto1.esteseName());
        System.out.println(prodotto1.description);
        System.out.println("Prezzo iniziale:" + prodotto1.priceBasic());
        System.out.println("Prezzo ivato:" + prodotto1.priceIva());
        System.out.println("+------------------------------+");

        System.out.println("+----------PRODOTTO 2-------------+");
        System.out.println(prodotto2.esteseName());
        System.out.println(prodotto2.description);
        System.out.println("Prezzo iniziale:" + prodotto2.priceBasic());
        System.out.println("Prezzo ivato:" + prodotto2.priceIva());
        System.out.println("+------------------------------+");

    }

}
