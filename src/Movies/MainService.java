package Movies;
import java.util.Scanner;

public class MainService {
	public static String Comedy = "comedy";
	public static String Horror = "horror";
	public static String Disney = "disney";

	public static void Run() {
		System.out.print("Hello and welcome to the weekend movie catalog! \nI have the following "
				+ "Genres of movies to pick from: \nComedy \nHorror \nDisney \n");
		GetResponse();
	}
	
	public static void GetResponse() {
		Scanner scan = new Scanner(System.in); 
		String genre = scan.next();
		scan.close();
		goGoGadgetSwitch(genre);
	}
	
	public static void goGoGadgetSwitch (String genre) {
		
		switch (genre) {
		case "Comedy" :
			MainData.GetComedyMovies();
			break;
		case "Horror" :
			MainData.GetHorrorMovies();
			break;
		case "Disney" :
			MainData.GetDisneyMovies();
			break;

		default: System.out.println("You are not as exacting as I would have hoped");
			break;
		}
	}
}
