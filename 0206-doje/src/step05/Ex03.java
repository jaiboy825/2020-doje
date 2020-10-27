package step05;

import java.util.Arrays;
import java.util.Scanner;

// # 관리비[문제]

public class Ex03 {
	public static void main(String[] args) {

		int[][] apt = {
			{101, 102, 103},	
			{201, 202, 203},	
			{301, 302, 303}	
		};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
		int[] pays = new int[3];
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		int price = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				price = price + pay[i][j];
				pays[i] = price;
			}
			
		}
		System.out.println(Arrays.toString(pays));//문제1끝
		System.out.println("문제 1 컽!");
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		Scanner in = new Scanner(System.in);
		System.out.println("호를 입력하세요 : ");
		int ho = in.nextInt();
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(ho == apt[i][j]) {
					System.out.println(pay[i][j]);
				}
			}
		}
		System.out.println("문제 2 컽!");
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int max = 0; 
		int maxa = 0;
		int min = 9999;
		int mina = 0;
		for(int i = 0; i < 3; i++) {
			for(int j  = 0; j < 3; j++) {
				if(max < pay[i][j]) {
					max = pay[i][j];
					maxa = apt[i][j];
				}
				
			}
			
		}
		System.out.println("가장 많이 나온집 ("+maxa+")");
		
		for(int i = 0; i < 3; i++) {
			for(int j  = 0; j < 3; j++) {
				if(min > pay[i][j]) {
					min = pay[i][j];
					mina = apt[i][j];
					
				}
				
			}
			
		}
		System.out.println("가장 적게 나온집 ("+mina+")");
		System.out.println("문제 3컽!");
		// 문제 4) 호 2개를 입력하면 관리비 교체
		int ho1p = 0;
		int ho2p = 0;
		int hotemp = 0;
		System.out.println("호를 입력하세요");
		int ho1 = in.nextInt();
		System.out.println("호를 입력하세요");
		int ho2 = in.nextInt();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0;j < 3; j++) {
				if(ho1 == apt[i][j]) {
					ho1p = pay[i][j];
				}
				if(ho2 == apt[i][j]) {
					ho2p = pay[i][j];
				}
				
			}
		}
		hotemp = ho1p;
		ho1p = ho2p;
		ho2p = hotemp;
		for(int i = 0; i < 3; i++) {
			for(int j = 0;j < 3; j++) {
				if(ho1 == apt[i][j]) {
					pay[i][j] = ho2p;
				}
				if(ho2 == apt[i][j]) {
					pay[i][j] = ho1p;
				}
				
			}
		}
		System.out.println(ho1p);
		System.out.println(ho2p);
	}
}
