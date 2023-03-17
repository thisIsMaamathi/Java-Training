package Ex2R;


public class Ex4OwnException{
	public static void main(String []args) {
		
		Test t=new Test();
		t.exceptionGenerator();
		
	}
		
	
}

//own exception
//
class InvalidValueException extends Exception{
	InvalidValueException(String msg){
		super(msg);
		
	}
	
}

//without catch from another class
class Test{
	public void exceptionGenerator() {
	int a=-10;
	try {
		if(a<0) throw new InvalidValueException("This is invalid");
		
	}
	catch(InvalidValueException e) {
		System.out.println(e);
	}	
}
	
}
		
		
	
	



