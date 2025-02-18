public class NextMain {
    public static void main(String[] args) {
//        Movie movie = Movie.getMovie("A","Jaws");
//        movie.watchMovie();
//        Adventure jaws = (Adventure) Movie.getMovie("C","Jaws");//the Movie is casted into adventure
//        jaws.watchMovie();

//        Object comedy = Movie.getMovie("C","Airplane");
//        Comedy jawsComedy = (Comedy) comedy; //casting to a more particular type
//        jawsComedy.watchMovie();
//
//        var airplane = Movie.getMovie("C","Airplane");
//        airplane.watchMovie();
//
//        var plane = new Comedy("Airplane");
//        plane.watchMovie();
        Object unknown = Movie.getMovie("C", "Airplane");
        if(unknown.getClass().getSimpleName() =="Comedy") {
            Comedy c = (Comedy) unknown; //casting unknown into Comedy
            c.watchComedy();
        }
        else if(unknown instanceof Adventure) {
            ((Adventure) unknown).watchAdventure();
        } else if (unknown instanceof SciFi syfy) {
            syfy.watchSciFi();

        }
    }
}
