package edu.kh.operater.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : "); // 이 부분 6가지 먼저 써놓고 
		String inputName = sc.next(); // 단어 입력(문자열)
		
		System.out.print("학년(정수) : ");
		int inputGrade = sc.nextInt(); // 정수 입력
		
		System.out.print("반(정수) : ");
		int inputClass = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int inputNumber = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : "); // 단어 입력(문자열)
		String inputGender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		Double inputResult = sc.nextDouble(); // 실수 입력
		
		// 출력
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다."
				, inputGrade, inputClass, inputNumber, inputName, inputGender, inputResult );
	}

}
