package JMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBarDemo extends JFrame implements ActionListener {

    private JMenuBar menubar;
    private JMenu file, edit, view;
    private JMenuItem openf, closef, newf, copye, paste, shortv, fullv;
    private ImageIcon newicon, cuticon;

    MenuBarDemo() {
        menubar = new JMenuBar();
        this.setJMenuBar(menubar);

        file = new JMenu("FILE");
        edit = new JMenu("EDIT");
        view = new JMenu("VIEW");

        menubar.add(file);
        menubar.add(edit);
        menubar.add(view);

        newf = new JMenuItem("NEW");
        openf = new JMenuItem("OPEN");
        closef = new JMenuItem("CLOSE");
        copye = new JMenuItem("COPY");
        paste = new JMenuItem("PASTE");
        shortv = new JMenuItem("SHORT_VIEW");
        fullv = new JMenuItem("FULL_VIEW");

        file.add(newf);
        file.addSeparator();
        file.add(openf);
        file.addSeparator();
        file.add(closef);
        file.addSeparator();
        edit.add(copye);
        edit.add(paste);
        view.add(shortv);
        view.add(fullv);

        newicon = new ImageIcon("src/images/new.png");
        cuticon =new ImageIcon("src/images/cut.png");
        
        newf.setIcon(newicon);
        newf.addActionListener(this);
        //---------key shortcut----------
        newf.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        copye.setIcon(cuticon);
        closef.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newf) {
            JFrame newFile = new JFrame();
            newFile.setVisible(true);
            newFile.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newFile.setBounds(40, 40, 200, 300);
            newFile.setTitle("New FIle");

        } else if (e.getSource() == closef) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        MenuBarDemo frame = new MenuBarDemo();
        frame.setVisible(true);
        frame.setTitle("MENUBAR");
        frame.setBounds(20, 20, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
