package jdbc.artist;

public class ArtistDTO {

	private String artistId;
	private String artistName;
	private String artistGender;
	private String artistBirth;
	private String talent;
	private String agency;
	
	private int serialNo;
	private int point;
	private String grade;
	private String mentoName;
	
	private int tpoint;
	private double apoint;
	
	public String getArtistId() {
		return artistId;
	}
	
	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}
	
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	
	public String getArtistGender() {
		return artistGender;
	}
	
	public void setArtistGender(String artistGender) {
		this.artistGender = artistGender;
	}
	
	public String getArtistBirth() {
		return artistBirth;
	}
	
	public void setArtistBirth(String artistBirth) {
		this.artistBirth = artistBirth;
	}
	
	public String getTalent() {
		return talent;
	}
	
	public void setTalent(String talent) {
		this.talent = talent;
	}
	
	public String getAgency() {
		return agency;
	}
	
	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMentoName() {
		return mentoName;
	}

	public void setMentoName(String mentoName) {
		this.mentoName = mentoName;
	}
	
	public int getTpoint() {
		return tpoint;
	}

	public void setTpoint(int tpoint) {
		this.tpoint = tpoint;
	}

	public double getApoint() {
		return apoint;
	}

	public void setApoint(double apoint) {
		this.apoint = apoint;
	}

	@Override
	public String toString() {
		// 성별 변환
	    String genderStr = artistGender.equals("M") ? "남성" : "여성";
	    
	    // 특기 변환
	    String talentStr;
	    if(talent.equals("1")) talentStr = "댄스";
	    else if(talent.equals("2")) talentStr = "랩";
	    else talentStr = "노래";
	    
	    // 생년월일 변환
	    String year = artistBirth.substring(0, 4) + "년";
	    String month = artistBirth.substring(4, 6) + "월";
	    String day = artistBirth.substring(6, 8) + "일";
	    
	    return artistId + "\t" + artistName + "\t" + genderStr + "\t" + year + month + day + "\t" + talentStr + "\t" + agency;
	}
}
