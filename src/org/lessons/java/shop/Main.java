package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        // chiamo oggetto Prodotto, andando a chiamare costruttore e creando un istanza
        // personalizzata
        Prodotto prodotto = new Prodotto("gomma", "buona per cancellare", 0.99f, 22);
        // Stampo i valori ottenuti a schermo
        System.out.print(prodotto.code);
        System.out.print(prodotto.name);
        System.out.println(prodotto.description);
        System.out.println(prodotto.price);
        System.out.println(prodotto.iva);

        // Stampo i valori ottenuti dai metodi
        System.out.println(prodotto.priceBasic());
        System.out.println(prodotto.priceIva());
        System.out.println(prodotto.esteseName());

    }

}
