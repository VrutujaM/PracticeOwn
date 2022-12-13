package practice_sessions;

public class Variable {
	public static void main(String[] args) {
		// keyword - predefined words in any language 
		// keyword - variable , small-letter, 
		// reserved keyword
		// naming convention
				// a-zA-Z$_
		// variable - vary + able 
		// variables can change their value
		int a=10;
		System.out.println("a="+a);
		// + sign after any string value consider as append
		// + sign without or before string is consider as operator
		int b=a;
		System.out.println("b="+b);
		System.out.println("Sum="+10+20);
		System.out.println((10+20)+"Sum=");
		System.out.println("Sum="+(10+20));
		final int m=10;// to asign constant value we use final keyword 
		System.out.println("Constant="+m);
		
		
	
		// IQ-Swap the values
		// y = 10
		// x = 7

		//#1 - with using third variable
		//int z = y; // x = 10, y = 7, z = 10
		//y = x; // x= 7, y = 7, z = 10
		//x = z ; // x = 7 , y = 10, z = 10

		//#2 - without using third variable
		// a) Using addition and substraction
		//x = x + y; // x = 17, y = 7
		//y = x - y; // x = 17, y = 10 
		//x = x - y; // x = 7, y = 10

		// b) Using multiplication and devidation
		//x = x * y; // x = 70, y = 7
		//y = x / y; // x = 70, y = 10 
		//x = x / y; // x = 7, y = 10

	
	}
}
