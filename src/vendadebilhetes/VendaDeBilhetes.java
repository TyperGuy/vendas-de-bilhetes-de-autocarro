/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendadebilhetes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vendadebilhetes.view.MyButtonPanel;
import vendadebilhetes.view.MyJFrame;

/**
 *
 * @author Munda
 */
public class VendaDeBilhetes {

    /**
     * @param args the command line arguments
     */
    
    static JPanel contentPanel;
    static BoxLayout boxLayout;
    
    public static void main(String[] args) {
        // TODO code application logic here
        JButton b = new JButton();
        JLabel lb = new JLabel("Teste");
        contentPanel = new JPanel();
        boxLayout = new BoxLayout(contentPanel,BoxLayout.X_AXIS);
        
        
        contentPanel.setLayout(boxLayout);
       // contentPanel.setBounds(150, 200, 150, 200);
      // contentPanel.setSize(1200, 700);
        
        
        MyButtonPanel pn = new MyButtonPanel("Teste");
        
        MyJFrame frame = new MyJFrame(1200,700);
        //frame.setLayout(null);
        //frame.setContentPane();
        for(int i =0;i<4;i++){
            contentPanel.add(Box.createRigidArea(new Dimension(60,60)));
            contentPanel.add(new JButton("Agora"));
            System.out.println("deu");
                    }
        
        frame.setContentPane(contentPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
