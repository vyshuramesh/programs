package javaprogram;
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		int x,y,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swapping:"+x+" "+y);
		t=x;
		x=y;
		y=t;
		System.out.println("After swapping:"+x+" "+y);
		System.out.println();	
	}

}
