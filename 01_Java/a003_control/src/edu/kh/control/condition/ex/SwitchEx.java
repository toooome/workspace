package edu.kh.control.condition.ex;

import java.util.Scanner;

public class SwitchEx {

	/* switch문 (switch - case문)
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문 
	 * -> 식의 결과에 맞는 case문이 수행됨
	 * 
	 * [작성법]
	 * switch(식){ // 식 수행 결과는 true or false가 아닌 값
	 * 				  예) *정수, 실수, *문자열 (문자 하나 빼고 다 됨)
	 * 
	 * case 결과값1 : 수행코드1; break; 
	 * case 결과값2 : 수행코드2; break; 
	 * case 결과값3 : 수행코드3; break; 
	 * default : 모든 case가 만족하지 않을 경우 수행하는 코드; (=else)
	 * 
	 * }
	 * */
	
	// switch 예시 1 
	public void ex1() {
		// 키보드로 정수를 입력 받아서 
		// 1 이면 "RED"
		// 2 이면 "ORANGE"
		// 3 이면 "YELLOW"
		// 4 이면 "GREEN"
		// 1~4 아니면 "BLUE" 를 출력
		
		// sc -> ctrl + spacebar (자동완성 단축키)
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String res; // 결과 저장할 변수
		
		// 1) if - else if - else 버전
//		if(input == 1) {
//			res = "RED";
//		
//		} else if(input == 2) {
//			res = "ORANGE";
//			
//		} else if(input == 3) {
//			res = "YELLOW"; 
//			
//		} else if(input == 4) {
//			res = "GREEN";
//			
//		} else {
//			res = "BLUE";
//
//		}
		
		// 2) switch 버전
		switch(input) {
		
		case 1 : res = "RED"; break; // input이 1인 경우
		case 2 : res = "ORANGE"; break;
		case 3 : res = "YELLOW"; break;
		case 4 : res = "GREEN"; break;
		default : res = "BLUE";
	
		}
		
		System.out.println(res);
		
	}
		
	
	
	// switch 예시 2
	public void ex2() {
		
		
		// 랜덤 팀 배정 프로그램
		// (백팀 0 , 청팀 1 , 홍팀 2)
		
		// * Java에서 난수(랜덤)를 발생시키는 방법
		// Math.random(); 
		// 1) 난수 발생 범위 : 0.0 <= random < 1.0
		// 2) 발생한 난수의 자료형 : double
		// + 실수 -> 정수 강제 형변환 : 소수점 버림 
		
		// Math.random();	 	// 0.0 <= random < 1.0
		
		// Math.random() * 3 	// 0.0 <= random * 3 < 3.0
		
		int random = (int)(Math.random() * 3);		
					 // 0 <= (int)(random * 3) < 3
		// 0, 1, 2 중 하나 무작위 발생

		String result; 
		switch(random) {
		case 0 : result = "백팀"; break;
		case 1 : result = "청팀"; break;
		default : result = "홍팀";
		}
		
		System.out.println(result);
	}

	
	
	// switch 예시 3 : 식의 결과가 "문자열" (String)
	public void ex3() {
		
		// scan -> ctrl + spacebar -> enter
		
		Scanner sc = new Scanner(System.in);
		
		// 메뉴를 입력 받아서 가격이 얼마인지 출력하기
		
		System.out.println("메뉴를 입력하세요 (김밥/라면/샌드위치/떡볶이) : ");
		
		String input = sc.next();
		
		int price; // 가격을 저장할 변수 선언
		
		switch(input) {
		
		case "김밥" : 		price = 4500; break;
		case "라면" : 		price = 3500; break;
		case "샌드위치" :   price = 5800; break;
		case "떡볶이" : 	price = 4000; 
		default : price = -1; 
		// 잘못 입력한 경우에 사용하지 않는 숫자(-1)를 이용해 표현
		}
		
		if(price != -1) {
			System.out.printf("%s은/는 %d원 입니다.", input, price);
		} else { // price가 -1인 경우
			System.out.println("존재하지 않는 메뉴입니다.");
		}
		
	}
	
	
	
	// switch 예시 4 
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
	      // 산술 연산 계산기 만들기
	      // 두 정수(int)와 1개의 연산자( + - * / % (String) )를 입력 받아서 
	      // 연산 결과를 출력
	      // 단, 나누기(/) 연산 시 0으로는 나눌 수 없도록 한다.
		
		  // [실행 화면]
	      // 정수1 입력 : 5
	      // 연산자 입력 : +
	      // 정수2 입력 : 4
	      // 5 + 4 = 9
	      
	      // [실행 화면]
	      // 정수1 입력 : 5
	      // 연산자 입력 : /
	      // 정수2 입력 : 0
	      // 0으로는 나눌 수 없습니다.
	      
	      // [실행 화면]
	      // 정수1 입력 : 5
	      // 연산자 입력 : @
	      // 정수2 입력 : 3
	      // 존재하지 않는 연산자 입니다.
		
		
		System.out.println("[실행 화면]");
		
		System.out.print("정수1 입력 : ");	
		int num1 = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		String input = sc.next(); // + - * / %
		
		System.out.print("정수2 입력 : ");	
		int num2 = sc.nextInt();
	
		switch(input) {
		case "+" : System.out.println(num1 + num2);
				   //System.out.printf(%d %s %d = %d, num1, input, num2, num1+num2);
		 	break;
		 	
		case "-" : System.out.println(num1 - num2); 
				  //System.out.printf(%d %s %d = %d, num1, input, num2, num1-num2);
			break;
			
		case "*" : System.out.println(num1 * num2); 
				  //System.out.printf(%d %s %d = %d, num1, input, num2, num1*num2);
			break;
			
		case "/" : 
			if(num2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
			} else {
				// System.out.println(num1 / num2);
				System.out.printf("%d %s %d = %.2f", 
								  num1, input, num2, (double)num1/num2);
			} break;
			
		case "%" : 
			if(num2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
			} else {
				System.out.println(num1 % num2); 
				
			} break;
		
		default : System.out.println("존재하지 않는 연산자입니다.");
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
