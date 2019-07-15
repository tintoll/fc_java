package variable;

public class IntegerTest {

	public static void main(String[] args) {
		byte bs = 127; // 128은 포함할수 없다. 
		
		int iVal = 123456789; // 12345678900 에러 
		// 숫자를 자바 내부적으로 관리를 하는데(리터럴) 기본이 int타입이여 int형 범위까지는 에러가 나지 않지만
		// 그것을 넘어서면 에러가난다. long형을 사용할려면 뒤에 L를 붙여줘야한다.
		long lVal = 12345678900L; // 12345678900 에러 
		long lVal2 = 100;
		
	}

}
