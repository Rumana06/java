//write a java code input Student id,Sname,attendence and print details using "Scanner class"


import java.util.Scanner;

class Student
{
public static void main(String[] args)
{

int std_id;                    //student id type is integer type
String std_name;               //student name is string type
double std_attend;             //student attendence is double type
 
System.out.println("enter student name : ");
Scanner sc=new Scanner(System.in); // Scanner  sc
std_name=sc.next();

System.out.println("enter student ID : ");
std_id=sc.nextInt();	

System.out.println("enter student attendence:");
std_attend=sc.nextDouble();

System.out.println("Student name : "+std_name);	// Printing Value
System.out.println("Student ID : "+std_id);	         // Printing Value
System.out.println("Student attendence : "+std_attend);	// Printing Value
}
}