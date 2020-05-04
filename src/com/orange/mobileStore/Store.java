package com.orange.mobileStore;

import java.util.List;

public class Store {
    private List<Phone> phones;
    private List<Tablet> tablets;
    private int phone;
    private int tablet;
    private double price;


    public void addPhonesToStore(Phone phone) {
        phones.add(phone);
    }

    public void addTabletToStore(Tablet tablet) {tablets.add(tablet);}

    public Store( int tabletIn,int phoneIn, double priceIn) {
        phone = phoneIn;
        tablet = tabletIn;
        price = priceIn;

    }

        public double sellPhone(int phoneIn) {

            while (phoneIn < 0 || phoneIn > phone) {
                return -0.0;

            }
            if(phoneIn < phone) {

                this.phone = this.phone - phoneIn;

                double totalPrice = phoneIn * this.price;

                return totalPrice;

            }  else {

                return 0.0;

            }

        }


    public double sellTablet(int tabletIn) {
        while (tabletIn < 0 || tabletIn > tablet) {
            return -0.0;

        }
        if(tabletIn < tablet) {

            this.tablet = this.tablet - tabletIn;

            double totalPrice = tabletIn * this.price;

            return totalPrice;

        }  else {

            return 0.0;

        }
    }
    public void setPrice(double priceIn) {
        this.price = priceIn;
    }
    public int getPhone() {
        return this.phone;

    }
    public int getTablet() {
        return this.tablet;

    }
    public double getPrice() {
        return this.price;
    }
    }