package org.example.ner;

public class Motor implements Veihcal {
    private String mark;
    private String producedCountry;


    public Motor(String mark, String producedCountry) {
        this.mark = mark;
        this.producedCountry = producedCountry;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getProducedCountry() {
        return producedCountry;
    }

    public void setProducedCountry(String producedCountry) {
        this.producedCountry = producedCountry;
    }
}
