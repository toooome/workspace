package edu.kh.variable;

public class VariableEx3 {

	public static void main(String[] args) {
		
		// 변수 : 메모리에 값을 저장할 수 있는 공간
		//        저장된 값은 변할 수 있다.
		
		// 상수 : 메모리에 값을 저장할 수 있는 공간 (기본적으론 같은 의미)
		//        한 번 저장된 값은 변할 수 없다.
		
		// 상수 예약어 : final
		
		// 변수 값 변경 확인
		int num1 = 100;
		num1 = 200;
		
		// 상수 값 변경 확인
		final int num2 = 99;
		// num2 = 999;
		// The final local variable num2 cannot be assigned.
		// It must be blank and not using a compound assignment.
		// -> 한 번 값이 저장된 상수 num2에 다른 값을 저장하지 못함.
		
		
		/* 상수 명명 규칙 및 활용법 */
		// - 명명 규칙 : 모두 대문자로 표기, 단어 구분 시 언더바 사용
		final int CONSTANT_NUMBER = 24;
		
		
		// - 활용법
		final double PI = 3.14;
		
		double result = PI * 10 * 10; // 314.0
		
		System.out.println(result);
		
		
		final int UP = 5;
		final int DOWN = -5;
		final int INIT = 0; // 초기화 initialization (처음으로)
		
		System.out.println("----------------------");
		
		int result2 = INIT;
		System.out.println(result2); // 0
		
		
		// 대입연산자(=) 기호를 기준으로
		// 오른쪽부터 해석하기!!!!
		result2 = result2 + UP;
		System.out.println(result2); // 5
		
		result2 = result2 + DOWN + DOWN;
		System.out.println(result2); // -5
		
		// ** 변수 명명 규칙 (반드시 지키세요!) **
		
		// 1. 대소문자가 구분되며 길이제한 없음 (장점)
		int apple;
		// int apple; 
		// Duplicate local variable apple (변수명 중복)
		int applE; 
		// 한글자라도 다르면 중복이 아님 (대소문자 구분)
		
		// 길이 제한 없음 확인
		int freeTradeAggrement;
		int wireToWire;
		int dkanfjgrpskTjehrlfdlrkakrrlfdjehrhoscksgdmarlfdlwpgksdldjqtdma;
		
		// 2. 예약어 사용 금지
		// 예시) int int; 
		// double char;
		// float short;
		// boolean final; 
		
		// 3. 숫자로 시작할 수 없음 (숫자를 사용할 수 없는 것은 아님)
		// long 100number;
		long number100; // 가능
		
		// 4. 특수문자는 $와 _만 사용 가능 (쓰임새가 따로 있어 굳이 사용x)
		float $number; // 가능
		float _num_ber; // 가능
		// float #num#ber;
		
		// 5. 카멜 표기법
		// - 변수명 첫글자는 소문자
		// - 연결된 단어의 첫 글자는 대문자
		// -> 자바 개발자간의 규약으로 이클립스가 오류로 인식하지 않음 
		//	  (가독성을 위해, 띄어쓰기 불가)
		
		int studentAge; 
		char helloWorld; 
		
		// 참고) 변수명에 언어 제한이 없음
		// -> 하지만 영어로 많이 쓰임!
		int 정수1번; 
		double 실수1번입니다;
		char 東;
		
		
	}
}
