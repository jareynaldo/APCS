/**
 * To test the Universties class
 *
 * @author Jose Reynaldo
 * @version 13/02/23
 */

public class ExclusiveUniversitiesTester {
    public static void main(String[] args) {

        String[] schoolNames = { "Harvard", "UF", "FIU", "UCF", "USF", "MIT", "Yale" };
        int[] accepted = { 1984, 14939, 10502, 21580, 17753, 1337, 1434 };
        int[] applied = { 61221, 48193, 16406, 47957, 36986, 33767, 37495 };

        ExclusiveUniversities[] unis = new ExclusiveUniversities[7];
        for (int i = 0; i < accepted.length; i++) {
            unis[i] = new ExclusiveUniversities(schoolNames[i], accepted[i], applied[i]);

        }
        // System.out.println(unis[0].howElite());

        System.out.printf("%7s %12s %9s %12s %17s %n", "Name", "Accepted", "Applied", "% Accepted",
                "How Elite");
        System.out.println("=============================================================");

        for (ExclusiveUniversities p : unis) {
            System.out.println(p);
        }

    }
}
