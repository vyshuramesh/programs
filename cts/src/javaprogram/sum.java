package javaprogram;

import java.util.Scanner;

 public class sum
 {
    public static void main(String[] args) 
    {

    int number, i,sum = 0; //declaring avriables
    
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any number: ");
    number = s.nextInt(); // taking vallue from user..

        for(i = 1; i <= number; i++) // Calculating sum
        {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum); //printing sum..
    }
}