package MONEY;

import java.util.HashMap;

abstract class moneyContainer {
    // these are protected just in case the subclasses need them
    // they might become private
    protected String[] dollaDollaBillz =
            {
                    "hundred", "fifty", "twenty", "ten", "one",
                    "quarter", "dime", "nickel", "penny"
            };
    protected double[] ddbVal =
            {
                    100.00, 50.00, 20.00, 10.00,
                    1.00, 0.25, 0.10, 0.05, 0.01
            };

    public HashMap<Denomination, Integer> cash = new HashMap<Denomination, Integer>();

    // === remove from container, get value from container, add to container ===
    public double remove(){return 0;}
    public double getValue(){return 0;}
    public void add(Denomination obj, int amt){cash.put(obj, amt);}
    // === gets image path ===
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
    // === mass produces denominations ===
    public void denominationFactory(double amt) {
        int multiplier;
        double temp;
        // - - - - logic that finds number of bills / coins
        for (int i = 0; i < 9; i++) {
            multiplier = 0;
            temp = 0.0;
            // - - -  if the amt given can be broke up into X bills / coins
            if (amt / ddbVal[i] >= 1) {

                temp = amt / ddbVal[i];
                multiplier = (int) temp;
                Denomination den;

                // - - - 0 - 4 = bills 4 - 8 = coins
                if (i <= 4)
                    den = new Denomination(dollaDollaBillz[i], ddbVal[i], "bill", "src/currency/" + dollaDollaBillz[i] + ".png");
                else
                    den = new Denomination(dollaDollaBillz[i], ddbVal[i], "coin", "src/currency/" + dollaDollaBillz[i] + ".png");

                add(den, multiplier);

                amt -= multiplier * ddbVal[i];
            }
        }
    }

    // === required toString for each class ===
    public abstract String toString();
}
