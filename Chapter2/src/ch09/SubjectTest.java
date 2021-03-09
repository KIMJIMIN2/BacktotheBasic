package ch09;

public class SubjectTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "LEE");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 100);

		Student studentKim = new Student(100, "KIM");
		studentKim.setKoreaSubject("국어", 30);
		studentKim.setMathSubject("수학", 150);

		studentKim.showScoreInfo();
		studentLee.showScoreInfo();

	}
}
