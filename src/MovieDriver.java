import java.util.Scanner; 

public class MovieDriver {

	public static void getMoviesSales() {
		//		Create a new object of type Scanner that reads from the keyboard
		Scanner stdin = new Scanner(System.in);
		
		//		Create a new movie object
		Movie aMovie = new Movie();
		
		//		Prompt the user to enter the title of a movie 
		System.out.println("Enter the name of a movie");
		
		//		Read in the line that the user types
		String movieTitle = stdin.nextLine();
		
		//		Set the title in the movie object
		aMovie.setTitle(movieTitle);
		
		//		Prompt the user to enter the movie’s rating
		System.out.println("Enter the rating of the movie");
		
		//		Read in the line that the user types
		String movieRating = stdin.nextLine();
		
		//		Set the rating in the movie object
		aMovie.setRating(movieRating);
		
		//		Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Enter the number of tickets sold for this movie");
		
		//		Read in the integer that the user types
		int soldTickets = stdin.nextInt();
		
		//		Set the number of tickets sold in the movie object
		aMovie.setSoldTickets(soldTickets);
		
		//		Print out the information using the movie’s toString method 
		System.out.println(aMovie.toString());
		
	}

	public static void main(String[] args) {
		//		Create a new object of type Scanner that reads from the keyboard
		Scanner stdin = new Scanner(System.in);
		
		String response = "y";
		do {
			// Call the getMovieSales method to print the movie details
			getMoviesSales();
			
			// Ask user if they want to continue
			System.out.println("\nDo you want to enter another? (y or n) ");
			
			// Read the user response
			response = stdin.nextLine();			
		} while (response.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye!");
		
	}

}
