package StudentTableProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends JFrame implements ActionListener{

    private Container con;
    private JLabel tlabel, fnlabel, lnlabel, phnlabel, cgpalabel;
    private JTextField fntf, lntf, phntf, cgpatf;
    private JButton update, clear, add, delete;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private String[] col={"FIRST NAME","LAST NAME","PHONE NUMBER","CGPA"};
    private String[] row=new String[4];

    StudentTable() {
        con = this.getContentPane();
        con.setLayout(null);
        //--------------label setup------------------
        tlabel = new JLabel("STUDENT INFORMATION");
        fnlabel = new JLabel("FIRST NAME");
        lnlabel = new JLabel("LAST NAME");
        phnlabel = new JLabel("PHONE NUMBER");
        cgpalabel = new JLabel("CGPA");

        tlabel.setBounds(360, 20, 150, 40);
        fnlabel.setBounds(20, 80, 100, 40);
        lnlabel.setBounds(20, 140, 100, 40);
        phnlabel.setBounds(20, 200, 100, 40);
        cgpalabel.setBounds(20, 260, 100, 40);

        con.add(tlabel);
        con.add(fnlabel);
        con.add(lnlabel);
        con.add(phnlabel);
        con.add(cgpalabel);
        //----------------------setup text area---------------

        fntf = new JTextField();
        lntf = new JTextField();
        phntf = new JTextField();
        cgpatf = new JTextField();

        fntf.setBounds(140, 80, 100, 40);
        lntf.setBounds(140, 140, 100, 40);
        phntf.setBounds(140, 200, 100, 40);
        cgpatf.setBounds(140, 260, 100, 40);

        con.add(fntf);
        con.add(lntf);
        con.add(phntf);
        con.add(cgpatf);

        //------------button setup---------
        add = new JButton("ADD");
        update = new JButton("UPDATE");
        delete = new JButton("DELETE");
        clear = new JButton("CLEAR");

        add.setBounds(260, 80, 100, 40);
        update.setBounds(260, 140, 100, 40);
        delete.setBounds(260, 200, 100, 40);
        clear.setBounds(260, 260, 100, 40);
        
        con.add(add);
        con.add(update);
        con.add(delete);
        con.add(clear);
        
        //---------table setup------------
        table=new JTable();
        
        model=new DefaultTableModel();
        model.setColumnIdentifiers(col);
        table.setModel(model);
        table.setSelectionBackground(Color.lightGray);
        table.setBackground(Color.PINK);
        
        scroll=new JScrollPane(table);
        scroll.setBounds(400, 80, 400,220);
        con.add(scroll);
        
        add.addActionListener(this);
        clear.addActionListener(this);
        delete.addActionListener(this);
        update.addActionListener(this);
        
       update.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                  int numberofrow=table.getSelectedRow();
                   String f_name=model.getValueAt(numberofrow, 0).toString();
                   String l_name=model.getValueAt(numberofrow, 1).toString();
                   String phn_name=model.getValueAt(numberofrow, 2).toString();
                   String cgpa_name=model.getValueAt(numberofrow, 3).toString();
               
                   fntf.setText(f_name);
                   lntf.setText(l_name);
                   phntf.setText(phn_name);
                   cgpatf.setText(cgpa_name);
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
       
       
      
       });
    }
    
        @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==add)
        {
            row[0]=fntf.getText();
            row[1]=lntf.getText();
            row[2]=phntf.getText();
            row[3]=cgpatf.getText();
            
            model.addRow(row);
            
            
            
        }
        else if(e.getSource()==clear)
        {
            fntf.setText("");
            lntf.setText("");
            phntf.setText("");
            cgpatf.setText("");
        }
        
        else if(e.getSource()==delete)
        {
            int numRow=table.getSelectedRow();
            if(numRow>=0)
            {
                model.removeRow(numRow);
            }
            else{
                JOptionPane.showMessageDialog(null,"Row not selected");
            }
        }
        else if(e.getSource()==update)
        {
            int numberofrow=table.getSelectedRow();
            String f_name=fntf.getText();
            String l_name=lntf.getText();
            String phn_name=phntf.getText();
            String cgpa_name=cgpatf.getText();
            
            model.setValueAt(f_name,numberofrow, 0);
            model.setValueAt(l_name,numberofrow, 1);
            model.setValueAt(phn_name,numberofrow, 2);
            model.setValueAt(cgpa_name,numberofrow, 3);
        }
        
        
    }

    public static void main(String[] args) {
        StudentTable frame = new StudentTable();
        frame.setVisible(true);
        frame.setBounds(10, 20, 880, 400);
        frame.setTitle("Student Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.PINK);
    }



}
