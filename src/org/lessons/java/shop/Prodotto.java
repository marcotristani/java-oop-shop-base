package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    // definisco le proprietà,i campi, le variabili di istanza
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    // definisco i costruttore

    // Costruttore di default con valori vuoti
    public Prodotto() {

        // chiamo oggetto random per farmi generare un numero random in seguito
        Random random = new Random();
        this.code = random.nextInt(9999);
        this.name = "Prodotto senza nome";
        this.description = "Prodotto senza descrizione";
        this.price = BigDecimal.ZERO;
        this.iva = BigDecimal.ZERO;
    }

    // costruttore che richiede valori per le variabili di istanza
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

    // METODI GETTER E SETTER

    // metodo getter per codice
    public int getCode() {
        return this.code;
    }

    //
    // metodo getter per nome
    public String getName() {
        return this.name;
    }

    // metodo setter per nome
    public void setName(String name) {
        this.name = name;
    }

    //
    // metodo getter per description
    public String getDescription() {
        return this.description;
    }

    // metodo setter per nome
    public void setDescription(String description) {
        this.description = description;
    }

    //
    // metodo getter per description
    public BigDecimal getPrice() {
        return this.price;
    }

    // metodo setter per nome
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    //
    // metodo getter per description
    public BigDecimal getIva() {
        return this.iva;
    }

    // metodo setter per nome
    public void setIva(BigDecimal iva) {
        this.price = iva;
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
