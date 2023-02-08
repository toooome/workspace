package edu.kh.variable;

public class Practice {

	public static void main(String[] args) {
		
		/* [기본 자료형 8가지]
		 * 
		 * 정수형
		 * : bite(1), short(2), int(기본형, 4), long(8, +L,l 명시)
		 * 
		 * 실수형
		 * : float(4, +F/f 명시), double(기본형, 8)
		 * 
		 * 문자형
		 * : char(2)
		 * 
		 * 논리형
		 * : boolean(1, true or false)
		 * 
		 * 
		 * 
		 * [컴퓨터 값 처리 원칙]
		 * - 같은 자료형 끼리 연산 가능
		 * - 결과도 같은 자료형
		 *
		 *
		 *
		 * [자동 형변환]
		 * - 값의 범위가 다른 자료형끼리의 연산 
		 * - 범위가 작은 자료형을 큰 자료형으로 자동 변환 (by 컴파일러)
		 * 
		 * [강제 형변환]
		 * - 특정 자료형으로 강제 변환 (바꾸고 싶은 자료형을 명시)
		 * - 데이터 손실 발생 가능
		 */
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f; 
		double dNum = 2.5;	
		char ch = 'A';
		
		// System.out.println(); 자동 완성 
		// : syso -> ctrl + spacebar -> enter
		
		System.out.println( iNum1 / iNum2 ); // 2
		
		System.out.println( (int)dNum ); // 2
		
		System.out.println( iNum2 * dNum ); // 10.0
		// 작은 자료형을 큰 자료형으로 자동 형변환 (결과도 double형)
		
		System.out.println( (double)iNum1 ); // 10.0
		// int형을 double형으로 강제 형변환
		
		System.out.println( (double)iNum1 / iNum2 ); // 2.5
		// 둘 중 하나 또는 둘 다 double로
		// : (double)iNum1 / (double)iNum2
		
		// (double)(iNum1 / iNum2) -> 2.0이 되는 오류
		
		System.out.println( (int)fNum ); // 3 만들기
		
		System.out.println( (int)(iNum1 / fNum) );  // 3 만들기
		// 10.0 / 3.0을 하면 3.3333 결과값이 나오고 int로 강제 형변환
		
		System.out.println( iNum1 / fNum ); // 3.3333333
		System.out.println( (double)iNum1 / fNum ); // 3.333333333333335
		// float와 double의 소수점 아래 정확도 차이 (double이 더 정확한 실수값)
		
		System.out.println( (int)ch ); // 65
		
		System.out.println( ch + iNum1 ); // 75
		// int + char 형태에선 값의 범위가 작은 char가 자동 형변환이 됨
		
		System.out.println( (char)(iNum1 + ch) ); // 'K'		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
