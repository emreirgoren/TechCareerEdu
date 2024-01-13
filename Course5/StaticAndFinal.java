package Course5;

public class StaticAndFinal {

    public static void main(String[] args) {

        String movieName = Movie.movieName;

        Movie movie = new Movie();
        double imdb = movie.imdb;

        Math.max(4,5); //static class

        System.out.println(Messages.productImageIsNotFound);

        String iban = Constants.IBAN;

        final String name = "Emine";
        //name = "Burak";




    }

}
