package edu.kh.control.loop.practice;

import java.util.Scanner;

// 실습문제용 클래스
public class ForPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else {
		for (int i = 1 ; i <= num ; i++) {
			System.out.print(i + " ");
			}
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else {
		for (int i = num ; i >= 1 ; i--) {
			System.out.print(i + " ");
			}
		}
		
	}
	
	public void practice3() { 
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		// 풀이1)		
		int sum = 0; // 합계용 변수
		
		for(int i=1 ; i<=input ; i++) {
			sum += i;
			System.out.print(i);
			
			// i == input == 마지막
			if(i != input) { // 마지막이 아니다
				System.out.print(" + ");
			}
		}
		
		System.out.println(" = " + sum);
	
	}
	
		// 풀이2) 		
//		int sum = 0;
//
//		for(int i=1 ; i<=input ; i++) {
//			sum += i;
//
//			if(i == input) { // 마지막
//				System.out.print(i + " = " + sum);
//		
//			} else { // 마지막이 아님
//				System.out.print(i + " + ");	
//			}
//	
//		}
	
		
		// if문을 안 쓰는 경우
		
//		int sum = 0;
//		
//		for(int i=1 ; i<=input-1 ; i++) {
//			sum += i;
//			System.out.print(i + " + ");
//		}
//		
//		sum += input;
//		System.out.println(input + " = " + sum);
//		
		

}
