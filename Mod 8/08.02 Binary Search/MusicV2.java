//This program is meant to create music objects. 
// 
// By Jose Reynaldo
// 3/14/23
public class MusicV2 {
    // instance variables
    private int year;
    private String title;
    private String artist;

    // Constructor for objects of class Music
    public MusicV2(String title, int year, String artist) {
        // initialize instance variables
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String a) {
        artist = a;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public String toString() {
        String str = String.format("%-25s %4d   %-20s ", title, year, artist);
        return str;
    }
}
