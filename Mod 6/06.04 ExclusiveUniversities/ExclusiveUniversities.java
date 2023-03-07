/**
 * Attempting to use arrays as a maker of objects.
 *
 * @author Jose Reynaldo
 * @version 13/02/23
 */
public class ExclusiveUniversities {
    private String myUniversity;
    private int myAccepted;
    private int myTotalApps;
    private double myPercentIn;
    private String myHowElite;

    public ExclusiveUniversities(String name, int accepted, int totalApp) {
        myUniversity = name;
        myAccepted = accepted;
        myTotalApps = totalApp;
        myPercentIn = ((double) accepted) / ((double) totalApp);
        myHowElite = "";
        howElite();
    }

    public void setUni(String name) {
        myUniversity = name;
    }

    public void setAccepted(int accepted) {
        myAccepted = accepted;
    }

    public void setTotalApps(int apps) {
        myTotalApps = apps;
    }

    public void setPercentIn(double percentIn) {
        myPercentIn = percentIn;
    }

    public void setHowElite(String eliteLevel) {
        myHowElite = eliteLevel;
    }

    //
    public String getUni() {
        return myUniversity;
    }

    public int getAccepted() {
        return myAccepted;
    }

    public int getTotalApps() {
        return myTotalApps;
    }

    public double getPercentIn() {
        return myPercentIn;
    }

    public String getHowElite() {
        return myHowElite;
    }

    public void howElite() {
        if (myPercentIn > .70) {
            myHowElite = "Not Elite";
        } else if (myPercentIn > .50) {
            myHowElite = "Not very Elite";
        } else if (myPercentIn > .30) {
            myHowElite = "Pretty Elite";
        } else {
            myHowElite = "Extremely Elite";
        }

    }

    public String toString() {
        return String.format("%7s %10d %10d %10.0f %20s ", myUniversity, myTotalApps, myAccepted, myPercentIn * 100,
                myHowElite);
    }
}
