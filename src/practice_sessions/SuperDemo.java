package practice_sessions;
/* Super keyword
 * Using super keyword we can call method of super class in overriden child class
 * Object class is super class of all classes
 * Generally parent class is super class
 * */
public class SuperDemo {
	public static void main(String[] args) {
		B3 b3=new B3();
		b3.test1();//B2.test1
		b3.test2();//B2.test2 //With super o/p B0.test1
		B1 b1=new B1();
		b1.test1(); //B0.test1 / Even if it is empty It is extended from B0 so bydefault it aquires all properties of B0
	}

}
class B0{
	public void test1() {
		System.out.println("B0.test1");
	}
}
class B1 extends B0{

}
class B2 extends B1{
	public void test1() {
		System.out.println("B2.test1");
	}
	public void test2() {
		//System.out.println("B2.test2");
		super.test1(); // when we call test2() it will give call method of super class
		    		   // It means to call super / parent class method in overriden child class we use "super"
	}
}
class B3 extends B2{
	
}
