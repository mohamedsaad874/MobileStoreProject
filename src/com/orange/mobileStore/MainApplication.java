package com.orange.mobileStore;


public class MainApplication {

    public static void main(String[] args) {
        Store store = new Store();

        Tablet tablet1 = new Tablet();

        tablet1.setModel("Samsung Galaxy Tab S6");
        tablet1.setPrice(10034D);
        tablet1.setCompanyName("Samsung");
        store.addTabletToStore(tablet1);

        Tablet tablet2 = new Tablet();
        tablet2.setModel("Asus ZenPad 3S 10");
        tablet2.setPrice(10230D);
        tablet2.setCompanyName("Asus");
        store.addTabletToStore(tablet2);

        Tablet tablet3 = new Tablet();
        tablet3.setModel("Lenovo Yoga Tab 3 Pro");
        tablet3.setPrice(30000D);
        tablet3.setCompanyName("Lenovo");
        store.addTabletToStore(tablet3);

        Tablet tablet4 = new Tablet();
        tablet4.setModel("Huawei MediaPad M5 8.4");
        tablet4.setPrice(50000D);
        tablet4.setCompanyName("Huawei");
        store.addTabletToStore(tablet4);

        store.sellTablet("Samsung Galaxy Tab S6");
    }

    }

