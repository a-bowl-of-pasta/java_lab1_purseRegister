import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class MakingChange {

    JFrame framed;
    RegisterPanel pan;

    //TODO :: finish that video on how to use layout manegers correctly


    MakingChange() // basic layout
    {

        framed = new JFrame("gui for purse program");
        framed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framed.setSize( 450, 400);
        pan = new RegisterPanel();

        framed.add(pan.getPan());
        framed.setVisible(true);

    }

    public static void main(String[] args) {
        MakingChange GUI = new MakingChange();
        GUI.pan.getInput();
    }

    public void deeestroyWindow() // closes the window
    {
        framed.dispatchEvent(new WindowEvent(framed, WindowEvent.WINDOW_CLOSING));
    }

}

class RegisterPanel extends JPanel{

    register logic = new register();
    JPanel mainPanel;
    JPanel imgPanel;
    JPanel inputPanel;
    JTextField input;
    String txtInp;
    JButton sender = new JButton("Send");
    inputHandler iman = new inputHandler();

    RegisterPanel()
    {
        // - - - - sets the main panel
       mainPanel = new JPanel();
       mainPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
       mainPanel.setLayout(new GridLayout(2,0));

       // - - - - sets the input panel
       inputPanel = new JPanel();
       inputPanel.setLayout(new GridLayout(2,0));
       input = new JTextField();
       input.setPreferredSize(new Dimension(100, 50));
       inputPanel.add(input);
       inputPanel.add(sender);

       // - - - - sets the image panel
       imgPanel = new JPanel();
       setLayout(new GridLayout(0,10));

       // - - - - adds the other panels to the main one
       mainPanel.add(inputPanel);
       mainPanel.add(imgPanel);
       mainPanel.revalidate();
       mainPanel.repaint();
    }

    public void getInput(){
        sender.addActionListener(iman);
    }

    public class inputHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String txtInp = input.getText();
            JTextField displayInp = new JTextField(txtInp);
            imgPanel.add(displayInp);
            mainPanel.revalidate();
            mainPanel.repaint();
        }
    }


    public JPanel getPan(){return mainPanel;}

}