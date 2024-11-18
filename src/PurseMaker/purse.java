package PurseMaker;

import java.util.HashMap;

public class purse {

    HashMap<Denomination, Integer> cash = new HashMap<Denomination, Integer>();

   public void add(Denomination obj, int amt){cash.put(obj, amt);}

    // - - - returns a string array holding the image path
    public String[] getImgName()
    {
       String[] imageLocations = new String[cash.size()];
       int i = 0;
       for(Denomination values : cash.keySet()){
           imageLocations[i] = values.img();
           i++;
       }

    return imageLocations;
    }
    public String makeString(){

       String readableFormat = "";
       for(Denomination values : cash.keySet()){
           readableFormat +=  cash.get(values)+ " " + values.name() + "\n";
       }

       return readableFormat;
    }

    public double remove(){return 0;}

    public double getValue(){return 0;}
}
