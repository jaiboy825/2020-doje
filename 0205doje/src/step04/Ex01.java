package step04;

/*
 * # OMR카드[문제]
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 student에는 총 5명의 학생들의 OMR카드 값이 기록되어 있다.
 * 3. answer와 student 값을 비교해 정오표와 성적을 출력한다. 
 * 4. 점수는 한 문제당 20점이다.
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * student[0] = {1, 1, 4, 4, 3}
 * "0번 학생 {O, X, O, X, X} : 40점" 
 * 
 */

public class Ex01 {
	public static void main(String[] args) {
		int[] answer = {1, 3, 4, 2, 5};
		String[] score = new String[5];
		int is = 0;
		int js = 0;
		int cnt = 0;
		int scorei = 0;
		int[][] student = {
				{1, 1, 4, 4, 3},
				{2, 3, 4, 5, 2},
				{1, 3, 4, 2, 4},
				{1, 2, 4, 2, 5},
				{1, 3, 4, 2, 5}
		};
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(answer[j] == student[i][j]) {
					score[j]	= "O";
				}else {
					score[j] = "X";
				}
				if(score[j] == "O") {
					scorei = scorei+ 20;
				}
					
			}
//			System.out.println("answer = {"+answer+"}");
			System.out.print(i+"번 학생{ "+score[0]+", "+score[1]+", "+score[2]+", "+score[3]+", "+score[4]+ " } :" + scorei+"점");	
			System.out.println();
			scorei = 0;
			
		}
		//이곳에 코드를 작성하시오.
		
	}
}
