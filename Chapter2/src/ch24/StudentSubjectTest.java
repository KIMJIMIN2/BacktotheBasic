package ch24;

public class StudentSubjectTest {
public static void main(String[] args) {
	Student studentLee = new Student(1001, "LEE");
	studentLee.addSubject("국어", 100);
	studentLee.addSubject("수학", 50);
	
	Student studentKIM = new Student(1001, "LEE");
	studentKIM.addSubject("국어", 85);
	studentKIM.addSubject("수학", 50);
	studentKIM.addSubject("영어", 30);

	studentLee.showScoreInfo();
	System.out.println("==========");
	studentKIM.showScoreInfo();
}
}
