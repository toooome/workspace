package edu.kh.operater.ex;

import java.util.Scanner;

public class OperaterEx4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 생성
		
		System.out.println("[홀짝 검사기]");
		
		System.out.print("정수 하나를 입력해주세요 : ");
		
		int input = sc.nextInt(); // 정수 입력 받기
		
		// 삼항 연산자
		// 조건식 ? TRUE인 경우 : FALSE인 경우
		
		// String result = input % 2 == 1 ? "홀수 입니다." : "짝수 입니다.";
		
		// Math.abs(숫자) -> 절대값 만들기 (음수에도 적용 가능)		
		// String result = Math.abs(input) % 2 == 1 ? "홀수 입니다." : "짝수 입니다.";
		
		// 0의 경우? 0 % 2 = 1이 아니기 때문에 짝수라고 나옴
		// 응용
		String result = Math.abs(input) % 2 == 1 ? "홀수 입니다." 
						: input == 0 ? "0입니다." : "짝수 입니다."; 
						// 삼항 연산자 안에 삼항 연산자가 있는 모습
								
		System.out.println(result);
	
		
	}
}
