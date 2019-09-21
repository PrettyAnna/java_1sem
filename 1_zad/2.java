public class Main {
    public static void main(String[] args) {
    	FibonacсiPrinter printer = new FibonacсiPrinter();
    	printer.print(15);
	}
 
}
 
class FibonacсiPrinter {
	public void print(int n) {
		int first = 0;
		int second = 1;
 
		for (int i = 0; i < n; i++) {
		    if (i == 0) {
			    System.out.println(first);
			    continue;
			}
    		if (i == 1) {
		    	System.out.println(second);
		    	continue;
		    }
            int third = first + second; 
            first = second;
            second = third;
            System.out.println(third);
		}
	} 
}
