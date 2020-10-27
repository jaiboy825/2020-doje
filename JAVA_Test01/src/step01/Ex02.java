package step01;

/*
 * # 값 교체[문제] 3분 컷
 * 1. x와 y, z의 값을 교체한다.
 * 2. x 값은  z, y 값은 x, z 값은 y 로 이동시킨다.
 * z = 10
 * x = 20
 * y = 30
 * 3. 교체 후, 결과를 출력하면 다음과 같다.
 * 4. 변수의 값을 실제로 변경하지 않고 출력시 감점
 * 정답)
 * x = 30
 * y = 10
 * z = 20
 */

public class Ex02 {
	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = 30;
		int temp = 0;
		temp = z;
		z = y;
		y = x;
		x = temp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		
		
	}
}
