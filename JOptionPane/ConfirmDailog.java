
package JOptionPane;

import javax.swing.JOptionPane;

public class ConfirmDailog {
    public static void main(String[] args){
    
        int choice;
        choice = JOptionPane.showConfirmDialog(null,"what do you want ","amin developer", JOptionPane.YES_NO_OPTION);
 
        
        if(choice==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "good boy");
        }
    
    }
}
