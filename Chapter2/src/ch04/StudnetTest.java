package ch04;

public class StudnetTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.studentID=12345;
		studentLee.setStudentName("Lee");
		studentLee.address = " 서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID=54321;
		studentKim.setStudentName("Kim");
		studentKim.address = " 경기도 분당구";
		
		studentKim.showStudentInfo();
		System.out.println(studentKim);
		System.out.println(studentLee);
	}
}
