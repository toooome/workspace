package edu.kh.variable;

public class VariableEx4 {
	
	public static void main(String[] args) {
		
		// String (문자열) 
		// - 문자열을 저장하는 자료형 
		// - 기본 자료형 x
		// - 참조형 (기본 자료형이 아닌 것들, 직접 만든 자료형)
		
		// 문자열 리터럴 표기법 : "" 
		// cf. char : ''
		
		String str1 = "hello";
		
		System.out.println(str1);
		
		System.out.println(10000000000L);
		
		// 출력하고자 하는 값의 리터럴 표기법을 작성
		System.out.println("안녕하세요");
		
		System.out.println("---------------------");
		
		
		String name = "김선후";
		int age = 30;
		char gender = '여';
		
		System.out.println(age + 1); // 정수 + 정수 = 두 수의 합
		
		System.out.println(name + "입니다"); // 문자열 + 문자열 = 이어쓰기

		System.out.println(name + age); // 문자열 + 정수 = 이어쓰기 
		// 자료형이 달라도 기본은 이어쓰기
		
		System.out.println(name + age + gender); // 문자열 + 정수 + 문자형 = 이어쓰기
	
		// 김선후님은 30세 여성입니다. 출력하기
		System.out.println(name + "님은 " + age + "세 " + gender + "성입니다.");
		// 띄어쓰기를 표현하고 싶으면 "" 안에 띄어쓰면 됨
		
		
		// 사칙연산 연산 순위 적용 (왼쪽 -> 오른쪽)
		System.out.println(100 + age + name); 
		// 정수 + 정수 + 문자열 
		// = 두 수의 합 + 문자열 (이어쓰기)
		
	
		
		
		
	
	
	
	}

	
}
