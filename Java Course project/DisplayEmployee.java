package employee;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import niha.Swing;

public class DisplayEmployee implements ActionListener{

    JFrame f;
    JTextField t1;
    JLabel l1;
    JButton b1,b2;

    public DisplayEmployee(){
        f=new JFrame("Display Details");
        f.setBackground(Color.green);
        f.setLayout(null);

        l1=new JLabel("Employee Id to Display");
        l1.setVisible(true);
        l1.setBounds(40,60,450,30);
        l1.setForeground(Color.BLACK);
        Font F1 = new Font("serif",Font.BOLD,30);
        l1.setFont(F1); 
        f.add(l1);


        t1=new JTextField();
        t1.setBounds(400,60,450,30);
        f.add(t1);

        b1=new JButton("Search");
        b1.setBounds(240,150,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        f.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        f.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            Swing obj=new Swing();
        }
        if(ae.getSource()==b2){
            Swing obj=new Swing();
        
        }

    }

   }