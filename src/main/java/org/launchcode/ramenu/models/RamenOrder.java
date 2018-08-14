package org.launchcode.ramenu.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RamenOrder {

    @Id
    @GeneratedValue
    private int id;

    private String details;

    private Float total;

    public RamenOrder() {
    }

    public  RamenOrder(String details, Float total) {
        this.details = details;
        this.total = total;

    }

    public int getId() {
        return id;
    }

    public String getDetails() {

        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }





}
