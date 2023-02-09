package edu.kh.operater.practice;

import java.util.Scanner;

public class OperatorPractice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("[실행화면]");

		System.out.print("인원 수 : ");
		int member = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		int result1 = candy / member;
		int result2 = candy % member;

		// System.out.println(); // 줄 바꿈
		
		System.out.println("\n1인당 사탕 개수 : " + result1); // 다음 값이 나오기 전에 \n를 이용해 줄바꿈
		System.out.print("남은 사탕 개수 : " + result2);
		
		// System.out.println("1인당 사탕 개수 : " + (candy / member) );
		// System.out.println("남는 사탕 개수 : " + (candy % member) );
		
	}

}
