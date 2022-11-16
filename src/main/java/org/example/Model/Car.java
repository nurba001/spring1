package org.example.Model;

import org.example.ner.Veihcal;
import org.springframework.stereotype.Component;

@Component()
public class Car implements Veihcal {
    private  String mark;
    private String producedCountry;

    public void myInit(){
        System.out.println("Started init");
    }
    public  void destroy(){
        System.out.println("destroy started");
    }
    public Car(String mark, String producedCountry) {
        this.mark = mark;
        this.producedCountry = producedCountry;
    }

    public Car() {
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

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", producedCountry='" + producedCountry + '\'' +
                '}';
    }
}
