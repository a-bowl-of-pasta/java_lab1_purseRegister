import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {

        // - - - logic and display classes
        register logic = new register();
        PursePanel imagePanel;

        // - - - user input field
        JTextField input;
        String txtInp;
        JButton sender = new JButton("Send");

        // - - - panel and input manager implementation
        JPanel inputPanel;
        inputHandler iman = new inputHandler();

        // - - - sets up the general layout of the panel
        RegisterPanel()
        {

            //- - - - sets up the JPanel
            inputPanel = new JPanel();
            inputPanel.setLayout(new GridLayout(2,0));
            //- - - - sets up the text field
            input = new JTextField();
            input.setPreferredSize(new Dimension(100, 50));
            //- - - - adds the textField to the input panel
            inputPanel.add(input);
            inputPanel.add(sender);

        }
        // - - - callable function for getting input
        public void getInput(){
            sender.addActionListener(iman);
        }

        // - - - - does the action event to manipulate data
        public class inputHandler implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String txtInp = input.getText();

                try // - - - creates image panel with user input
                {
                    double send = Double.parseDouble(txtInp);
                    purse recieved = logic.makeChange(send);
                    imagePanel = new PursePanel(recieved);

                }catch(NumberFormatException nf) // - - - creates image panel with error screen 
                {
                    JTextField ERROR_SCREEN =  new JTextField(txtInp);
                    ERROR_SCREEN.setPreferredSize(new Dimension(315, 100));
                    ERROR_SCREEN.setText("ERROR, PLEASE ENTER A DOLLAR AMOUNT #.##");
                    imagePanel = new PursePanel(ERROR_SCREEN);
                }
            }
        }

        // - - - returns the final image panel
        public PursePanel getImgPanel()
        {
            return imagePanel;
        }
    }