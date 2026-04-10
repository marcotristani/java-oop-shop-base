package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // definisco le proprietà,i campi, le variabili di istanza
    int code;
    String name;
    String description;
    float price;
    int iva;

    // definisco il costruttore
    public Prodotto(String name, String description, float price, int iva) {

        // chiamo oggetto random per farmi generare un numero random in seguito
        Random random = new Random();
        this.code = random.nextInt(9999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    // definisco metodi

    // metodo per esporre prezzo base
    public float priceBasic() {
        return this.price;
    }

    // metodo per esporre prezzo comprensivo di iva
    public float priceIva() {
        return (float) (this.price * (1 + this.iva / 100f));
    }

    // metodo per esporre nome esteso formattato
    public String esteseName() {
        return this.code + "-" + this.name;
    }
}
