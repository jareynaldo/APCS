
// the point of this program is to order different movies based 
// on certain peramiters
//
// BY Jose Reynaldo
// 8/3/23

public class MovieSorterV3 {

    public static void main(String[] args) {
        MovieV3[] movies = new MovieV3[10];

        movies[0] = new MovieV3("WALL·E", 2008, "Disney");
        movies[1] = new MovieV3("Sing", 2016, "Animation");
        movies[2] = new MovieV3("The Phantom Menace", 1999, "Lucas Film");
        movies[3] = new MovieV3("The Social Network", 2010, "Columbia Pictures");
        movies[4] = new MovieV3("Wakanda Forever", 2023, "Marvel");
        movies[5] = new MovieV3("The Godfather", 1972, "Paramount Pictures");
        movies[6] = new MovieV3("Raiders of the Lost Ark", 1981, "Lucas Film");
        movies[7] = new MovieV3("Seven Samurai ", 1954, "Gonzo");
        movies[8] = new MovieV3("In the Mood for Love", 2000, "2046");
        movies[9] = new MovieV3("The Dark Knight", 2008, "Warner Bros");

        System.out.println("  << Original Order: >>");
        printResults(movies);

        System.out.println("\n \n << Acending by Title: >>");
        movies = ByTitle(movies, 1);

        System.out.println("\n \n << Decending by Title: >>");
        movies = ByTitle(movies, 2);

        System.out.println("\n \n << Acending by Year: >>");
        movies = ByYear(movies, 1);

        System.out.println("\n \n << Decending by Year: >>");
        movies = ByYear(movies, 2);

        System.out.println("\n \n << Acending by Studio: >>");
        movies = ByStudio(movies, 1);

        System.out.println("\n \n << Decending by Studio: >>");
        movies = ByStudio(movies, 2);

    }

    public static void printResults(MovieV3[] movies) {
        for (MovieV3 currentMovie : movies) {
            System.out.print(currentMovie);
        }
    }

    public static MovieV3[] ByTitle(MovieV3[] source, int decider) {
        int i;
        int k;
        int maxYear;
        MovieV3 year;

        for (i = source.length - 1; i >= 0; i--) {
            maxYear = 0;

            for (k = 0; k <= i; k++) {
                if (decider == 1) {
                    if (source[k].getTitle().compareTo(source[maxYear].getTitle()) > 0) {
                        maxYear = k;
                    }
                } else {
                    if (source[k].getTitle().compareTo(source[maxYear].getTitle()) < 0) {
                        maxYear = k;
                    }
                }

            }
            year = source[i];
            source[i] = source[maxYear];
            source[maxYear] = year;

        }
        printResults(source);
        return source;
    }

    public static MovieV3[] ByYear(MovieV3[] source, int decider) {
        int i;
        int k;
        int maxYear;
        MovieV3 year;

        for (i = source.length - 1; i >= 0; i--) {
            maxYear = 0;

            for (k = 0; k <= i; k++) {
                if (decider == 1) {
                    if (source[k].getYear() < source[maxYear].getYear()) {
                        maxYear = k;
                    }
                } else {
                    if (source[k].getYear() > source[maxYear].getYear()) {
                        maxYear = k;
                    }
                }

            }
            year = source[i];
            source[i] = source[maxYear];
            source[maxYear] = year;

        }
        printResults(source);
        return source;
    }

    public static MovieV3[] ByStudio(MovieV3[] source, int decider) {
        int i;
        int k;
        int maxYear;
        MovieV3 year;

        for (i = source.length - 1; i >= 0; i--) {
            maxYear = 0;

            for (k = 0; k <= i; k++) {
                if (decider == 1) {
                    if (source[k].getStudio().compareTo(source[maxYear].getStudio()) > 0) {
                        maxYear = k;
                    }
                } else {
                    if (source[k].getStudio().compareTo(source[maxYear].getStudio()) < 0) {
                        maxYear = k;
                    }
                }

            }
            year = source[i];
            source[i] = source[maxYear];
            source[maxYear] = year;

        }
        printResults(source);
        return source;
    }

}
