package studyjava.middle;

public class Bank {

	//멤버변수
	
	String ano; //계좌번호
	String owner; //예금주
	int balance; //잔액

	public Bank(){
		
	}
	
	public Bank(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	
}
