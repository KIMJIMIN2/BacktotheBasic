package ch13;

public class BitOperationTest {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);

		System.out.println(num1 <<2); // 2의 2승을 곱한다.(왼쪽 시프트)
		System.out.println(num1 <<= 2);
		System.out.println(num1 >>1); // 2의 1승을 나눈다.(오른쪽 시프트)
	}
}
