
public class TestStudent {

	public static void main(String[] args) {
	
		Student st1 = new Student("Blake");
		Student st2 = new Student("Donald");
		
		st1.addTest(100);
		st1.addTest(50);
		st1.addTest(150);
		
		st2.addTest(100);
		st2.addTest(37);
		
		System.out.println("Name: " + st1.getName() + "\nTotal: " + st1.getTotalScore() + "\nAverage: " + st1.getAverage());
		System.out.println("Name: " + st2.getName() + "\nTotal: " + st2.getTotalScore() + "\nAverage: " + st2.getAverage());


	}

}
