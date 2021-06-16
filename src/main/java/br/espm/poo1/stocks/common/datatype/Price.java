package br.espm.poo1.stocks.common.datatype;

import java.math.BigDecimal;
import java.util.Date;

public class Price {
    private String id;
    private Stocks stocks;
    private Date date;
    private BigDecimal value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Stocks getStocks() {
        return stocks;
    }

    public void setStocks(Stocks stocks) {
        this.stocks = stocks;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
