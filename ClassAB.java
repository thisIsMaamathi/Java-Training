package Ex1R;



public class ClassAB {
	public static void main(String args[]) {
		C c=new C();
		
	}

}

class A{
	A(){
		System.out.println("A is called");
	}
}

class C extends A{
	B b=new B();
	
}
class B{
	B(){
		System.out.println("B is called");
	}
	
}


//Parent class constructor called first in order of A->B