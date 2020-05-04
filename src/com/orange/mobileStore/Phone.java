package com.orange.mobileStore;

public class Phone {
    private String companyname;
    private String model;
    private Double price;

    public String getCompanyName() {

        return this.companyname;
    }

    public void setCompanyName(String companyname) {
        this.companyname = companyname;

    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
