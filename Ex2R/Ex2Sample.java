package Ex2R;

//qn-2
//  

public class Ex2Sample {
public void mth1()
{
	mth2();
	System.out.println("caller");
}

public void mth2() {
	try {
		int[] a=new int[2];
		a[0]=12;
		return;
	}
	catch(Exception e) {System.out.println("catch-mth2");}
	finally {System.out.println("finally-mth2");}
	}
	
	public static void main(String p[]) {
		Ex2Sample s=new Ex2Sample();
		s.mth1();
	
}

}
