package week3.d1.a3;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("The Student id is " +id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("The student id is " +id);
		System.out.println("The student name is " +name);
	}
	public void getStudentInfo(String email,long MblNum) {
		System.out.println("The student email is " +email);
		System.out.println("The student Mobile Number is " +MblNum);
	}
	public static void main(String[] args) {
		Students stud = new Students();
		
		stud.getStudentInfo(17);
		stud.getStudentInfo(18, "Saravanan");
		stud.getStudentInfo("Saravanansuresh710@gmail.com", 9876543210l);
	}
}
