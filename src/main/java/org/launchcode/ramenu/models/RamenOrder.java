package org.launchcode.ramenu.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RamenOrder {

    @Id
    @GeneratedValue
    private int id;

    private String broth;

    private String noodle;

    private String topping;

    private Float total;

    public RamenOrder() {
    }

    public  RamenOrder(String broth, String noodle, String topping, Float total) {
        this.broth = broth;
        this.noodle = noodle;
        this.topping = topping;
        this.total = total;

    }

    public int getId() {
        return id;
    }

    public String getBroth() {
        return broth;
    }

    public void setBroth(String broth) {
        this.broth = broth;
    }

    public String getNoodle() {
        return noodle;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }


    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }





}
