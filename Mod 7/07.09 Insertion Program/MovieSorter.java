// the point of this program is to order different movies based 
// on certain peramiters
//
// BY Jose Reynaldo
// 8/3/23

import java.util.ArrayList;

public class MovieSorter {

    public static void main(String[] args) {
        Movie[] movies = new Movie[10];

        movies[0] = new Movie("WALL·E", 2008, "Disney");
        movies[1] = new Movie("Sing", 2016, "Animation");
        movies[2] = new Movie("The Phantom Menace", 1999, "Lucas Film");
        movies[3] = new Movie("The Social Network", 2010, "Columbia Pictures");
        movies[4] = new Movie("Wakanda Forever", 2023, "Marvel");
        movies[5] = new Movie("The Godfather", 1972, "Paramount Pictures");
        movies[6] = new Movie("Raiders of the Lost Ark", 1981, "Lucas Film");
        movies[7] = new Movie("Seven Samurai ", 1954, "Gonzo");
        movies[8] = new Movie("In the Mood for Love", 2000, "2046");
        movies[9] = new Movie("The Dark Knight", 2008, "Warner Bros");

        System.out.println("  << Original Order: >>");
        printResults(movies);

        System.out.println("\n \n << Acending by Title: >>\n");
        movies = ByTitle(movies, 1);

        System.out.println("\n \n << Decending by Title: >>\n");
        movies = ByTitle(movies, 2);

        System.out.println("\n \n << Acending by Year: >>\n");
        movies = ByYear(movies, 1);

        System.out.println("\n \n << Decending by Year: >>\n");
        movies = ByYear(movies, 2);

        System.out.println("\n \n << Acending by Studio: >>\n");
        movies = ByStudio(movies, 1);

        System.out.println("\n \n << Decending by Studio: >>\n");
        movies = ByStudio(movies, 2);

    }

    public static void printResults(Movie[] movies) {
        for (Movie currentMovie : movies) {
            System.out.print(currentMovie);
        }
    }

    public static Movie[] ByTitle(Movie[] source, int decider) {
        Movie[] dest = new Movie[source.length];

        for (int i = 0; i < source.length; i++) {
            Movie next = source[i];
            int insertIndex = 0;
            int k = i;
            while (k > 0 && insertIndex == 0) {
                if (decider == 1) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) > 0) {
                        insertIndex = k;
                    } else {
                        dest[k] = dest[k - 1];
                    }
                } else if (decider == 2) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) < 0) {
                        insertIndex = k;
                    } else {
                        dest[k] = dest[k - 1];
                    }
                }

                k--;
            }

            dest[insertIndex] = next;

        }
        printResults(dest);
        return dest;
    }

    public static Movie[] ByYear(Movie[] source, int decider) {
        Movie[] dest = new Movie[source.length];

        for (int i = 0; i < source.length; i++) {
            Movie next = source[i];
            int insertIndex = 0;
            int k = i;
            while (k > 0 && insertIndex == 0) {
                if (decider == 1) {
                    if (next.getYear() < dest[k - 1].getYear()) {
                        insertIndex = k;
                    } else {
                        dest[k] = dest[k - 1];
                    }
                } else if (decider == 2) {
                    if (next.getYear() > dest[k - 1].getYear()) {
                        insertIndex = k;
                    } else {
                        dest[k] = dest[k - 1];
                    }
                }

                k--;
            }

            dest[insertIndex] = next;

        }
        printResults(dest);
        return dest;
    }

    public static Movie[] ByStudio(Movie[] source, int decider) {
        Movie[] dest = new Movie[source.length];

        for (int i = 0; i < source.length; i++) {
            Movie next = source[i];
            int insertIndex = 0;
            int k = i;
            while (k > 0 && insertIndex == 0) {
                if (decider == 1) {
                    if (next.getStudio().compareTo(dest[k - 1].getStudio()) > 0) {
                        insertIndex = k;
                    } else {
                        dest[k] = dest[k - 1];
                    }
                } else if (decider == 2) {
                    if (next.getStudio().compareTo(dest[k - 1].getStudio()) < 0) {
                        insertIndex = k;
                    } else {
                        dest[k] = dest[k - 1];
                    }
                }

                k--;
            }

            dest[insertIndex] = next;

        }
        printResults(dest);
        return dest;
    }

}
