import javax.swing.*;
import java.awt.*;

public class MakingChange {

     static JFrame framed;
     static JPanel mainPanel;
    RegisterPanel inputPanel;
    PursePanel imagePanel;

   // - - - - sets up the basic layout of the panel
    MakingChange()
    {

        // - - - sets up main frame
        framed = new JFrame("gui for purse program");
        framed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framed.setSize( 650, 600);   // - - - - sets the main panel

        // - - - sets up main panel that will hold img and input
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        mainPanel.setLayout(new GridLayout(2,0));

        // creates input
        inputPanel = new RegisterPanel();

        // - - -  adds input and main panel to frame
        mainPanel.add(inputPanel.getInputPanel());
        framed.add(mainPanel);

        // - - - messes with the visuals
        mainPanel.revalidate(); // resize and reposition
        framed.setVisible(true);

    }

    public static void main(String[] args) {
        MakingChange GUI = new MakingChange();
        mainPanel.add(GUI.inputPanel.getInput());

    }

}