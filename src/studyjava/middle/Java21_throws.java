package studyjava.middle;

public class Java21_throws {
	
    static int [] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    
    public static void main(String[] args) {
        method1();
    }
    
    static void method1() {
        try {
            method2();
            //예외는 발생한 곳에서 처리하지 않으면 호출한 메서드로 전달되기 때문입니다.
        } catch (Exception e) {
        	//Exception은 모든 예외처리를 하는 최고 조상이다
            System.out.println("in method1");
        }
    }
    
    static void method2() {
        try {
            System.out.println(month[12]);
            //ArrayIndexOutOfBoundsException 예외가 발생된다
        } catch (NumberFormatException ne) {
        	//실행하지 않는다. 왜? 발생된 예외와 같지 않기 때문에...
        	//호출한 곳으로 ArrayIndexOutOfBoundsException 예외를 전달해준다
            System.out.println("in method2");
        }
    }
}