import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Movie movie=new Movie();
		String movieTitle, movieRating;
		int movieTickets;
		char choice;
		
		do {
		System.out.println("Enter the title of a movie");
		movieTitle=scan.nextLine();

		System.out.println("Enter the rating of the movie");
		movieRating=scan.nextLine();

		System.out.println("Enter the number of tickets for this movie");
		movieTickets=scan.nextInt();
		
		movie.setTitle(movieTitle);
		movie.setRating(movieRating);
		movie.setSoldTickets(movieTickets);
		
		System.out.println(movie.toString());
		System.out.println("Do you want to enter another?");
		choice=scan.next().charAt(0);
		
		scan.nextLine();
		} while((choice=='Y') || (choice=='y'));
		
		System.out.println("Goodbye");
		
		scan.close();
		System.exit(0);
		
	}

}
