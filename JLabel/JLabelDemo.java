
package JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo extends JFrame {
    
    private Container contain;
    private JLabel userLabelFirst,userlabelSecond;
    private Font font;
    
    JLabelDemo()
    {
        initContainer();
    }
    public void initContainer(){
        
        font=new Font("arial",Font.ITALIC,18);
        
        contain=this.getContentPane();//for backgroud.
        contain.setLayout(null);
        contain.setBackground(Color.MAGENTA);
        userLabelFirst=new JLabel();
        userLabelFirst.setText("hello amin");
        userLabelFirst.setFont(font);
        userLabelFirst.setBounds(30,40,100,50);
        userLabelFirst.setForeground(Color.red);
        userLabelFirst.setOpaque(true);
        userLabelFirst.setBackground(Color.GREEN);
        //--------------settextToolTips-----------
        userLabelFirst.setToolTipText("welcome");
        
       
        contain.add(userLabelFirst);
        
        String s=userLabelFirst.getToolTipText();
        System.out.println(" "+s);
        
        //second userlabel
        
        userlabelSecond = new JLabel("this is noakhali");
        userlabelSecond.setBounds(30, 100, 200,100);
        userlabelSecond.setFont(font);
        contain.add(userlabelSecond);
      
    }
    
    
    public static void main(String[] args) {
        JLabelDemo frame=new JLabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,500);
        frame.setTitle("developped amin");
        
    }
    
}
