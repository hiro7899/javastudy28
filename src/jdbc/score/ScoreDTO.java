package jdbc.score;

public class ScoreDTO {

	//오라클 테이블을 참조하여 멤버변수를 만든다
	
	private int idx;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	private int tot;
	private double ave;
	private String grade;
	
	private int tkor;
	private int teng;
	private int tmat;
	
	private double akor;
	private double aeng;
	private double amat;
	
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
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMat() {
		return mat;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAve() {
		return ave;
	}

	public void setAve(double ave) {
		this.ave = ave;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getTkor() {
		return tkor;
	}

	public void setTkor(int tkor) {
		this.tkor = tkor;
	}

	public int getTeng() {
		return teng;
	}

	public void setTeng(int teng) {
		this.teng = teng;
	}

	public int getTmat() {
		return tmat;
	}

	public void setTmat(int tmat) {
		this.tmat = tmat;
	}

	public double getAkor() {
		return akor;
	}

	public void setAkor(double akor) {
		this.akor = akor;
	}

	public double getAeng() {
		return aeng;
	}

	public void setAeng(double aeng) {
		this.aeng = aeng;
	}

	public double getAmat() {
		return amat;
	}

	public void setAmat(double amat) {
		this.amat = amat;
	}

	@Override
	public String toString() {
		return String.format("%d\t%s\t%d\t%d\t%d", this.idx, this.name, this.kor, this.eng, this.mat);
	}
}
