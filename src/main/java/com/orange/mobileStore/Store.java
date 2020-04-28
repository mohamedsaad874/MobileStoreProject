package com.orange.mobileStore;

import java.util.List;

public class Store {
    private List<Phone> phones;
    private List<Tablet> tablets;

    public void addPhonesToStore(Phone phone) {
        phones.add(phone);
    }

    public void addTabletToStore(Tablet tablet) {tablets.add(tablet);}

}