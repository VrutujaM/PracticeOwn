package practice_sessions;
class K1{
	K1(){
		System.out.println("K1.Constructor");
	}
}
class K2 extends K1{
K2(){
	System.out.println("K2.constructor");
}
}
class K3 extends K2{
	K3(){
		System.out.println("K3.Constructor");
	}
}

public class ConstructorChanning {
	public static void main(String[] args) {
		K3 k3=new K3();// K1.Constructor K2.constructor K3.Constructor
		K2 k2=new K2(); //K1.Constructor K2.constructor
	}

}
// When we crete obj of K3 it will call its parent constructor first
