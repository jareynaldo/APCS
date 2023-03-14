// This program is meant to search through arrays for certain things 
// 
// By Jose Reynaldo
// 3/10/23

public class MusicTester {
    public static void main(String[] args) {
        Music[] roster = new Music[10];

        roster[0] = new Music("Smells Like Teen Spirit", 1991, "Nirvana");
        roster[1] = new Music("Sun is Shining", 1971, "Bob Marley");
        roster[2] = new Music("One", 1991, "U2");
        roster[3] = new Music("Like A Rolling Stone", 1970, "Bob Dylan");
        roster[4] = new Music("Bohemian Rhapsody", 1975, "Queen");
        roster[5] = new Music("Hotel California", 1976, "The Eagles");
        roster[6] = new Music("Over The Rainbow", 1990, "IZ");
        roster[7] = new Music("No Woman No Cry", 1974, "Bob Marley");
        roster[8] = new Music("Every Breath You Take", 1983, "The Police");
        roster[9] = new Music("Cradle of Love", 1990, "Billy Idol");

        printRoster(roster);

        System.out.println("\n\nSearching for Bob Marley: ");
        byArtist(roster, "Bob Marley");

        System.out.println("\n\nSearching for Hotel California: ");
        byTitle(roster, "Hotel California");

        System.out.println("\n\nSearching for song that released in 2000: ");
        byYear(roster, 2000);

    }

    public static void printRoster(Music[] r) {
        System.out.println("Time                      Location        Person");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }

    public static void byArtist(Music[] r, String toFind) {
        int found = -1;

        for (int i = 0; i < r.length; i++) {
            if (r[i].getArtist().compareTo(toFind) == 0) {
                found = i;
                break;
            }
        }

        if (found != -1) {
            System.out.println("We found " + toFind + " in the roster: ");
            System.out.println(r[found]);
        } else
            System.out.println(toFind + " is not in the roster");
    }

    public static void byTitle(Music[] r, String toFind) {
        int found = -1;

        for (int i = 0; i < r.length; i++) {
            if (r[i].getTitle().compareTo(toFind) == 0) {
                found = i;
                break;
            }
        }

        if (found != -1) {
            System.out.println("We found " + toFind + " in the roster: ");
            System.out.println(r[found]);
        } else
            System.out.println(toFind + " is not in the roster");
    }

    public static void byYear(Music[] r, int toFind) {
        int found = 0;

        System.out.println("Search results: ");
        for (int i = 0; i < r.length; i++) {
            if (r[i].getYear() == toFind) {
                System.out.println(r[i]);
                found++;
            }
        }

        if (found == 0) { // we have not found the location
            System.out.println("No Songs were released in " + toFind);
        }
    }
}