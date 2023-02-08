package edu.kh.operater.ex;

import java.util.Scanner; // Scanner import 코드

public class OperaterEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		// 산술 연산자 : + - * / %(modulo, moduler, *mod : 나머지)
		
		System.out.println("두 정수를 입력 받아 산술 연산 결과 출력하기");
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d \n", input1, input2, input1+input2); 
		// \n 줄바꿈 escape 문자
		
		System.out.printf("%d - %d = %d \n", input1, input2, input1-input2);
		
		System.out.printf("%d * %d = %d \n", input1, input2, input1*input2);

		System.out.printf("%d / %d = %d \n", input1, input2, input1/input2);

		System.out.printf("%d %% %d = %d \n", input1, input2, input1%input2);
		// printf로 패턴을 쓸 때 %를 사용하기 때문에 몫을 구하는 연산자 %와 구분하기 위해  
		// %%를 사용 (최종 결과에선 % 하나만 보임)
		// %를 한 번만 쓰고 실행하면 에러가 남 (% 뒤에 뭔가 나와야 함)
		
	}
}
