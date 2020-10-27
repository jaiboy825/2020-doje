package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class OmrCard{
	private int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	private List<Student2> markData = new ArrayList<>();
	
	public void readData(String file) {
		//data.txt 파일을 읽어들여서 markData를 만들어줌.
		File readFile = new File("file/" + file);
		try {
			FileInputStream fis = new FileInputStream(readFile);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				Student2 s = new Student2();
				s.setData(line);
				markData.add(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("해당 파일을 읽을 수 없습니다.");
		}
		
	}
	
	public void scoring() {
		//읽어들인 데이터를 채점하여 각 학생별로 정오표와 점수를 기록 
		// 이를 위해 필요한 멤버변수를 Student에 만들어 줄 수 있음.
		// 문제당 20점으로 하여 채점함.
		for(Student2 s : markData) {
			s.scoring(answer);
		}
		
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
		
		
		
		try {
			File outFile = new File("file/" + file);
			FileOutputStream fos = new FileOutputStream(outFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			int total = 0;
			Student2 max = null;
			Student2 min = null;
			for (Student2 s : markData) {
				bw.write(s.toString());
				bw.newLine();
				
				total += s.score;
				if(max == null || max.score < s.score) {
					max = s;
				}
				if(min == null || min.score > s.score) {
					min = s;
				}
			}
			
			bw.write("========================");
			bw.newLine();
			bw.write("총점 : " + total + "  , 평균 : " + (float)total / markData.size());
			bw.newLine();
			bw.write("최고점 : " + max.score + "점 ,  최저점 : " + min.score + "점");
			
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("해당 파일에 접근할 수 없습니다.");
		}
		
		
		
	}
}