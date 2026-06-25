package studyjava.middle;

class JslhrdStudent {
	//이제부터는 멤버변수를 만들때는 무조건 private 접근제한자를 붙이고
	//getter, setter 메서드를 만들어서 사용한다
	private int idx; //학번
	private String name; //이름
	private int score; //점수
	
	public int getIdx() {
		return idx;
	}
	
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
//	JslhrdStudent(int idx, String name, int score) {
//		this.idx = idx;
//		this.name = name;
//		this.score = score;
//	}
	
}


public class Java30_GetterSetter {

	public static void main(String[] args) {
//		JslhrdStudent jds = new JslhrdStudent(1, "홍길동", 100);
//		jds.idx =2;

		JslhrdStudent jds = new JslhrdStudent();
//		jds.idx =2;
		jds.setIdx(2);
		System.out.println(jds.getIdx());
		
		
	}

}
