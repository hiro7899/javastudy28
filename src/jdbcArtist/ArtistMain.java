package jdbcArtist;

import java.util.List;
import java.util.Scanner;

public class ArtistMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		ArtistDAO dao = new ArtistDAO();
		
		boolean flag = true;
		
		while(flag) {
			System.out.print("[1]등록[2]출력[0]종료 : ");
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
					dao.formatSelect(artist);
					System.out.println(artist);
				}
				
			}else if(menu == 0) {
				flag = false;
						
			}else {
				
			}
		}
		scanner.close();
	}

}
