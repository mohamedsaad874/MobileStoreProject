package com.orange.mobileStore;

import java.util.ArrayList;

public class MobileStore {

    public static void main(String[] args) {
        MobileStore store = new MobileStore();

        ArrayList<Phone> phones = new ArrayList<Phone>();
        com.orange.mobileStore.Phone phone1 = new com.orange.mobileStore.Phone();
        phone1.setModel("Samsung Galaxy S7/Edge");
        phone1.setPrice(10000D);
        phone1.setCompanyName("Samsung");
        phones.add(phone1);

        phone1.setModel("iPhone 6");
        phone1.setPrice(12302D);
        phone1.setCompanyName("Apple");
        phones.add(phone1);

        phone1.setModel("Samsung Galaxy Note");
        phone1.setPrice(15330D);
        phone1.setCompanyName("Samsung");
        phones.add(phone1);

        phone1.setModel("Sony Xperia Z4");
        phone1.setPrice(16330D);
        phone1.setCompanyName("Sony");
        phones.add(phone1);

        ArrayList<Tablet> tablets = new ArrayList<>();
        com.orange.mobileStore.Tablet tablet1 = new com.orange.mobileStore.Tablet();

        tablet1.setModel("Samsung Galaxy Tab S6");
        tablet1.setPrice(10034D);
        tablet1.setCompanyName("Samsung");
        tablets.add(tablet1);

        tablet1.setModel("Asus ZenPad 3S 10");
        tablet1.setPrice(10230D);
        tablet1.setCompanyName("Asus");
        tablets.add(tablet1);

        tablet1.setModel("Lenovo Yoga Tab 3 Pro");
        tablet1.setPrice(30000D);
        tablet1.setCompanyName("Lenovo");
        tablets.add(tablet1);

        tablet1.setModel("Huawei MediaPad M5 8.4");
        tablet1.setPrice(50000D);
        tablet1.setCompanyName("Huawei");
        tablets.add(tablet1);





    }


}
