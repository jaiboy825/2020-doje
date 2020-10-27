package step6;

public class Student2 {
	private String name = "";
	private int[] marking = new int[5];
	public boolean[] result = new boolean[5];
	public int score = 0;
	
	public void scoring(int[] answer) {
		for(int i = 0; i < answer.length; i++) {
			result[i] = marking[i] == answer[i];
			
			if(result[i]) score += 20;
		}
	}
	
	@Override
	public String toString() {
		String ox = "";
		for(int i = 0; i < result.length; i++) {
			if(result[i]) ox += "O";
			else ox += "X";
			if(i != result.length - 1) ox += ", ";
		}
		return name + " : [" + ox + "] " + score + "점";
	}
	
	public void setData(String lineData) {
		String[] nameData = lineData.split(":");
		this.name = nameData[0];
		String[] answer = nameData[1].split(",");
		for(int i = 0; i < answer.length; i++) {
			marking[i] = Integer.parseInt(answer[i]);
		}
	}
}
