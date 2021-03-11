package ch03;

public class StringTest {
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");

		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		System.out.println(System.identityHashCode(java)); // 값을 추가하면 주소 값 또한 함께 변동
		
	}
}
