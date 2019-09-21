public class Main {
    public static void main(String[] args) {
        int number = 7;
        Math math = new Math();
        String result = math.toBinary(number);
        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
	}
 
}
 
class Math {
	public String toBinary(int number) {
	    String result = "";
	    while (number >= 1) {
	        result += (number % 2);
	        number /= 2;
	    }
	    return result;
	}
}
