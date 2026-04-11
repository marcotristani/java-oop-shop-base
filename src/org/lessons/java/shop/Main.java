package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // chiamo oggetto Prodotto, andando a chiamare costruttore e creando un istanza
        // personalizzata
        Prodotto prodotto1 = new Prodotto("gomma", "buona per cancellare", new BigDecimal(0.99), new BigDecimal(0.22));
        Prodotto prodotto2 = new Prodotto("matita", "non si rompre mai la punta", new BigDecimal(3.5),
                new BigDecimal(0.22));
        // Stampo tabella prodotti a schermo
        System.out.println("+----------PRODOTTO 1-------------+");
        System.out.println(prodotto1.esteseName());
        System.out.println(prodotto1.getDescription());
        System.out.println("Prezzo iniziale:" + prodotto1.getPrice());
        System.out.println("Prezzo ivato:" + prodotto1.getPriceIva());
        System.out.println("+------------------------------+");

        System.out.println("+----------PRODOTTO 2-------------+");
        System.out.println(prodotto2.esteseName());
        System.out.println(prodotto2.getDescription());
        System.out.println("Prezzo iniziale:" + prodotto2.getPrice());
        System.out.println("Prezzo ivato:" + prodotto2.getPriceIva());
        System.out.println("+------------------------------+");

    }

}
