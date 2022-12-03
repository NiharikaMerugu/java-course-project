package employee;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import niha.Swing;

public class RemoveEmployee implements ActionListener{
    JFrame f;
    JTextField t1;
    JLabel l1;
    JButton b1,b2;

     public RemoveEmployee(){
        f=new JFrame("Removal of Employee Details");
        f.setBackground(Color.green);   
        f.setLayout(null);
     
        l1=new JLabel("Employee Id");
        l1.setBounds(50,50,250,30);
        l1.setFont(new Font("serif",Font.BOLD,35));
        l1.setLayout(null);
        f.add(l1);
        f.setSize(5000,5000);
        f.setVisible(true);
        

        t1=new JTextField();
        t1.setBounds(250,50,150,30);
        f.add(t1);


       

        b1=new JButton("Remove");
        b1.setBounds(120,300,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        f.add(b1);


        b2=new JButton("Cancel");
        b2.setBounds(300,300,100,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        f.add(b2);
       
        
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