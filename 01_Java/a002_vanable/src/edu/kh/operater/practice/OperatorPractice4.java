package edu.kh.operater.practice;

import java.util.Scanner;

public class OperatorPractice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int inputKor = sc.nextInt();

		System.out.print("영어 : ");
		int inputEng = sc.nextInt();

		System.out.print("수학 : ");
		int inputMath = sc.nextInt();

		int sum = inputKor + inputEng + inputMath;
		System.out.println("합계 : " + sum);

		int average = sum / 3;
		System.out.println("평균 : " + average);

		String result = (inputKor >= 40 && inputEng >= 40 && inputMath >= 40)
		&& average >= 60 ? "합격" : "불합격";

		System.out.print(result);

	}

}
