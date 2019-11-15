import java.util.*;   
public class GuessRand {

	public static void main(String[] args) {
		int rand = 0;
		boolean success = false;
		Random r = new Random();
		rand = r.nextInt(100) + 1;
		
		while (success = false) {
			int guess = 0;
			Scanner userInput = new Scanner (System.in);
			System.out.println("Your Guess: ?");
			guess = userInput.nextInt(); 
			success = compare(guess, rand); // call 'compare()' method
		}

	public static boolean compare(int guess, int rand) {
		boolean got_it = false;
		if (guess == rand) {  // Fix if test
			System.out.println("You got it!");
			got_it = true;
		} else if (guess < rand) {  // Fix if test
			System.out.println("No, it's Higher");
		} else {
			System.out.println("No, it's Lower");
		}
		return got_it;
	}
}
