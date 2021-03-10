package ch24;

import java.util.ArrayList;


public class Student {
	String studentName;
	int studentId;

	ArrayList<Subject> SubjectList = new ArrayList<>();

	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;

		SubjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(point);
		
		SubjectList.add(subject);
	}

	public void showScoreInfo() {
		int total = 0;
		for(Subject subject : SubjectList) {
			total += subject.getScorePoint();
			System.out.println(studentName + " 학생의 " +subject.getName()+"과목의 성적은"+subject.getScorePoint()+" 점 입니다.");
		}
		System.out.println("총점은 "+total);
	}
}
