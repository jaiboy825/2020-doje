package step04;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		
		boolean run = true;
		while(run) {
			
			System.out.println("[1]추가");
			System.out.println("[2]삭제");
			System.out.println("[3]삽입");
			System.out.println("[4]출력");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("추가할 값 입력 : ");
				int data = scan.nextInt();
				if(cnt >= arr.length) {
					int[] newArr = aja(arr, 1);
					arr = copyArray(arr, newArr, arr.length);
				}
				arr[cnt] = data;
				cnt++;
			}
			else if(sel == 2) {
				System.out.print("삭제할 위치 입력 : ");
				int dwh = scan.nextInt();
				
				while(dwh < arr.length - 1) {
					arr[dwh] = arr[dwh + 1];
					dwh++;
				}
				cnt--;				
				
			}
			else if(sel == 3) {
				
				System.out.print("삽입할 위치 입력 : ");
				int idx = scan.nextInt();
				
				System.out.print("삽입할 값 입력 : ");
				int data = scan.nextInt();
				
				if(cnt >= arr.length) {
					int[] newArr = aja(arr, 1);
					arr = copyArray(arr, newArr, arr.length);
				}
				int i = arr.length - 2;
				while(i >= idx) {
					arr[i+1] = arr[i];
					i--;
				}
				arr[idx] = data;
				cnt++;
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}else if(sel == 4) {
				for(int i = 0; i < cnt; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("");
			}
			
		}
		
		scan.close();
	}
	
	
	public static int[] aja(int[] arr, int fixLength) {
		int cl = arr.length;
		fixLength += cl;
		int[] newArr = new int[fixLength];
		return newArr;
	}
	
	public static int[] copyArray(int[] arr, int[] target, int cnt) {
		for(int i = 0; i < cnt; i++) {
			target[i] = arr[i];
		}
		return target;
	}
}
