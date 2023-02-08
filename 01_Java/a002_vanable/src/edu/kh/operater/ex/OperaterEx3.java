package edu.kh.operater.ex;

public class OperaterEx3 {

	public static void main(String[] args) {

		// 논리 연산자 : &&(AND), ||(OR) 
		
		
		// &&(AND) 연산자 : 둘 다 TRUE이면 TRUE, 나머지는 FALSE
		// 예) ~와, 그리고(이고), 이면서(면서), 부터, 까지, 사이
		
		// 정수가 100 이상이면서 짝수인가?
		int num1 = 100;
		boolean result1 = num1 >= 100  &&  num1 % 2 == 0;
		
		System.out.println("100 이상이면서 짝수인가? " + result1 );
		
		// 정수가 50 이하이고 3의 배수인가?
		int num2 = 47;
		boolean result2 = num1 <= 50  &&  num2 / 3 == 0;
		
		System.out.println("정수가 50 이하이고 3의 배수인가? " + result2 );
		
		// 정수가 1부터 100 사이의 숫자인가?
		// 정수가 1 이상인가? + 정수가 100 이하인가? (쪼개서 만들어야 함. 이항 연산자를 사용하기 때문)
		int num3 = 29;
		boolean result3 = num3 >= 1  &&  num3 <= 100;
		// boolean result3 = 1 <= num3  &&  100 >= num3;

		System.out.println("정수가 1부터 100 사이의 숫자인가? " + result3 );
		
		
		// ||(OR) 연산자 : 둘 다 FALSE이면 FALSE, 나머지는 TRUE
		// 또는, ~이거나(거나)
		
		// 정수가 10을 초과하거나 홀수인가?
		int num4 = 14;
		boolean result4 = num4 > 10  ||  num4 % 2 == 1;
		
		System.out.println("정수가 10을 초과하거나 홀수인가? " + result4 );
		
		
		// 정수는 0부터 50 사이 숫자 또는 음수인가?
		int num5 = 3;
		// boolean result5 = num5 >= 0  &&  num5 <= 50  ||  num5 < 0;
		boolean result5 = num5 <= 50; 
		// 50이하인가? 를 묻는 것과 같음
		
		System.out.println("0부터 50 사이 숫자 또는 음수? " + result5);
		
		
		// 논리 부정 연산자 : ! (NOT)
		// - 논리 값을 반대로 바꾸는 연산자

		// 11은 짝수가 아니다.
		System.out.println("11은 짝수가 아니다 : " + !(11 % 2 == 0) ); // true
		// (11 % 2 != 0) 도 맞음
		
		System.out.println( !!true ); // 부정의 부정
		System.out.println( true || false && !false); // true 
		
		
		
	}

}
