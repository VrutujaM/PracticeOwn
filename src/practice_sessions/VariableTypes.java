package practice_sessions;
//3 types of variables in java
	//instance variables/object variables
	//Static variables/class variables
	//Local variables /block variables
    /*Instaance and static variables are always declared outside the method and inside the class*/
public class VariableTypes {
	public static void main(String[] args) {
		
	}
	int g2=g1;     //if we write int g2=g1; int g1=50; then it will give error bcz first we have to declare and then assign
	static int g1=50; // but when we use static it will run bcz first static variables goes in memory then instance variables
	
	
	int j=19; // instace variable / blue and straight
	static int z=56;//static variable / blue and italic
	                // static variables are constant in terms of memory
	                // static variables are shared variables
	                // static variables are class variables
	                // so they dont need object to call
	                // we can directly call them by class name 
	                // eg. VariableTypes.z
	static final int y=55; // value cant be change and it will have fix memory
	
	void m1() {  // void means no return type and non parametarize
		int i=10; //  scope of this variables is limited to this method only
	}
	void m2(int k) { // Parameters are also consider as Local variables
		
		}
	

}
class VariableDemo{
public static void main(String[] args) {
	
	VariableTypes.z =45; // we can chane value of static variable without object in any class
	System.out.println(VariableTypes.z ); // o/p 45 not 56
	VariableTypes v1=new VariableTypes();
	VariableTypes v2=new VariableTypes();
	v1.j=60;
	v2.j=70;
	v1.z=52;
	v2.z=80;
	
	System.out.println(v1.j);
	System.out.println(v2.j);
	System.out.println(v1.z); //80 Static variables are shared variables
	System.out.println(v2.z); //80 so whatever is the last assigned value before sysout it will print that
	System.out.println(VariableTypes.z); // static variables can call by class name no need to create object
	
}
}
