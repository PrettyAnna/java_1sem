public class Main {
    public static void main(String[] args) {
    	int[] array = {1, 0};
    	Math math = new Math();
    	if (math.isAscOrder(array)) {
    	    System.out.println("Order");
    	} else {
    	    System.out.println("Not order");
    	}
	}
 
}
 
class Math {
	public boolean isAscOrder(int[] array) {
	    if (array.length > 1) {
    		for (int i = 0; i < array.length - 1; i++) {
    		    if (array[i] > array[i+1]) {
    		        return false;
    		    }
    		}
	    }
		return true;
	} 
}
