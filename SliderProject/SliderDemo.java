package SliderProject;

import java.awt.Color;
import java.awt.Container;
import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo extends JFrame implements ChangeListener {

    private Container con;
    private JLabel glabel, rlabel, blabel, previewlabel;
    private JTextField gfield, rfield, bfield;
    private JTextArea area;
    private JSlider rslider, gslider, bslider;

    SliderDemo() {
        simpleMethod();
    }

    public void simpleMethod() {
        con = this.getContentPane();
        con.setLayout(null);
        con.setBackground(Color.PINK);

        rlabel = new JLabel("RED");
        glabel = new JLabel("GREEN");
        blabel = new JLabel("BLUE");

        rlabel.setBounds(20, 20, 100, 40);
        glabel.setBounds(20, 80, 100, 40);
        blabel.setBounds(20, 140, 100, 40);

        con.add(rlabel);
        con.add(glabel);
        con.add(blabel);

        rslider = new JSlider(0,255,0);
        gslider = new JSlider(0,255,0);
        bslider = new JSlider(0,255,0);

        rslider.setBounds(120, 20, 100, 40);
        gslider.setBounds(120, 80, 100, 40);
        bslider.setBounds(120, 140, 100, 40);

        con.add(rslider);
        con.add(gslider);
        con.add(bslider);

        rfield = new JTextField();
        gfield = new JTextField();
        bfield = new JTextField();

        rfield.setBounds(260, 20, 100, 60);
        gfield.setBounds(260, 80, 100, 60);
        bfield.setBounds(260, 140, 100, 60);

        con.add(rfield);
        con.add(gfield);
        con.add(bfield);

        area = new JTextArea();
        area.setBounds(380, 20, 400, 180);
        area.setBackground(Color.DARK_GRAY);
        con.add(area);

        previewlabel = new JLabel("PREVIEW");
        previewlabel.setBounds(540, 205, 60, 20);
        con.add(previewlabel);

        rslider.addChangeListener(this);
        gslider.addChangeListener(this);
        bslider.addChangeListener(this);

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        int rv = rslider.getValue();
        int gv = gslider.getValue();
        int bv = bslider.getValue();

        rfield.setText(""+rv);
        gfield.setText(""+gv);
        bfield.setText(""+bv);
        
        Color color=new Color(rv,gv,bv);
        area.setBackground(color);
    }

    public static void main(String[] args) {
        SliderDemo frame = new SliderDemo();
        frame.setVisible(true);
        frame.setTitle("SLIDER DEMO");
        frame.setBounds(20, 20, 820, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
