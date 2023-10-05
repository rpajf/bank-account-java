package ClassesFundamentals.Polymorphism;

public class NextMain {

    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Adv", "jawz");

        movie.watchMovie();
//        Adventure jaws = Movie.getMovie("A", "jawz");
        // this is an error because the factory method gets
        // executed on run time, thus getMovie is returning a Movie class
        // ----------------
        // can every movie be assigned to Adventure - no?
        // to fix , casting can be used
        Adventure jaws = (Adventure) Movie.getMovie("A", "jawz");
        jaws.watchMovie();
        Object comedy  = Movie.getMovie("C", "Airplane");
//        comedy.watchMovie();
        // this gives an error because the compiler cant locate
        // watchMovie on the ObjectClass
//        Comedy comedMovie = (Comedy) comedy;
//        comedMovie.watchComedy();
//
        var airplane = Movie.getMovie("S", "Django");
        airplane.watchMovie();
        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("A", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            // check is the instance has a class name comedy
            System.out.print("check");
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            // if is instance, it casts and calls method
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            // test if object is instanceof class
            syfy.watchScienceFiction();
        }
    }
}
