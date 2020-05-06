package com.orange.mobileStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private  List<Phone> phones;
    private List<Tablet> tablets;


    public static void sellPhone(String Model) {

    }

    public static void sellTablet(String Model) {
        ArrayList<Tablet> tablets = new ArrayList<>();
        Tablet tablet1 = new Tablet();

        tablet1.setModel("Samsung Galaxy Tab S6");
        tablet1.setPrice(10034D);
        tablet1.setCompanyName("Samsung");
        tablets.add(tablet1);

        Tablet tablet2 = new Tablet();
        tablet2.setModel("Asus ZenPad 3S 10");
        tablet2.setPrice(10230D);
        tablet2.setCompanyName("Asus");
        tablets.add(tablet2);

        Tablet tablet3 = new Tablet();
        tablet3.setModel("Lenovo Yoga Tab 3 Pro");
        tablet3.setPrice(30000D);
        tablet3.setCompanyName("Lenovo");
        tablets.add(tablet3);

        Tablet tablet4 = new Tablet();
        tablet4.setModel("Huawei MediaPad M5 8.4");
        tablet4.setPrice(50000D);
        tablet4.setCompanyName("Huawei");
        tablets.add(tablet4);
        for(int i = 0; i < tablets.size(); i++)
        {
            if (Model.equals(tablet1)){
            System.out.println(tablet1+ " - is of type " + "audio");
        }else {
                System.out.println("no found");
            }
        }

    }




    public void addPhonesToStore(Phone phone) {
        phones.add(phone);
    }

    public void addTabletToStore(Tablet tablet) {tablets.add(tablet);}



}