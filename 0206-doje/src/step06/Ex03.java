package step06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
	private String[] oxArr = new String[5];
	private int score = 0;
	private int rank = 0;

	public String getName() {
		return this.name;
	}

	public int[] getMarking() {
		return marking;
	}

	public String[] getOxArr() {
		return oxArr;
	}

	public void setOxArr(String[] oxArr) {
		this.oxArr = oxArr;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}
	public void setRank(int rnk) {
		this.rank = rnk;
	}
	public int getRank() {
		return rank;
	}

	public void setScore() {
		this.score += 20;
	}

	public void setMarking(String marking) {
		String[] temp = marking.split(",");
//		System.out.println(Arrays.toString(temp));
		for (int i = 0; i < 5; i++) {
			this.marking[i] = Integer.parseInt(temp[i]);
		}
	}

	private String re;

	public String toString() {
		return re;
	}

	public void setString(String str) {
		this.re = str;
	}

}

class OmrCard {
	private int[] answer = { 1, 3, 4, 2, 5 }; // 시험답안
	private int[] answerCnt = new int[5];
	private List<Student2> markData = new ArrayList<>();
	private List<String> jd = new ArrayList<>();

	public void readData(String file) {
		// data.txt 파일을 읽어들여서 markData를 만들어줌.
		File data = new File(file);
		try {
			FileInputStream fis = new FileInputStream(data);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

			while (true) {
				Student2 s = new Student2();
				String line = br.readLine();
				if (line == null) {
					break;
				}
				String[] a = line.split(":");
				s.setName(a[0]);
				s.setMarking(a[1]);
				markData.add(s);
			}

//			for(int i = 0; i < markData.size(); i++) {
//				System.out.println(markData.get(i));
//			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
	}

	public void scoring() {
		// 읽어들인 데이터를 채점하여 각 학생별로 정오표와 점수를 기록
		// 이를 위해 필요한 멤버변수를 Student에 만들어 줄 수 있음.
		// 문제당 20점으로 하여 채점함.
		for (Student2 s : markData) {
			returnString(s);
		}

		Comparator<Student2> salesComparator = new Comparator<Student2>() {
			@Override
			public int compare(Student2 o1, Student2 o2) {
				return o2.getScore() - o1.getScore();
			}
		};

		Collections.sort(markData, salesComparator);
//		for (Student2 a : markData) {
//		}
//		int rnk = 1;
		for(int i=0; i < markData.size(); i++) {
			int rnk = 1;
			for(int j= 0; j< markData.size(); j++) {
				if(markData.get(i).getScore()< markData.get(j).getScore() ) rnk++;
			}
			markData.get(i).setRank(rnk);
			
		}
		for (Student2 s : markData) {
			String[] oxArr = new String[5];
			int[] mar = s.getMarking();
			
			for (int i = 0; i < answer.length; i++) {
				if (answer[i] == mar[i]) {
					s.setScore();
					oxArr[i] = "0";
					answerCnt[i] ++;
				} else {
					oxArr[i] = "X";
				}
			}
			s.setOxArr(oxArr);
			
			s.setString(s.getName() + " : " + Arrays.toString(s.getOxArr()) + " " + s.getScore() / 2 + "점" + s.getRank() +"등");
			System.out.println(s.toString());
		}

	}

	public void printStatus(String file) {
		// 다음과 같은 형식으로 25명의 데이터를 주어진 파일명으로 출력한다.
		// 같은 점수는 같은 등수로 하고 다음등수는 해당인원을 합친 다음부터 시작한다. 즉 1등이 3명이면 다음 점수는 4등이다.
		// [소프트웨어 도제반 성적표]
		// 강은진 : [O, O, O, O, O] 100점 1등
		// 이유진 : [O, O, O, O, O] 100점 1등
		// 강영미 : [O, O, O, X, O] 80점 4등
		// ............................
		// 최선한 : [X, X, X, X, X] 0점 25등
		// ================================
		// 총점 : 0000점, 평균 : XX.XX점
		// 최고점 : XX점, 최저점 : XX점
		// 문항별 정답율
		// [1번 : 45.00%, 2번 :84.00%, 3번 : 100.00%, 4번 :45.00%, 5번:80.00%]

		// 문항별 정답율은 해당 문항을 맞춘 사람의 수를 전체 응답자수의 백분율로 구한 수이다.
		File result = new File(file);
		
		try {
			result.createNewFile();
//			System.out.println("dsasd");
			FileOutputStream fos = new FileOutputStream(file);
			fos.write("[소프트웨어 도제반 성적표]\n".getBytes());
			int sum =0;
			int cnt =0;
			int max = 0;
			int min = 32113;
			for(Student2 s : markData) {
				cnt++;
				String a = s.toString() + "\n";
				sum += s.getScore() / 2;
				fos.write(a.getBytes());
				if(max < s.getScore() / 2) {
					max = s.getScore() / 2;
				}
				if(min > s.getScore() / 2){
					min = s.getScore() / 2;
				}
			}
			fos.write("=================================\n".getBytes());
			String b = "총점 : " + sum + ", 평균 : " + (double) sum / cnt +"점\n";
			fos.write(b.getBytes());
			b = "최고점 : " + max + "점 , 최저점 : " + min +"점\n";
			fos.write(b.getBytes());
			fos.write("문항별 정답율\n".getBytes());
			b = "[";
			for(int i =0; i < answerCnt.length; i++) {
				b+=i+"번 : " +100*((double)answerCnt[i] / cnt) +"%, ";
			}
			b+="]\n";
			
			fos.write(b.getBytes());
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	private void returnString(Student2 s) {
		String[] oxArr = new String[5];
		int[] mar = s.getMarking();
		String name = s.getName();
		int rnk = 1;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == mar[i]) {
				s.setScore();
				oxArr[i] = "0";
			} else {
				oxArr[i] = "X";
			}
		}
		s.setOxArr(oxArr);

		jd.add(name + " : " + Arrays.toString(s.getOxArr()) + " " + s.getScore() + "점" + rnk + "등");

//		

	}
}

public class Ex03 {
	public static void main(String[] args) {

		OmrCard omr = new OmrCard();
		omr.readData("data/data.txt");
		omr.scoring();
		omr.printStatus("data/result.txt");
	}
}