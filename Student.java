
public class Student {

	//private fields for student object
	private String name;
	private int totalScore;
	private int numOfTests;
	
	//constructor - setting up initial values
	public Student(String name) {
		this.name = name;
		this.totalScore = 0;
		this.numOfTests = 0;
	}
	
	//methods
	public void addTest(int score) {
		this.totalScore += score;
		this.numOfTests++;
	}
	
	
	//getters 
	public String getName() {
		return this.name;
	}
	public int getTotalScore() {
		return this.totalScore;
	}
	public int getAverage() {
		return this.totalScore / this.numOfTests;
	}
}
