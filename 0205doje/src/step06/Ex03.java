package step06;

import java.util.ArrayList;
import java.util.List;

/*
 * # OMR카드[문제]
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 학생 답안 데이터는 data.txt 파일을 읽어서 student 리스트에 넣어준다. 
 * 3. answer와 student 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * student = {1, 1, 4, 4, 3}
 * 정오표      = {O, X, O, X, X}
 * 성적         = 40점
 */

class Student2 {
	private String name = "";
	private int[] marking = new int[5];
	public int[] getMarking() {
		return marking;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class OmrCard{
	private int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	private List<Student2> markData = new ArrayList<>();
	
	public void readData(String file) {
		//data.txt 파일을 읽어들여서 markData를 만들어줌.
	}
	
	public void scoring() {
		//읽어들인 데이터를 채점하여 각 학생별로 정오표와 점수를 기록 
		// 이를 위해 필요한 멤버변수를 Student에 만들어 줄 수 있음.
		// 문제당 20점으로 하여 채점함.
	}
	public void printStatus(String file) {
		//다음과 같은 형식으로 25명의 데이터를 주어진 파일명으로 출력한다.
		//같은 점수는 같은 등수로 하고 다음등수는 해당인원을 합친 다음부터 시작한다. 즉 1등이 3명이면 다음 점수는 4등이다.
		//[소프트웨어 도제반 성적표]
		//강은진 : [O, O, O, O, O] 100점   1등
		//이유진 : [O, O, O, O, O] 100점   1등
		//강영미 : [O, O, O, X, O]  80점   4등
		// ............................
		//최선한 : [X, X, X, X, X]   0점   25등 
		//================================
		//총점 : 0000점, 평균 : XX.XX점 
		//최고점 : XX점, 최저점 : XX점
		//문항별 정답율
		// [1번 : 45.00%, 2번 :84.00%, 3번 : 100.00%, 4번 :45.00%, 5번:80.00%]
		
		//문항별 정답율은 해당 문항을 맞춘 사람의 수를 전체 응답자수의 백분율로 구한 수이다. 
	}
}

public class Ex03 {
	public static void main(String[] args) {
		
		OmrCard omr = new OmrCard();
		omr.readData("data.txt");
		omr.scoring();
		omr.printStatus("result.txt");
	}
}