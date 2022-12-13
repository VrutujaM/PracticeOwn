package practice_home;

public class VariableTypes {
	public static void main(String[] args) {
		
	}
int a=20;
static int b=30;
int g2=g1;
static int g1=10;
void m1() {
	int c=60;
	System.out.println(c);
}
void m2(int d) {
	
}
}
class VariableDemo{
	public static void main(String[] args) {
		VariableTypes v1=new VariableTypes();
		VariableTypes v2=new VariableTypes();
		v1.a=30;
		v2.a=55;
		System.out.println(v1.a);//30
		System.out.println(v2.a);//55
		System.out.println(VariableTypes.b);//30
		VariableTypes.b=15;
		System.out.println(VariableTypes.b);//15
		System.out.println(v1.g2);//10
		
	}
}
