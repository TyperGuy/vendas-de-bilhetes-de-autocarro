/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendadebilhetes.view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Munda
 */
public class MyJFrame extends JFrame{
    
    private int width, height;
    private ImageIcon myIcon ;
    
    
  

  

    public MyJFrame(int width, int height) {
        this.width = width;
        this.height = height;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setMyIcon();
        this.setIconImage(getMyIcon());
        this.setTitle(" Venda de Bilhetes 1.0");
        
        
        
    }
    
      public Image getMyIcon() {
        return myIcon.getImage();
    }

    public void setMyIcon() {
        this.myIcon = new ImageIcon("C:\\Users\\Munda\\Documents\\NetBeansProjects\\VendaDeBilhetes\\src\\vendadebilhetes\\assets\\icons8_car_100px.png");
       
    }
   
    
}
