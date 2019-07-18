package operator;

public class OperatorEx {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) < 10 ) && ( (i = i +2) < 10);
		System.out.println(num1); // 20
		// 뒤항은 실행이 안되어서 i값이 증가하지 않았다.
		System.out.println(i); // 2 

		System.out.println(value);
	}

}
