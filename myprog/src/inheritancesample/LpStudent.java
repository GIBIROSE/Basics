package inheritancesample;

public class LpStudent extends Student {

	public void studentClassDetails() {
		System.out.println("I'm in class iv");
	}
	@Override
	public void studentDetails() {
		super.studentDetails();
		System.out.println("i have 5 subjects to learn");
	}
	
	
}
