package javaprogram;

public class StringFormatter {
	public static String reverseString(String str){
		//StringBuilder sb=new StringBuilder(str);
		//sb.reverse();                           //string builder
		//return sb.toString();
		
		//char ch[]=str.toCharArray();
		//String rev="";                          //iteration for loop
		//for(int i=ch.length-1;i>=0;i--)
		//{
		//	rev+=ch[i];
		//}
		//return rev;
		
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();                             //string buffer
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(StringFormatter.reverseString("my name is vaishu"));
	}

}
