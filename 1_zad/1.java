
public class Main {
    public static void main(String[] args) {
    	FizzBuzzGame game = new FizzBuzzGame();
    	game.startGame(1, 100);
}
}

class FizzBuzzGame {
    public static void startGame(int start, int end) {
    	while (start < end)
    {
    	if (start % 5 == 0 & start % 3 == 0) 
    	    System.out.println("FizzBuzz");
    	else if (start % 5 == 0) 
    		System.out.println("Buzz");
    	else if (start % 3 == 0) 
    		System.out.println("Fizz");
    	else System.out.println(start); 
    	start++;
}
}
}
