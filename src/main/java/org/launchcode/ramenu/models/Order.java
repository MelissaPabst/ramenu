package org.launchcode.ramenu.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private int id;


    private String details;

    private float total;

    public Order() {
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public  Order(String details, float total) {
        this.details = details;
        this.total = total;

    }




}
