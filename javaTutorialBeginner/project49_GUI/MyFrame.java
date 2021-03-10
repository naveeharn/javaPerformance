package javaTutorialBeginner.project49_GUI;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame{

    private String nameTitle;
    
    MyFrame(){
        // JFrame frame = new JFrame();

        this.setTitle("JFrame Example");                               //creates a frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //sets title of frame
        this.setResizable(false);                                      //prevent frame from being resized
        this.setSize(720, 720);                                        //sets the x-dimension, y-dimension of frame
        this.setVisible(true);                                         //make frame visible
        
        ImageIcon imageIcon = new ImageIcon("javaTutorialBeginner/project49_GUI/globe.png");    //create an ImageIcon

        this.setIconImage(imageIcon.getImage());                       //Change Icon of frame
        this.getContentPane().setBackground(new Color(112, 34, 211));
    }

    MyFrame(String nameTitle) {
        // super(nameTitle);
        this.setTitle(nameTitle); 
        // this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //sets title of frame
        this.setResizable(false);                                      //prevent frame from being resized
        this.setSize(720, 720);                                        //sets the x-dimension, y-dimension of frame
        this.setVisible(true);                                         //make frame visible
        
        ImageIcon imageIcon = new ImageIcon("javaTutorialBeginner/project49_GUI/globe.png");    //create an ImageIcon

        this.setIconImage(imageIcon.getImage());                       //Change Icon of frame
        this.getContentPane().setBackground(new Color(112, 34, 211));
    }
}
