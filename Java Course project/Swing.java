package niha;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import employee.*;

public class Swing implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6;

    public Swing(){
        f=new JFrame("Employee Details");
        f.setBackground(Color.pink);
        f.setLayout(null);

        l1=new JLabel("WELCOME");
        l1.setBounds(730,300,270,170);
        l1.setFont(new Font("serif",Font.BOLD,35));
        f.setLayout(null);
        f.add(l1);
        f.setSize(5000,5000);
        f.setVisible(true);

        l2=new JLabel("choose the following options");
        l2.setBounds(700,360,450,150);
        l2.setFont(new Font("serif",Font.BOLD,25));
        f.setLayout(null);
        f.add(l2);
        f.setSize(5000,5000);
        f.setVisible(true);


        b1=new JButton("Add");
        b1.setBounds(600,500,70,70);
        b1.addActionListener(this);
        f.setLayout(null);
        f.add(b1);
        f.setSize(300,400);
        f.setVisible(true);


        b2=new JButton("Remove");
        b2.setBounds(700,500,80,70);
        b2.addActionListener(this);
        f.setLayout(null);
        f.add(b2);
        f.setSize(300,400);
        f.setVisible(true);


        b3=new JButton("Edit");
        b3.setBounds(800,500,70,70);
        b3.addActionListener(this);
        f.setLayout(null);
        f.add(b3);
        f.setSize(600,400);
        f.setVisible(true);


        b4=new JButton("Display");
        b4.setBounds(900,500,100,70);
        b4.addActionListener(this);
        f.setLayout(null);
        f.add(b4);
        f.setSize(300,400);
        f.setVisible(true);



        
        b5=new JButton("Search");
        b5.setBounds(1050,500,100,70);
        b5.addActionListener(this);
        f.setLayout(null);
        f.add(b5);
        f.setSize(300,400);
        f.setVisible(true);



        b6=new JButton("Exit");
        b6.setBounds(1200,500,70,70);
        b6.addActionListener(this);
        f.setLayout(null);
        f.add(b6);
        f.setSize(300,400);
        f.setVisible(true);


       

}
public void actionPerformed(ActionEvent ae){

if(ae.getSource()==b1){
f.setVisible(false);
new AddEmployee();
}
if(ae.getSource()==b2){
f.setVisible(false);
new RemoveEmployee();
}
if(ae.getSource()==b3){
f.setVisible(false);
new EditEmployee();
}
if(ae.getSource()==b4){
f.setVisible(false);
new DisplayEmployee();
}
if(ae.getSource()==b5){
f.setVisible(false);
new SearchEmployee();
}
if(ae.getSource()==b6){
f.setVisible(false);
new ExitEmployee();
}
}
}


