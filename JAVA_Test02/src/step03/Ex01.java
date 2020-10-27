package step03;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임(3단계)[문제]
 * 1. 랜덤 숫자를 2개 저장하여,
 * 2. 구구단 문제를 5회 출제한다.
 * 3. 한 문제당 10점으로 게임 종료 후 게임성적을 출력한다.
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		
		int count = 0;
		int i = 1;
		
		while(i <= 10) { // 1. 반복문의 조건을 완성하시오.
			
			int x = ran.nextInt(8) + 2; // 2.정수 x의 범위는? 2~8
			int y = ran.nextInt(9) + 1; // 3.정수 y의 범위는? 1~9
			
			int answer = x * y;
			
			System.out.print("[" + i + "] "+ x + " X " + y + " = ");
			int myAnswer = in.nextInt();
			
			if(answer == myAnswer) {
				                      // 4.코드를 완성하시오.
				count = count + 1;
				System.out.println("정답!");
			}else {
				System.out.println("오답!");
			}
			i = i+ 1 ; //5. 반복변수 i값을 이용하여 식을 완성하시오.
		}
		
		int score = count * 10 ;  // 6.점수를 계산하시오.  
	  System.out.println("총 " + count + "개의 문제를 맞춰 " + score + "점 입니다.");
		
		in.close();
		
		
	}
}
