
package JOptionPane;

import javax.swing.JOptionPane;

public class showInputDialog {
    public static void main(String[] args)
    {
        String firstName=JOptionPane.showInputDialog("Enter your first name:");
        String lastName=JOptionPane.showInputDialog("Enter your last name");
        String Name=firstName+" "+lastName;
        JOptionPane.showMessageDialog(null,"your name is : "+ Name,"developed by amin", -1);
    }
}
