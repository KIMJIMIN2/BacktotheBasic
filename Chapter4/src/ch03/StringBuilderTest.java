package ch03;

public class StringBuilderTest {
public static void main(String[] args) {
	String java  = new String("java");
	String android = new String("android");
	
	StringBuilder buffer = new StringBuilder(java);

	System.out.println(System.identityHashCode(java));
	buffer.append(android);

	System.out.println(System.identityHashCode(java)); // 값을 추가해도 주소 값 동일
	String test = buffer.toString();
	System.out.println(test);
}
}
