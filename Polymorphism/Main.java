package ClassesFundamentals.Polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = new Adventure("star wars");
//        Movie theMovie = Movie.getMovie("Comedy", "Bruno");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                // if user types single character Q returns true
                System.out.print("see you next time!");
                break;
            }
            System.out.print("enter movie title :");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
        // input stream

    }
}
