
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class PursePanel extends JPanel{

    purse pp;
    JPanel imgPanel = new JPanel();


    PursePanel(purse pp){
        this.pp = pp;
        imgPanel.setLayout(new GridLayout(2,6));
        String[] locations = pp.getImgName();
        for(Denomination vals : pp.cash.keySet()){
            JTextField numOf = new JTextField();
            numOf.setText("" + pp.cash.get(vals) + " " + vals.name());
            imgPanel.add(numOf);
        }

        for(int i =0; i < locations.length; i++){

            ImageIcon pictures = new ImageIcon(locations[i]);
            Image reScaling = pictures.getImage();
            Image Scaled = reScaling.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon betterSize = new ImageIcon(Scaled);
            JLabel pics = new JLabel(betterSize);
            imgPanel.add(pics);
        }




    }
    PursePanel(JTextField ERROR){

        imgPanel.add(ERROR);
    }


    public JPanel getImagePanel(){
        return imgPanel;
    }
}
