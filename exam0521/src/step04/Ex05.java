package step04;

import java.util.Random;

/*
 * # 셔플  - 주석 2개 채우기
 * 1. 100번을 반복한다.
 * 2. 0 ~ 9사이의 랜덤한 숫자를 저장한다.
 * 3. arr의  1번째 값과  0~9 사이의 랜덤 숫자가 인덱스가 되는 위치의 값을 교체한다.
 * 4. 이를 통해 arr 배열의 값을 섞을 수 있다.
 */

public class Ex05 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < 100; i++) {
			int r = ran.nextInt(arr.length); //1. ran.nextInt(    ) 과 동일한 코드가 되는 () 안에 알맞은 숫자를 적으면? (9)+1
			
			//2.  셔플하는 과정에 해당하는 코드를 적으시오. arr의 1번째 값과  arr의 r번째 값을 교체함(3줄)
			int temp = arr[1];
			arr[1] = arr[r];
			arr[r] = temp;
			
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
