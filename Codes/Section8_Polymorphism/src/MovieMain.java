import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
//        Movie movie = Movie.getMovie("Science","Star Wars");
//        movie.watchMovie();
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, "+
                    "S for Sci-Fi, or Q to quit): ");
            String type = s.nextLine();//reads the input from the user
            if("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter the Movie Title:");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
