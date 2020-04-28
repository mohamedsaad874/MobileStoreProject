package com.orange.mobileStore;

import java.util.List;

public class Store {
    private List<Phone> phones;
    private List<Tablet> tablets;
    private int phone;
    private int tablet;

    public void addPhonesToStore(Phone phone) {
        phones.add(phone);
    }

    public void addTabletToStore(Tablet tablet) {tablets.add(tablet);}

    public int sellPhone(int phone ) {

        return phone;
    }
    public int sellTablet(int tablet) {

        return tablet;
    }
    }