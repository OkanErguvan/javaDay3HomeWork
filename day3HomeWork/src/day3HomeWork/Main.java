package day3HomeWork;

public class Main {

	public static void main(String[] args) {
	
		Student student = new Student();
		student.id=1;
		student.firstName="okan";
		student.lastName="erguvan";
		student.userName="Oknergvn";
		student.password="1234";
		student.school="BUÜ";
		
		Instructor instructor = new Instructor();
		instructor.id=2;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.course="Java";
		
		
		UserManager userManager = new UserManager();
		userManager.add();
		
		StudentManager studentManager =new StudentManager();
		studentManager.OgrenciDiscount();
		
		InsturctorManager instructorManager =new InsturctorManager();
		instructorManager.numberOfStudents();
		
	}

}
