package javaprogram;

import java.util.Scanner;

public class prime
{
 public static void main(String args[])
 {
  /*int p = 0;
  for (int i = 1; i<=20; i++)
  {
   for (int j = 2; j<i; j++)
   {
    if(i%j!= 0)
    { 
    	p = 1;
    	}
    else
    {
    	p = 0;
     break;
     }
   }
    if(p == 1)//ERROR HERE
    System.out.println(i+" is Prime");
  }*/
	 Scanner a=new Scanner(System.in);
	 System.out.println("the no is:");
	 int num=a.nextInt();
	 int flag=0;
	 for(int i=2;i<=num/2;i++)
	 {
		 if(num%i==0)
		 {
			 flag=1;
			 break;
		 }
	 }
	 if(flag==0){
		 System.out.println("no is prime");
	 }
	 else
		 System.out.println("no is not prime");
 }
}
