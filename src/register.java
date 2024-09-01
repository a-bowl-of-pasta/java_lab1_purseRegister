import java.util.Scanner;
import java.text.DecimalFormat;
/*
this file is pretty much all done, just needs to be tested
TODO : finish the purse.java methods
TODO : finish to string method
TODO : finish the other methods
TODO : test and debug
TODO : final testing and debugging
 */

public class register {

    static purse makeChange(double amt)
    {
        // - - - - names & value of bills / coins
        String[] dollaDollaBillz =
                {
                        "hundred", "fifty", "twenty", "ten", "one",
                        "quarter", "dime", "nickle", "penny"
                };
        double[] ddbVal =
                {
                        100.00, 50.00, 20.00, 10.00,
                        1.00, 0.25, 0.10, 0.05, 0.01
                };
        // - - - - -
        purse obj = new purse();

            int multiplier;
            double temp;
            // - - - - logic that finds number of bills / coins
            for(int i =0; i < 9; i++)
            {
                multiplier = 0;
                temp = 0.0;

                // - - -  if the amt given can be broke up into X bills / coins
                if(amt / ddbVal[i] >= 1)
                {

                    temp = amt / ddbVal[i];
                    multiplier = (int) temp;
                    Denomination den;

                    // - - - 0 - 4 = bills 4 - 8 = coins
                    if(i <= 4 )
                        den = new Denomination(dollaDollaBillz[i], ddbVal[i], "bill", dollaDollaBillz[i]);
                    else
                        den = new Denomination(dollaDollaBillz[i], ddbVal[i], "coin", dollaDollaBillz[i]);

                    obj.add(den, multiplier);

                    amt-= multiplier * ddbVal[i];
                }

            }
                return obj;
    }

    public static void main(String [] args) {
        // - - - imports and variable
        Scanner inp = new Scanner(System.in);
        DecimalFormat niceNneat = new DecimalFormat("0.00");
        boolean cont;
        // - - -
        do {
            double THE_BAG = 0.0;

            // - - - usr input
            System.out.print("PUT THE MONEY IN THE BAG!!! :: ");
            THE_BAG = Double.parseDouble(niceNneat.format(inp.nextDouble()));

            // - - -  the program logic
           purse changedPurse = makeChange(THE_BAG);
           changedPurse.makeString();

            // - - - - - run program again
            System.out.print("\ndo it again ?!?!?!??!?! <y/n> :: ");
            String checker = inp.next();
            if(checker.equalsIgnoreCase("y")){
                cont = true;
                System.out.println("\n- - - - - - - - - - - - - ");
            }else{
                cont = false;
            }

        }while(cont);
    }

}
