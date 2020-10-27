package step05;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 최대값 구하기(3단계)[문제]
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
		Scanner in = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		int max =0;
		int maxc = 0;
	
		
		
		while(true) {
			int cnt = 0;
			System.out.println(Arrays.toString(arr));
			for(int i =0; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
					maxc = i;
					//max값 지정
				}
			}
			System.out.print("입력 : ");
			int n = in.nextInt();
			if(max == n) {
				arr[maxc] = 0;
				max =0;
			}
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == 0) {
					cnt ++;
				}
			}
			if(arr.length == cnt) {
				System.out.println("종료");
				System.out.println(Arrays.toString(arr));
				break;
				
			}
		}
		}
	}
