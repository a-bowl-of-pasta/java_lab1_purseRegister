package MONEY;

public class purse extends moneyContainer {


    // - - - returns a string array holding the image path
    public String toString() {

        String readableFormat = "";
        for (Denomination values : cash.keySet()) {
            readableFormat += cash.get(values) + " " + values.name() + "\n";
        }
        return readableFormat;
    }

}


