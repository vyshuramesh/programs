package javaprogram;

public class recursionfact {
	static int factorial(int n){
		if(n==1)
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 10 is:"+factorial(10));

	}

}
