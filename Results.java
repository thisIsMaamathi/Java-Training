package Ex1R;
class Student {
	String name;
	int rno;
}

class Exam extends Student {
	int engMarks, sciMarks, mathMarks;

	public Exam(int engMarks, int sciMarks, int mathMarks) {
		this.engMarks = engMarks;
		this.sciMarks = sciMarks;
		this.mathMarks = mathMarks;
	}

}

public class Results extends Exam {

	public Results(int engMarks, int sciMarks, int mathMarks) {
		super(engMarks, sciMarks, mathMarks);
	}

	int totalMark;

	public int calcMark() {
		totalMark = engMarks + mathMarks + sciMarks;
		System.out.println(engMarks);
		System.out.println(mathMarks);
		System.out.println(sciMarks);

		return totalMark;
	}

	public static void main(String args[]) {
		Results ex = new Results(60, 70, 80);
		System.out.println(ex.calcMark());

	}

}


