package com.orange.mobileStore;

import java.util.List;

public class Store {
    private  List<Phone> phones;
    private List<Tablet> tablets;


    public  void sellPhone(String Model) {

    }

    public void sellTablet(String tabletModel) {
   for(int i = 0; i < this.tablets.size(); i++)
   { Tablet tablet = this.tablets.get(i);

if (tabletModel.equals(tablet.getModel())){
removeTabletFromStore(tablet);
    System.out.println("sss");
}
   }
            }




    public List<Tablet> getAllTablets(){
  return this.tablets;
}






    public void addPhonesToStore(Phone phone) {
        phones.add(phone);
    }

    public void addTabletToStore(Tablet tablet) {tablets.add(tablet);}
    private void removeTabletFromStore(Tablet tablet) { tablets.remove(tablet);
    }


}