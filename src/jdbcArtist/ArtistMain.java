package jdbcArtist;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class ArtistMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		ArtistDAO dao = new ArtistDAO();
		EmpDAO eDao = new EmpDAO();
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("[1]등록[2]참가자목록[3]멘토점수목록[4]참가자등수조회[5]OUTER JOIN[0]종료 : ");
			int menu = scanner.nextInt();
			
			if(menu == 1) {
				System.out.print("참가번호 : ");
				String artistId = scanner.next();
				
				System.out.print("참가자명 : ");
				String artistName = scanner.next();
				
				System.out.print("성별[남자:M,여자:F] : ");
				String artistGender = scanner.next();
				
				System.out.print("생년월일 : ");
				String artistBirth = scanner.next();
				
				System.out.print("특기[1.댄스,2.랩,3.노래] : ");
				String talent = scanner.next();
				
				System.out.print("소속사 : ");
				String agency = scanner.next();
				
				ArtistDTO artist = new ArtistDTO();
				
				artist.setArtistId(artistId);
				artist.setArtistName(artistName);
				artist.setArtistGender(artistGender);
				artist.setArtistBirth(artistBirth);
				artist.setTalent(talent);
				artist.setAgency(agency);
				
				dao.add(artist);
				
			}else if(menu == 2) {
				System.out.println("참가번호\t참가자명\t성별\t생년월일\t\t특기\t소속사");
				List<ArtistDTO> artists = dao.select();
				
				for(ArtistDTO artist : artists) {
					System.out.println(artist);
				}
				
			}else if(menu == 3) {
				System.out.println("채점번호\t참가번호\t참가자명\t생년월일\t\t점수\t평점\t멘토");
				List<ArtistDTO> artists = dao.selectMentoPoint();
				
				for(ArtistDTO artist : artists) {
					System.out.print(artist.getSerialNo() + "\t");
					System.out.print(artist.getArtistId() + "\t");
					System.out.print(artist.getArtistName() + "\t");
					System.out.print(artist.getArtistBirth().substring(0, 4) + "년" 
							+ artist.getArtistBirth().substring(4, 6) + "월" 
							+ artist.getArtistBirth().substring(6, 8) + "일\t");
					System.out.print(artist.getPoint() + "\t");
					System.out.print(artist.getGrade() + "\t");
					System.out.println(artist.getMentoName());
				}
				
			}else if(menu == 4) {
				DecimalFormat df = new DecimalFormat("#.00");
				
				System.out.println("참가번호\t참가자명\t성별\t총점\t평균\t등수");
				
				List<ArtistDTO> artists = dao.selectRank();
				
				int rank = 1;
				for(ArtistDTO artist : artists) {
					System.out.print(artist.getArtistId() + "\t");
					System.out.print(artist.getArtistName() + "\t");
					System.out.print((artist.getArtistGender().equals("M") ? "남성" : "여성") + "\t");
					System.out.print(artist.getTpoint() + "\t");
					System.out.print(df.format(artist.getApoint()) + "\t");
					System.out.println(rank);
					rank++;
				}
				
			}else if(menu == 5) { 
				System.out.println("직원이름\t부서명");
				List<EmpDTO> emps = eDao.empPrint();
				
				for(EmpDTO emp : emps) {
					System.out.print(emp.getEmpName() + "\t");
					System.out.println((emp.getDeptName() == null ? " " : emp.getDeptName()));
				}
				
			}else if(menu == 0) {
				flag = false;
						
			}else {
				System.out.println("잘못된 입력 : " + menu);
			}
		}
		scanner.close();
	}

}
