package studyjava.P;

class A {
	
	@SuppressWarnings("unused")
	private int pri;
	int def;
	protected int pro;
	public int pub;
	
}

class B extends A{
	void set() {
		super.pub = 1; //가능
		super.pro = 2; //가능
		super.def = 3; //가능
//		super.pri = 4; //불가능
		
	}
}

public class AccessMain extends A {
	
	public static void main(String[] args) {
		
	}
	
}