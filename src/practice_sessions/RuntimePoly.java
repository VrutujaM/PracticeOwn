package practice_sessions;
/*Reference class methods are visible only
 * Object class methods will execute
 * It means child class overrides parent class method 
 * Refere browser demo class for runtime polymorphism
 * */

public class RuntimePoly {
	public static void main(String[] args) {
		p1 parent=new c1();// Reference of parent and object of child
		parent.m1();
		//parent.m2(); // Compile error/ Parent cant use child method
		
	}

}
class p1{
	public void m1() {
		System.out.println("P1.m1");
	}
}
class c1 extends p1{
	public void m1() {
		System.out.println("c1.m1");
	}
	public void m2() {
		System.out.println("c1.m2");
	}
}
