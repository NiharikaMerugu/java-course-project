package employee;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import niha.Swing;

public class ExitEmployee implements ActionListener{

    JFrame f;
    JButton b1;

    public ExitEmployee(){
        f=new JFrame("Display Details");
        f.setBackground(Color.green);
        f.setLayout(null);

      

        b1=new JButton("Exit");
        b1.setBounds(240,150,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        f.add(b1);

       
        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
           Swing obj=new Swing();
        }
       

    }

   }