package step02;
/*
 * 다음 코드를 실행한 결과를 적으시오. 다음 줄에 적으면 됩니다.
 * 세 정수 0보다 크고 100이하인 수로 입력합니다.
 * 답)   중간값      를(을) 구하는 프로그램입니다.
 * 자신이 입력한 수와 결과화면을 다음 줄에 복사 붙여넣기 합니다.
 * 
 * a의 값：5
   b의 값：1
   c의 값：2
      결과는 2입니다.
 * 
 */
import java.util.Scanner;

class Bonus01 {
    static int result(int a, int b, int c) {
        if (a >= b) //5 > 1
            if (b >= c) return b; 
            else if (a <= c) return a;
            else   return c;
        else if (a > c) return a;
        else if (b > c) return c;
        else return b;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        System.out.println("세 정수를 입력하시오.");
        System.out.print("a의 값：");    
        int a = in.nextInt();
        System.out.print("b의 값：");    
        int b = in.nextInt();
        System.out.print("c의 값：");    
        int c = in.nextInt();
 
        System.out.println("결과는 " + result(a, b, c) + "입니다.");
        in.close();
    }
}
