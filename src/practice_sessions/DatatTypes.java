package practice_sessions;

public class DatatTypes {
	public static void main(String[] args) {
		// Data Types 
		// 1.Numeric - byte, short ,int ,long
		// 2.Floating - float, long, double
		// 3.Char - char
		// 4.Boolean - boolean
		
		// 1. Numeric
		// a) byte =2^8
		//Number Systems
		// 1. Binary 2.Decimal 3.Octal 4.Hexadecimal
		//1. Binary Number System
		// It has two values 0 and 1 so base will be 2 for binary number
		// 1 byte =8 bits
		//1 byte =0 to 255 (2^0)+(2^1)+(2^2+)+(2^3)+(2^4)+(2^5)+(2^6)+(2^7)
		//             255 = 1  +  2  +  4   +  8  +  16 +  32 +  64 +128
		//Considering negative values we devide 255 into both +ve and -ve values
		// Binary value range is (-2^7 to (2^7-1)) ie. -128 to 127 total 255 values including 0
		byte b1 =127;
		System.out.println("b1="+b1);
		//byte b2 =128;
		//System.out.println("b2="+b2);// here byte will not accept 128 since it is out of range
		// If we want to give value which is out of range we use "Casting"
		byte b2 =(byte)256; 
		System.out.println("b2="+b2);// 0
		byte b3=(byte)300;
		System.out.println("b3="+b3);// 44
		byte b4=(byte)255;
		System.out.println("b4="+b4);// -1
		// Since the range is -128 to 127 it will give o/p in cyclic nature
		//once it reaches 127 it will again start from -128
		//128=-128 130=-126 255=-1 256=0 300=44 600=88
		
		// b) short = 2 bytes = 2^16
		short s1 =89;
		System.out.println("s1="+s1);
		// c) int = 4 bytes = 2^32
		int i1 =55;
		System.out.println("i1="+i1);
		// d) long = 8 bytes = 2^64
		// Long can hold large values 
		// We can seperate values with "underscore" just for our understanding
		long kl=2543_3454_2;
		System.out.println("K="+kl);
		
		// Number conversion
		// 56 = 70 (Octal) = 38 (Hexadecimal)
		int m1 = 56;
		System.out.println("m1="+m1); // 56
		int m2 = 070;
		System.out.println("m2="+m2); // 56 Octal
		int m3 = 0x38;
		System.out.println("m3="+m3); // 56 Hexadecimal
		// When we add "0" before integer value it consider as octal value
		// When we add "X0" before integer value it consider as hexadecimal value
		
		
		
		// 2. Floating  - It contains pont values 
		// a) float
		float f =2.4f;
		long l1=2652255l;
		System.out.println(f);
		System.out.println(l1);
		
				
	}

}
