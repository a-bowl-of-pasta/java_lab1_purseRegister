import purseGui.MakingChange;
import java.util.Scanner;

public class Driver_main{


    public static void main(String[] args) {

        // haven't made the console version yet, only does GUI right now
        System.out.println("terminal or Gui < 1 || 2>");
        int choice = new Scanner(System.in).nextInt();

        if(choice == 1)
        {

        }else if(choice == 2)
        {
            MakingChange GUI = new MakingChange();
            GUI.mainPanel.add(GUI.inputPanel.getInput());
        }else
        {

        }

    }

}
