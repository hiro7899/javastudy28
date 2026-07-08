package jdbcArtist;

public class ArtistDTO {

	private String artistId;
	private String artistName;
	private String artistGender;
	private String artistBirth;
	private String talent;
	private String agency;
	
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
	
	@Override
	public String toString() {
		if(artistGender.equals("M")) {
			artistGender = "남자";
		}else {
			artistGender = "여자";
		}
		
		if(talent.equals("1")) {
			talent = "댄스";
		}else if (talent.equals("2")) {
			talent = "랩";
		}else {
			talent = "노래";
		}
		
		String year = artistBirth.substring(0, 4) + "년";
		String month = artistBirth.substring(4, 6) + "월";
		String day = artistBirth.substring(6, 8) + "일";
		
		artistBirth = year + month + day;
		
		return artistId + "\t" + artistName + "\t" + artistGender + "\t" + artistBirth + "\t" + talent + "\t" + agency;
	}
	
}
