package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		int num1 = 0B00001010; // 10
		int num2 = 0B00000101; // 5
		
		System.out.println( num1 & num2); // 0
		System.out.println( num1 | num2); // 15
		System.out.println( num1 ^ num2); // 15
		
		System.out.println(num2 << 1); // 10 현재값에 곱하기 2의 1승
		System.out.println(num2 << 2); // 15 현재값에 곱하기 2의 2승
		
		System.out.println(num2 >> 1); // 10 현재값에 나누기 2의 1승 
		System.out.println(num2 >> 2); // 10 현재값에 나누기 2의 2승 
	}

}
