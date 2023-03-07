import javax.swing.text.html.HTMLDocument.RunElement;

//
//the point of this class is to create student objects with unique quiz scores
// 03/3/23
//
// Jose Reynaldo
//

public class Students {

    private String name;

    private int[] quizes = new int[5];

    public Students(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5) {
        // initialize instance variables
        this.name = name;

        this.quizes[0] = quiz1;
        this.quizes[1] = quiz2;
        this.quizes[2] = quiz3;
        this.quizes[3] = quiz4;
        this.quizes[4] = quiz5;

    }

    public int getQuizValue(int searchSpot) {
        return quizes[searchSpot];
    }

    public void setQuizScore(int searchSpot, int newScore) {
        quizes[searchSpot] = newScore;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("%22s %10d %10d %10d %10d  %9d", name, quizes[0], quizes[1], quizes[2], quizes[3],
                quizes[4]);

    }
}
