
package JOptionPane;

import javax.swing.JOptionPane;
public class showOptionDialog {
   public static void main(String[] args)
   {

       Object[] options = {"Yes, please","No, thanks","No eggs, no ham!"};
                    int n = JOptionPane.showOptionDialog(null,
                    "Would you like some green eggs to go "
                    + "with that ham?",
                    "A Silly Question",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);
}
}
