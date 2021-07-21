/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendadebilhetes.view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Munda
 */
public class MyButtonPanel extends JPanel{

    private JLabel tag;

   
    public MyButtonPanel(String Title) {
       this.setSize(250, 250);
       
       setTag(Title);
       this.setBackground(Color.yellow);
      
    }
    
     public JLabel getTag() {
        return tag;
    }

    public void setTag(String Tag) {
        this.tag = new JLabel();
       // this.tag.setSize(250, 250);
        this.tag.setText(Tag);
        this.add(tag);
    }
    
    
}
