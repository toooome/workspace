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
		
	
	public void practice5() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.printf("======= %단 ======= \n", dan);
		
		for(int i=1 ; i<=9 ; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan*i);
		}
		
	}
	
	
	
	public void practice8() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=input ; row>=1 ; row--) {
			
			for(int col=row ; col>=1 ; col--) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	
	}
	
	
	
	public void practice11() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++) {

			/* for문 2개*/
			// 빈칸(@) 먼저 출력
			for(int col=input-row ; col>=1 ; col--) {
				System.out.print(" ");
			}
			
			for(int col=1 ; col<=row*2-1 ; col++) {
				System.out.print("*");
			}
			
		System.out.println(" ");
		
		}
	}
	
	
	public void practice12() { 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1 ; row<=input ; row++) {
			
			for(int col=1; col<=input ; col++) {
				if(row==1 || row==input || col==1 || col==input) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
				
				System.out.print("*");
			}
			
			System.out.println(); // 개행
		} 
	
	
	}

	
	
	
	
	
	
	
	
	
	
}
