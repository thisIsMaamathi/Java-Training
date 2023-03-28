package Ex1R;

public class PassByvalPassbyRef {
	public static void main(String args[]) {

		int a = 10;
		Test t = new Test();
		System.out.println("Before pbv");
		System.out.println(a);
		System.out.println("After pbv");
		System.out.println(a);
		System.out.println("for objects");
		System.out.println("Before pbv");
	    t.pbv(a);
		System.out.println("After pbv");
	    t.pbr(t);

	}

	public void funVarr(int a) {
		a++;

	}
}


class Test{
	int a=15;



	public void pbv(int a) {
		a = 50;
		System.out.println(a);

	}

	public void pbr(Test test) {
		test.a = 5;
		System.out.println(test.a);
	}

}

