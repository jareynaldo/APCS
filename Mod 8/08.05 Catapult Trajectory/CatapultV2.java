// Purpose: to create a catapult objet which calculations can be easily done with 
//
//By: Jose Reynaldo
//20/3/23

public class CatapultV2 {

    public CatapultV2() {

    }

    public double calcDistance(int vel, int ang) {
        double grav = 9.81;
        double rads = Math.toRadians(ang);
        double distance = (vel * vel) * Math.sin(2 * rads) / grav;
        return distance;
    }
}