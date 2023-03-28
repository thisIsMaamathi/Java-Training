package Ex2R;

public class Ex6DerievedClassException  {
	
public static void main(String args[]) {
	Child c=new Child();
	
}
}

class Parent{
	Parent() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
	
}

class Child extends Parent{
	Child() {
		
        try {
        	Parent p=new Parent();
        }
        catch(CloneNotSupportedException e) {
            System.out.println(e);
        }
        
    }
	
}

