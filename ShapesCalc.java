package Ex1R;

public class ShapesCalc {
	public static void main(String args[]) {
		ShapesArea s=new ShapesArea();
		ShapesVol v=new ShapesVol();
		s.square(5);
		s.circle(4);
		s.triangle(3, 4, 5);
		
		v.square(5);
		v.circle(4);
		v.triangle(3, 4);
		
		}

}

interface CalcArea{
	public void square(int s);
	public void circle(int r);
	public void triangle(int a,int b, int c);
}

interface Calcvol{
	public void square(int s);
	public void circle(int r);
	public void triangle(int r,int h);
}

class ShapesArea implements CalcArea{
	
	@Override
	public void square(int s) {
		int res=s*s;
		System.out.println(res);
	}
	
	public void circle(int r) {
		double res= 3.14*r*r;
		System.out.println(res);
	}
	
	public void triangle(int a,int b,int c) {
		int res= (a+b+c)/2;
		System.out.println(res);
	}
}

class ShapesVol implements Calcvol{
	
	@Override
	public void square(int s) {
		int res=s*s*s;
		System.out.println(res);
	}
	
	public void circle(int r) {
		double res= 3.14*r*r*r;
		System.out.println(res);
	}
	
	public void triangle(int r,int h) {
		int res= (4/3)*r*r*h;
		System.out.println(res);
	}
}




