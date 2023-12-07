package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String isPassed() {
		if (finalGrade() > 60.00) {
			return "PASS";
		}
		else {
			return "FAILED";
		}
	}
	
	public String missing() {
		if (finalGrade() > 60.00) {
			return " ";
		}
		else {
			return "MISSING " +  String.format("%.2f", 60.00 - grade1 - grade2 - grade3) + " POINTS";
		}
	}

}
