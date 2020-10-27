package step05;

import java.util.Arrays;

/*
 * # 정렬하기[문제]
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 * 마지막 단계만 출력되면 정답
 */

public class Ex02 {
	public static void main(String[] args) {
		int[] score = { 10, 50, 30, 40, 80, 7 };
		int max = 0;
		
		for (int i = 0; i < score.length; i++) {
			int temp =0;
			int maxcnt = score.length+1;
			for (int j = i+1; j < score.length; j++) {
				if(score[i] < score[j]) {
					maxcnt = j;//1
				}
			}
			if(maxcnt != score.length+1) {
				temp = score[i];//10
				score[i] = score[maxcnt];//50
				score[maxcnt] = temp;//10
			}
			
		}
		System.out.println(Arrays.toString(score));
			
		
	}
}
