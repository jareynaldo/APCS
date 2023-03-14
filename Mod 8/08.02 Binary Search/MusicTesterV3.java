// This program is meant to search through arrays using
// Bianary search. 
// 
// By Jose Reynaldo
// 3/14/23

public class MusicTesterV3 {
    public static void main(String[] args) {
        int test;
        MusicV2[] roster = new MusicV2[10];

        roster[0] = new MusicV2("Smells Like Teen Spirit", 1991, "Nirvana");
        roster[1] = new MusicV2("Sun is Shining", 1971, "Bob Marley");
        roster[2] = new MusicV2("One", 1991, "U2");
        roster[3] = new MusicV2("Like A Rolling Stone", 1970, "Bob Dylan");
        roster[4] = new MusicV2("Bohemian Rhapsody", 1975, "Queen");
        roster[5] = new MusicV2("Hotel California", 1976, "The Eagles");
        roster[6] = new MusicV2("Over The Rainbow", 1990, "IZ");
        roster[7] = new MusicV2("No Woman No Cry", 1974, "Bob Marley");
        roster[8] = new MusicV2("Every Breath You Take", 1983, "The Police");
        roster[9] = new MusicV2("Cradle of Love", 1990, "Billy Idol");

        System.out.println("Original Array:");
        printRoster(roster);

        // Title Sort
        roster = SortByTitle(roster);
        // Search 1
        System.out.println("\n\nSearching for Hotel California: ");
        test = SearchTitle(roster, "Hotel California");
        if (test != -1)
            System.out.println("Found: " + roster[test]);
        else
            System.out.println("Not found. ");

        // Search 2
        System.out.println("\n\nSearching for The Fantastic World Of Gumball: ");
        test = SearchTitle(roster, "The Fantastic World Of Gumball:");
        if (test != -1)
            System.out.println("Found: " + roster[test] + "\n\n");
        else
            System.out.println("Not found. \n\n");

        // artist sort
        roster = SortByArtist(roster);
        System.out.println("\nSearching for Bob Marley: ");
        SearchArtist(roster, "Bob Marley");
        System.out.println("\n");

        System.out.println("\nSearching for Duncan Trusel: ");
        SearchArtist(roster, "Duncan Trusel");
        System.out.println("\n");

        // Year sort
        roster = SortByYear(roster);
        System.out.println("\nSearching for Songs made in 1991: ");
        SearchYear(roster, 1991);
        System.out.println("\n");

        System.out.println("\nSearching for Songs made in 2003: ");
        SearchYear(roster, 2003);
        System.out.println("\n");

    }

    public static void printRoster(MusicV2[] r) {
        System.out.println("Time                      Location        Person");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i]);
        System.out.println("\n");
    }

    public static MusicV2[] SortByTitle(MusicV2[] source) { // sort elements by the title of the song
        int i;
        int k;
        int maxYear;
        MusicV2 year;

        for (i = source.length - 1; i >= 0; i--) {
            maxYear = 0;

            for (k = 0; k <= i; k++) {

                if (source[k].getTitle().compareTo(source[maxYear].getTitle()) > 0) {
                    maxYear = k;
                }

            }
            year = source[i];
            source[i] = source[maxYear];
            source[maxYear] = year;

        }
        System.out.println("<< Sorted by Title:");
        printRoster(source);
        return source;
    }

    public static MusicV2[] SortByYear(MusicV2[] source) { // sort elemetns by the release year
        int i;
        int k;
        int maxYear;
        MusicV2 year;

        for (i = source.length - 1; i >= 0; i--) {
            maxYear = 0;

            for (k = 0; k <= i; k++) {

                if (source[k].getYear() < source[maxYear].getYear()) {
                    maxYear = k;
                }

            }
            year = source[i];
            source[i] = source[maxYear];
            source[maxYear] = year;

        }
        System.out.println("<< Sorted by Year:");
        printRoster(source);
        return source;
    }

    public static MusicV2[] SortByArtist(MusicV2[] source) { // sort elements by the tittle of the song
        int i;
        int k;
        int maxYear;
        MusicV2 year;

        for (i = source.length - 1; i >= 0; i--) {
            maxYear = 0;

            for (k = 0; k <= i; k++) {

                if (source[k].getArtist().compareTo(source[maxYear].getArtist()) > 0) {
                    maxYear = k;
                }

            }
            year = source[i];
            source[i] = source[maxYear];
            source[maxYear] = year;

        }
        System.out.println("<< Sorted by Artist:");
        printRoster(source);
        return source;
    }

    // search based off Title
    public static int SearchTitle(MusicV2[] r, String toFind) {
        int high = r.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (r[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }

        if ((low >= 0) && (r[low].getTitle().compareTo(toFind) == 0))
            return low;
        else
            return -1;
    }

    // search based off artist
    public static void SearchArtist(MusicV2[] r, String toFind) {
        int high = r.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;

            if (r[probe].getArtist().compareTo(toFind) > 0)
                high = probe;
            else {
                low = probe;
                if (r[probe].getArtist().compareTo(toFind) == 0) {
                    break;
                }
            }
        }

        if ((low >= 0) && (r[low].getArtist().compareTo(toFind) == 0)) {
            linearPrintArt(r, low, toFind);
        } else
            System.out.println("NO songs made by: " + toFind);
    }

    public static void linearPrintArt(MusicV2[] r, int low, String toFind) {
        int i;
        int start = low;
        int end = low;
        i = low - 1;
        while ((i >= 0) && (r[i].getArtist().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        i = low + 1;
        while ((i < r.length) && (r[i].getArtist().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        for (i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    // search based off year
    public static void SearchYear(MusicV2[] r, int toFind) {
        int high = r.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;

            if (r[probe].getYear() < toFind) {
                high = probe;
            } else {
                low = probe;
                if (r[probe].getYear() == toFind) {
                    break;
                }
            }
        }

        if ((low >= 0) && (r[low].getYear() == toFind)) {
            linearPrintYear(r, low, toFind);
        } else
            System.out.println("NO songs made in: " + toFind);
    }

    public static void linearPrintYear(MusicV2[] r, int low, int toFind) {
        int i;
        int start = low;
        int end = low;
        i = low - 1;
        while ((i >= 0) && (r[i].getYear() == toFind)) {
            start = i;
            i--;
        }
        i = low + 1;
        while ((i < r.length) && (r[i].getYear() == toFind)) {
            end = i;
            i++;
        }
        for (i = start; i <= end; i++)
            System.out.println(r[i]);
    }
}
