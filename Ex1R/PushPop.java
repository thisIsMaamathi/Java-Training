package Ex1R;

public class PushPop {
	public static void main(String arg[]) {
		FixedStack fs = new FixedStack(5);
		DynamicStack ds = new DynamicStack(2);
		System.out.println("Fixed Stack");
		fs.push(1);
		fs.push(3);
		fs.pop();
		fs.pop();
		
		System.out.println("Dynamic Stack");
		ds.push(7);
		ds.push(10);
		ds.push(13);
		ds.push(9);
		ds.pop();
		ds.pop();
	}

}

interface Stack {
	public void push(int a);

	public void pop();
}

class FixedStack implements Stack {
	int size;
	int[] st;
	int top;

	FixedStack(int size) {
		this.size = size;
		st = new int[size];
	}

	@Override
	public void push(int a) {
		st[top++] = a;
		System.out.println("element pushed" + a);
	}

	@Override
	public void pop() {
		int x;
		x = st[top - 1];
		top--;
		System.out.println(x);
	}
}

class DynamicStack implements Stack {
	int size;
	int[] st;
	int top;

	DynamicStack(int size) {
		this.size = size;
		st = new int[size];
	}

	@Override
	public void push(int a) {
		if (size >= top) {
			growSize();
		}
		st[top++] = a;
		System.out.println("element pushed" + a);

	}

	@Override
	public void pop() {
		int x;
		x = st[top - 1];
		top--;
		System.out.println(x);
	}

	public void growSize() {
		int[] temp = new int[this.size * 2];
		for (int i = 0; i < size; i++) {
			temp[i] = this.st[i];
		}
		this.st = temp;
		this.size = this.size * 2;
	}
}
