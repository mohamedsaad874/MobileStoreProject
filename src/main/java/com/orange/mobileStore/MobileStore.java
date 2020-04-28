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

        com.orange.mobileStore.Phone phone2 = new com.orange.mobileStore.Phone();
        phone2.setModel("iPhone 6");
        phone2.setPrice(12302D);
        phone2.setCompanyName("Apple");
        phones.add(phone2);

        com.orange.mobileStore.Phone phone3 = new com.orange.mobileStore.Phone();
        phone3.setModel("Samsung Galaxy Note");
        phone3.setPrice(15330D);
        phone3.setCompanyName("Samsung");
        phones.add(phone3);

        com.orange.mobileStore.Phone phone4 = new com.orange.mobileStore.Phone();
        phone4.setModel("Sony Xperia Z3");
        phone4.setPrice(16330D);
        phone4.setCompanyName("Sony");
        phones.add(phone4);

        ArrayList<Tablet> tablets = new ArrayList<>();
        com.orange.mobileStore.Tablet tablet1 = new com.orange.mobileStore.Tablet();

        tablet1.setModel("Samsung Galaxy Tab S6");
        tablet1.setPrice(10034D);
        tablet1.setCompanyName("Samsung");
        tablets.add(tablet1);

        com.orange.mobileStore.Tablet tablet2 = new com.orange.mobileStore.Tablet();
        tablet2.setModel("Asus ZenPad 3S 10");
        tablet2.setPrice(10230D);
        tablet2.setCompanyName("Asus");
        tablets.add(tablet2);

        com.orange.mobileStore.Tablet tablet3 = new com.orange.mobileStore.Tablet();
        tablet3.setModel("Lenovo Yoga Tab 3 Pro");
        tablet3.setPrice(30000D);
        tablet3.setCompanyName("Lenovo");
        tablets.add(tablet3);

        com.orange.mobileStore.Tablet tablet4 = new com.orange.mobileStore.Tablet();
        tablet4.setModel("Huawei MediaPad M5 8.4");
        tablet4.setPrice(50000D);
        tablet4.setCompanyName("Huawei");
        tablets.add(tablet4);





    }


}
