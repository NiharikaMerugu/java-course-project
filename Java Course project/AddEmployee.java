package employee;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import niha.Swing;

public class AddEmployee implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b1,b2;
    
        public AddEmployee(){
        f = new JFrame("Addition of Employee Details");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1=new JLabel("Add Employee Details");
        l1.setBounds(150,0,500,100);
        l1.setFont(new Font("serif",Font.BOLD,30));
        l1.setLayout(null);
        f.add(l1);
        f.setSize(5000,5000);
        f.setVisible(true);

    
 
        l2 = new JLabel("Name");
        l2.setBounds(50,150,100,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        l2.setLayout(null);
        f.add(l2);
        f.setSize(5000,5000);
        f.setVisible(true);

   

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        f.add(t1);

        l3= new JLabel("Father's Name");
        l3.setBounds(400,150,200,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        l3.setLayout(null);
        f.add(l3);
        f.setSize(5000,5000);
        f.setVisible(true);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        f.add(t2);

        l4= new JLabel("Age");
        l4.setBounds(50,200,100,30);
        l4.setFont(new Font("serif",Font.BOLD,20));
        l4.setLayout(null);
        f.add(l4);
        f.setSize(5000,5000);
        f.setVisible(true);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        f.add(t3);

        l5= new JLabel("Date Of Birth");  
        l5.setBounds(400,200,200,30);
        l5.setFont(new Font("serif",Font.BOLD,20));
        l5.setLayout(null);
        f.add(l5);
        f.setSize(5000,5000);
        f.setVisible(true);

     

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        f.add(t4);

        l6= new JLabel("Address");
        l6.setBounds(50,250,100,30);
        l6.setFont(new Font("serif",Font.BOLD,20));
        l6.setLayout(null);
        f.add(l6);
        f.setSize(5000,5000);
        f.setVisible(true);

      

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        f.add(t5);

        l7= new JLabel("Phone Number");
        l7.setBounds(400,250,300,30);
        l7.setFont(new Font("serif",Font.BOLD,20));
        l7.setLayout(null);
        f.add(l7);
        f.setSize(5000,5000);
        f.setVisible(true);
         

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        f.add(t6);

        l8= new JLabel("Email Id");
        l8.setBounds(50,300,100,30);
        l8.setFont(new Font("serif",Font.BOLD,20));
        l8.setLayout(null);
        f.add(l8);
        f.setSize(5000,5000);
        f.setVisible(true);
         

        

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        f.add(t7);

        l9= new JLabel("Education");
        l9.setBounds(400,300,100,30);
        l9.setFont(new Font("serif",Font.BOLD,20));   
        l9.setLayout(null);
        f.add(l9);
        f.setSize(5000,5000);
        f.setVisible(true);
         
 
        

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        f.add(t8);

        l10= new JLabel("Job Post");
        l10.setBounds(50,350,100,30);
        l10.setFont(new Font("serif",Font.BOLD,20));
        l10.setLayout(null);
        f.add(l10);
        f.setSize(5000,5000);
        f.setVisible(true);
         
        

        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        f.add(t9);


        l11= new JLabel("Aadhar No");
        l11.setBounds(400,350,100,30);
        l11.setFont(new Font("serif",Font.BOLD,20));
        l11.setLayout(null);
        f.add(l11);
        f.setSize(5000,5000);
        f.setVisible(true);
         
        

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        f.add(t10);

        l12= new JLabel("Employee Id");
        l12.setBounds(50,400,150,30);
        l12.setFont(new Font("serif",Font.BOLD,20));
        l12.setLayout(null);
        f.add(l12);
        f.setSize(5000,5000);
        f.setVisible(true);
         
        

        t11=new JTextField();   
        t11.setBounds(200,400,150,30);
        f.add(t11);

        


        b1= new JButton("Submit");
        b1.setBounds(600,500,100,70);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        f.setLayout(null);
        f.add(b1);
        f.setSize(300,400);
        f.setVisible(true);

        
       
        b2= new JButton("cancel");
        b2.setBounds(800,500,100,70);
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        f.setLayout(null);
        f.add(b2);
        f.setSize(300,400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
        if(ae.getSource() == b1){
      Swing obj=new Swing();
}if(ae.getSource() == b2){
     Swing obj=new Swing();
}
}
}

           
    