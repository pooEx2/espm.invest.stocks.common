package br.espm.poo1.stocks.common.datatype;

import java.math.BigDecimal;
import java.util.Date;

public class Stocks {

    private String id;
    private String symbol;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
