import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    String firstName="";
    String lastName="";
    int idNumber;

    // Write your constructor here
      public Student(String firstname, String lastName, int id, int[] testScores) {
        super(firstname, lastName, id);
        this.testScores = testScores;
    }

    public String calculate() {
        Double averageScore = Arrays.stream(testScores).average().getAsDouble();
        if (averageScore >= 90 && averageScore <= 100) {
            return "O";
        }
        if (averageScore >= 80) {
            return "E";
        }
        if (averageScore >= 70) {
            return "A";
        }
        if (averageScore >= 55) {
            return "P";
        }
        if (averageScore >= 40) {
            return "D";
        } else {
            return "T";
        }
    }
}

class InheritanceProblem{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}