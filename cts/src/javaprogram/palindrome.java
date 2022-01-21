package javaprogram;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int num = a.nextInt();
		int rem,original;
		original=num;
		int result=0;
		while(num>0){
			rem=num%10;
			result=result*10+rem;
			num=num/10;
		}
		if(original==result){
			System.out.println("no is palindrome");
		}
		else
			System.out.println("not a palindrome");
	}

}
