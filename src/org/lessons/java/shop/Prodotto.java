package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    // definisco le proprietà,i campi, le variabili di istanza
    int code;
    String name;
    String description;
    BigDecimal price;
    BigDecimal iva;

    // definisco il costruttore
    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva) {

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
    public BigDecimal getPriceBasic() {
        return this.price;
    }

    // metodo per esporre prezzo comprensivo di iva
    public BigDecimal getPriceIva() {
        if (this.price != null && this.iva != null) {
            return this.price.add(this.price.multiply((iva))).setScale(2, RoundingMode.DOWN);
        } else {
            return null;
        }
    }

    // metodo per esporre nome esteso formattato
    public String esteseName() {
        return this.code + "-" + this.name;
    }
}
