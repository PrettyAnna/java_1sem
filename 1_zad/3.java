public class Main {
    public static void main(String[] args) {
    	Factorial printer = new Factorial();
    	printer.print(10);
	}
 
}
 
class Factorial {
	public void print(int n) {
		int result = 1;
	    if (n == 0 || n == 1) {
	        System.out.println(1);
	        return;
	    }
	    for (int i = 2; i <= n; i++) {
	        result = result * i;
	    }
	    System.out.println(result);
	} 
}
