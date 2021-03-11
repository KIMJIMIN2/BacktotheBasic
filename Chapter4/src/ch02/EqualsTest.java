package ch02;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");

		System.out.println(std1 == std2); // false
		System.out.println(std1.equals(std2)); // 논리적으로 같다는 재정의 후 'true' 반환

		// 사용자가 정의한 메모리 값
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());

		// 실제 가상 메모리 값
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));

		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);

	}
}
