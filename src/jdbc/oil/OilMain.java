package jdbc.oil;

import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class OilMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		OilDAO dao = new OilDAO();
		DecimalFormat df = new DecimalFormat("￦#,###");
		
		Connection conn = DBmanager.getInstance();
		boolean flag = true;
		
		if(conn != null) {
			
			while(flag) {
				System.out.print("[1]전체매출조회[2]일매출통계[0]종료: ");
				int menu = scanner.nextInt();
				
				if(menu == 1) {
					System.out.println("매출번호\t주유일자\t\t유종\t\t주유량\t결제방법\t회원성명\t회원번호\t전화번호\t\t카드번호\t\t\t금액");
					
					List<OilDTO> list = dao.selectOilSale();
					
					int total = 0;
					
					for(OilDTO dto : list) {
						System.out.print(dto.getSaleno() + "\t");
						System.out.print(dto.getOildate().substring(0, 4) + "년" 
								+ dto.getOildate().substring(4, 6) + "월" 
								+ dto.getOildate().substring(6, 8) + "일\t");
						System.out.print(dto.getOilname() + "\t\t");
						System.out.print(dto.getAmount() + "\t");
						System.out.print((dto.getPaytype().equals("1") ? "현금" : "카드" ) + "\t");
						System.out.print((dto.getCustname() != null ? dto.getCustname() : "비회원") + "\t");
						System.out.print((dto.getCustno() != null ? dto.getCustno() : "비회원") + "\t");
						System.out.print(((dto.getCusttel1() != null && dto.getCusttel2() != null && dto.getCusttel3() != null)
										? dto.getCusttel1() + "-" + dto.getCusttel2() + "-" + dto.getCusttel3()
										: "000-0000-0000") + "\t");
						System.out.print((dto.getCreditcard() != null ? dto.getCreditcard() : "\t\t" )+ "\t");
						System.out.println(df.format(dto.getOilcost()) + "\t");
						
						total += dto.getOilcost();
					}
					System.out.println("매출총액: ￦" + total);
					
					
				}else if(menu == 2) {
					System.out.println("주유일자\t\t유종\t\t건수\t금액");
					
					List<OilDTO> list = dao.selectDayTotal();
					
					for(OilDTO dto : list) {
						System.out.print(dto.getOildate().substring(0, 4) + "년" 
								+ dto.getOildate().substring(4, 6) + "월" 
								+ dto.getOildate().substring(6, 8) + "일\t");
						System.out.print(dto.getOilname() + "\t\t");
						System.out.print(dto.getCount() + "건\t");
						System.out.println(df.format(dto.getTcost()));
					}
					
				}else if(menu == 0) {
					flag = false;
					System.out.println("종료합니다");
					
				}else {
					System.out.println("잘못된 출력");
				}
				
			}
		}else {
			System.out.println("접속 실패");
		}
		scanner.close();
	}

}
