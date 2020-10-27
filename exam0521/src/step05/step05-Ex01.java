package step05;

import java.util.Scanner;

/*
 * # 최대값 구하기(3단계)
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 */

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int cnt = 0;
		while(true) {
			
			for(int i=0; i<5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			int maxNum = 0;
			int maxIdx = 0;
			for(int i=0; i<5; i++) {
				if(maxNum < arr[i]) { 
					//1. 최댓값을 찾아서 인덱스 기억하기
					maxNum = arr[i];
					maxIdx = i;
				}
			}
			
			System.out.print("입력 : ");
			int myMaxNum = scan.nextInt();
			
			if(maxNum == myMaxNum) { //2. 사용자가 입력한 값 myMaxNum 과 일치하는지 확인
				arr[maxIdx] = 0;     //3. 일치하면 해당 인덱스의 값을 0으로 변경하기
				cnt += 1;            //4. 5개 정수가 모두 찾아졌는지 카운팅하기
			}
			
			if(cnt == 5) {   //5. 5개 값을 모두 순서대로 찾아서 0으로 변경하고 나면 while문 탈출
				break;
			}
		}	
		scan.close();
	}
}
