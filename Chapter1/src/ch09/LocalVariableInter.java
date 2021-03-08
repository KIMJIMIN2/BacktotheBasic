package ch09;

public class LocalVariableInter {
	public static void main(String[] args) {

		var i = 10; // java 10버젼 이상에서 제공되었다. 마치 javascript처럼
		var j = 10.0;
		var str = "test";

		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		var str2 = str;
		System.out.println(str);

		str = "hello";
        // str = 3; 
		// 최초 입력된 데이터의 값이 "test" 스트링이기에 상수 값은 넣을 수 없다.
	}
}
