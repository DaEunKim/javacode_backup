package classhw7;


public class Grade {
	public static void main(String[] args){
		GradeTester student1=new GradeTester("Mary");
		GradeTester student2=new GradeTester("Mike");
		student1.inputGrades();
		student2.inputGrades();
		System.out.println("\n");
		System.out.println(student1.toString());
	}
}
