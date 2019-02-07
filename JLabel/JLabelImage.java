/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JLabel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JLabelImage extends JFrame{
    
     private Container contain;
     private JLabel Imagelabel;
     private ImageIcon img;

    
    JLabelImage()
    {
        initContainer();
    }
    public void initContainer(){
        contain=this.getContentPane();
        contain.setLayout(null);
        contain.setBackground(Color.MAGENTA);
       
        img = new ImageIcon(getClass().getResource("image.png"));
        Imagelabel = new JLabel(img);
        Imagelabel.setBounds(40,40,img.getIconWidth(),img.getIconHeight());
         contain.add(Imagelabel);
    }
    
    public static void main(String[] args) {
        JLabelImage frame=new JLabelImage();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,600);
        frame.setTitle("developped amin");
    }
    
}
