package javaprogram;

public class reverse {

	public static void main(String[] args) {
		int num=89754, reverse=0;
		while(num!=0)
		{
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println("The reverse of given number is:"+reverse);
	}

}
