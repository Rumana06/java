//reverse number

import java.util.Scanner;
class Reverse 
{
   public static void main(String args[]) {
      int a, number,temp, revnum = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::");
      number = sc.nextInt();
      temp = number;
      while (temp >0) {
         a = temp %10;
         revnum = (revnum*10)+a;
         temp = temp/10;
      }
      System.out.println("Reverse number is:"+revnum);
   }
}