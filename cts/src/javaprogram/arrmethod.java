package javaprogram;

public class arrmethod {
	static void max(int arr[]){
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
			if(max<arr[i])
				max=arr[i];
		System.out.println(max);
	}

	public static void main(String[] args) {
		int a[]={33,102,3,78};
		max(a);

	}

}
