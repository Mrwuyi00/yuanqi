package test;
/**
 *Class Name: Test
 *Description:
 *@author linwu
 *Create by 10:37:50 AM
 **/
public class Test {

	private String name = "linwu";

	public static void main(String[] args) {
		String str = "helloworld";
		String str1 = "aaa" ;
		String str2 = "aaa" ;
		
		String str3 = new String( "aaa");
		String str4 = new String( "aaa");
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3)); 
		System.out.println(str1==str2); 
		System.out.println(str3==str4);
		System.out.println(str1==str3);		
	}

}
