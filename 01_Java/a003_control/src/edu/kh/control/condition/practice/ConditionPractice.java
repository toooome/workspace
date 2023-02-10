package edu.kh.control.condition.practice;

import java.util.Scanner;



// 실습문제 작성 클래스
public class ConditionPractice {
	
	public void practice1( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
			
		if(num<0) {
			System.out.println("양수만 입력해주세요");
			
		} else if (num/2 == 0) {
			System.out.println("짝수입니다.");
			
		// } else (num/2 == 1) {
			System.out.println("홀수입니다.");
		}
		
		
	}
	
	
	
	public void practice2( ) {
		
	}
	
	
	
	public void practice3( ) {
		
	}
	
	
	
	public void practice4( ) {
		
	}
	
	
	
	public void practice5( ) {
		
	}
}
