package javaprogram;

import java.util.Scanner;

public class arms {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int num = a.nextInt();
		int rem,result=0;
		int original=num;
		while(num>0){
			rem=num%10;
			result=result+rem*rem*rem;
			num=num/10;
		}
		if(original==result){
			System.out.println("no is armstrong");
		}
		else
			System.out.println("not a armstrong");
	}

	}

