import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import niha.Swing;


class Course implements Serializable{
 
int id;
String name;
float salary;
Long contact_no;
String email_id;

public Course(int id,String name,float salary,long contact_no,String email_id)
{
this.id=id;
this.name=name;
this.salary=salary;
this.contact_no=contact_no;
this.email_id=email_id;
} 
}
class EmployeeManagement 
{
static void display(ArrayList<Employee> al)
{
System.out.println("\n---------Employee List--------------\n");
System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","contact_no","Email_id"));
for(Employee e : al)
{
System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
}
}
public static void main(String[] args)
{
int id;
String name;
float salary;
long contact_no;
String email_id;
Scanner sc = new Scanner(System.in);
ArrayList<Employee> al = new ArrayList<Employee>();

File f = null;
FileInputStream fis = null;
ObjectInputStream ois = null;
FileOutputStream fos = null;
ObjectOutputStream oos = null;

try{

f = new File("database.txt");
if(f.exists())
{
fis=new FileInputStream(f);
ois=new ObjectInputStream(fis);
al = (ArrayList<Employee>)ois.readObject();
}
}
catch(Exception exp){
System.out.println(exp);
}
do
{
Swing obj=new Swing();
System.out.println("\n**********WELCOME**********\n");
System.out.println("1)Add Employee to the file \n" +
                   "2)search for Employee \n" +
                   "3)Edit Employee details \n" +
                   "4)Delete Employee details \n" +
                   "5)Display Employee details\n" +
                   "6)EXIT \n");
System.out.println("Enter your choice : ");
int ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("\nEnter the following details to add the list \n");
System.out.println("Enter ID :");
id=sc.nextInt();
System.out.println("Enter Name :");
name=sc.next();
System.out.println("Enter Salary : ");
salary=sc.nextFloat();
System.out.println("Enter contact_no :");
contact_no=sc.nextLong();
System.out.println("Enter Email_id :");
email_id=sc.next();  
al.add(new Employee(id, name, salary, contact_no, email_id));
display(al);
System.out.println("Employee details added successfully.");
break;

case 2: System.out.println("Enter the Employee Id to search :");
id=sc.nextInt();
int i=0;
for(Employee e: al)
{
if(id == e.id)
{
System.out.println("Employee details are:");
System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","contact_no","Email_id"));
System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
i++;
}
}
System.out.println("Employee details searched successfully\n");
if(i == 0)
{
System.out.println("\nEmployee details are not available, please enter a valid ID:");
}
break;
case 3:System.out.println("\n Enter the Employee Id to Edit the details");
id=sc.nextInt();
int j=0;
for(Employee e: al)
{
if(id==e.id)
{
System.out.println("Employee details are:");
System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","contact_no","Email_id"));
System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
j++;
do{
int ch1=0;
System.out.println("Edit Employee details :\n" +
                   "1)Employee ID\n" +
                   "2)Name\n" +
                   "3)salary\n" +
                   "4)contact_no\n" +
                   "5)Email_id\n" +
                   "6)Go Back\n");
System.out.println("Enter your choice: ");
ch1=sc.nextInt();
switch(ch1)
{
case 1:System.out.println("enter new employee ID:");
e.id=sc.nextInt();
System.out.println("Employee details are:");
System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","contact_no","Email_id"));
System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
System.out.println("Employee details edited succesfully \n");
break;
case 2:System.out.println("Enter new Employee name: ");
e.name=sc.nextLine();
System.out.println("Employee details are:");
System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","contact_no","Email_id"));
System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
System.out.println("Employee details edited succesfully \n");
break;
case 3:System.out.println("Enter new Employee salary: ");
e.salary=sc.nextFloat();
System.out.println("Employee details are:");
System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","contact_no","Email_id"));
System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
System.out.println("Employee details edited succesfully \n");
break;
case 4:System.out.println("Enter new Employee contact_no: ");
e.contact_no=sc.nextLong();
System.out.println("Employee details are:");
System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","contact_no","Email_id"));
System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
System.out.println("Employee details edited succesfully \n");
break;
case 5:System.out.println("Enter new Employee Email_id :");
e.email_id=sc.next();
System.out.println("Employee details are:");
System.out.println(String.format("%-10s%-15s%-10s%-20s%-10s","ID","Name","Salary","contact_no","Email_id"));
System.out.println(String.format("%-5s%-20s%-10s%-15s%-10s",e.id,e.name,e.salary,e.contact_no,e.email_id));
System.out.println("Employee details edited succesfully \n");
break;
case 6:j++;
break;
default:System.out.println("Enter a correct choice from the list :");
break;
}
}
while(j==1);
}
}
if(j==0)
{
System.out.println("\nEmployee details are not available.please enter a valid ID: ");
}
break;
case 4:System.out.println("\n Enter Employee ID to DELETE from the file: ");
id=sc.nextInt();
int k=0;
for(Employee e: al)
{
if(id==e.id)
{
al.remove(e);
display(al);
System.out.println("Employee details deleted successfully \n");
k++;
}
}
if(k==0)
{
System.out.println("\nEmployee details are not available.please enter a valid ID: ");
}
break;
case 5:try{
al=(ArrayList<Employee>)ois.readObject();
}catch(Exception e2) {
System.out.println(e2);
}
display(al);
break;
case 6: try {
fos=new FileOutputStream(f);
oos=new ObjectOutputStream(fos);
oos.writeObject(al);
} catch(IOException e1) {
e1.printStackTrace();
}
catch(Exception e2) {
e2.printStackTrace();
}
finally{
try{
fis.close();
ois.close();
fos.close();
oos.close();
} catch(Exception e1){
e1.printStackTrace();
}
}
System.out.println("\nYou have chosen EXIT !!");
sc.close();
System.exit(0);
break;
default: System.out.println("\n Enter a correct choice from the list :");
break;
}
}
while(true);
}
}

             

 
