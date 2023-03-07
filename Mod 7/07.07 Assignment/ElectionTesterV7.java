// This class is made in order to test the Candidate class. I
//  ArrayLists of candidate objects, and then used methods and 
// logic to traverse through the array and change different aspcets of the code. 
// 
// 3/1/23
// Jose Reynaldo
// 

import java.util.ArrayList;

public class ElectionTesterV7 {
    public static void main(String[] args) {

        ArrayList<CandidateV7> Candidates = new ArrayList<CandidateV7>();
        Candidates.add(new CandidateV7("Vermin Supreme", 1560202));
        Candidates.add(new CandidateV7("Kanye West", 896524));
        Candidates.add(new CandidateV7("Jill Biden", 28645));
        Candidates.add(new CandidateV7("Trump Jr", 28645));
        Candidates.add(new CandidateV7("Marco Rubio", 15642));
        Candidates.add(new CandidateV7("Tony Hawk", 2565651));

        printingCandidateValues(Candidates);
        printingExactValues(Candidates);
        Candidates = changeCandidate(Candidates, "Kanye West", "Joe Rogan");
        Candidates = changeVotes(Candidates, "Marco Rubio", 132443);
        Candidates = doAnAmerica(Candidates, "Trump Jr", "Miguel R. Davila", 234242342);
        Candidates = addInThisPos(Candidates, 5, "Max Verstapen", 232342335);
        Candidates = addInPrevPoss(Candidates, "Jill Biden", "Luis Hamilton", 3453);
        Candidates = americaV2(Candidates, 2);
        Candidates = americaV3(Candidates, "Marco Rubio");

    }

    public static void printingCandidateValues(ArrayList<CandidateV7> candidates) {
        for (CandidateV7 currentCandidate : candidates) {
            System.out.println(currentCandidate);
        }
        System.out.println("\n");
    }

    public static int totalVotes(ArrayList<CandidateV7> candidates) {
        int totalVotes = 0;
        for (CandidateV7 currentCandidate : candidates) {
            if (currentCandidate != null) {
                totalVotes += currentCandidate.getVotes();
            }

        }
        return totalVotes;
    }

    public static void printingExactValues(ArrayList<CandidateV7> candidates) {

        System.out.println("Election Results: \n");
        printHeader();
        int totalVotes = totalVotes(candidates);
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
    }

    public static ArrayList<CandidateV7> changeCandidate(ArrayList<CandidateV7> candidates, String target,
            String change) {

        System.out.printf("\n \n<< Changing %s to %s  >>\n", target, change);
        printHeader();
        for (CandidateV7 currentCandidate : candidates) {
            if (currentCandidate.getName().equals(target)) {
                currentCandidate.setName(change);
            }
        }
        int totalVotes = totalVotes(candidates);
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;
    }

    public static ArrayList<CandidateV7> changeVotes(ArrayList<CandidateV7> candidates, String target, int change) {

        System.out.printf("\n \n<< Changing  %s votes to %,d  >>\n", target, change);
        printHeader();

        for (CandidateV7 currentCandidate : candidates) {
            if (currentCandidate.getName().equals(target)) {
                currentCandidate.setVotes(change);
            }
        }
        int totalVotes = totalVotes(candidates);
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;
    }

    public static ArrayList<CandidateV7> doAnAmerica(ArrayList<CandidateV7> candidates, String target,
            String newCandidate,
            int newVotes) {

        System.out.printf("\n \n<< Changing  %s to %s with %,d votes >>\n", target, newCandidate, newVotes);
        printHeader();
        for (CandidateV7 currentCandidate : candidates) {
            if (currentCandidate.getName().equals(target)) {
                currentCandidate.setName(newCandidate);
                currentCandidate.setVotes(newVotes);
            }
        }
        int totalVotes = totalVotes(candidates);
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;

    }

    public static void printHeader() {
        System.out.printf("%30s %18s %n", "Votes", "% of Total");
        System.out.printf("%15s %15s %15s %n", "Candidate", "Recieved", "Votes");
        System.out.println("===============================================");
    }

    public static void printCandidates(ArrayList<CandidateV7> candidates, int totalVotes) {
        for (CandidateV7 currentCandidate : candidates) {
            if (currentCandidate != null) {
                int currentVotes = currentCandidate.getVotes();
                double percent = (double) currentVotes / totalVotes;
                System.out.printf("%15s %,15d %15.3f %n", currentCandidate.getName(), currentVotes,
                        percent * 100);
            }
        }
    }

    public static void printHeader(int totalVotes) {
        System.out.printf("\n %s %,d \n\n", "The total number of votes is:", totalVotes);

    }

    public static ArrayList<CandidateV7> addInThisPos(ArrayList<CandidateV7> candidates, int possition,
            String replacedName,
            int recplacedVotes) {

        candidates.add(possition, new CandidateV7(replacedName, recplacedVotes));
        System.out.printf("\n \n<< Changing  possition %d to %s with %,d votes >>\n", possition, replacedName,
                recplacedVotes);

        printHeader();
        int totalVotes = totalVotes(candidates);
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;
    }

    public static ArrayList<CandidateV7> addInPrevPoss(ArrayList<CandidateV7> candidates, String target,
            String replacedName,
            int recplacedVotes) {

        for (int i = 0; i < candidates.size();) {
            if (candidates.get(i).getName().equals(target)) {
                // int i = candidates.indexOf(currentCandiate);
                i++;
                candidates.add(i - 1, new CandidateV7(replacedName, recplacedVotes));

            }
            i++;
        }

        System.out.printf("\n \n<< Before %s, add %s with %,d votes >>\n", target, replacedName,
                recplacedVotes);
        int totalVotes = totalVotes(candidates);
        printHeader();
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;
    }

    public static ArrayList<CandidateV7> americaV2(ArrayList<CandidateV7> candidates, int possition) {
        candidates.remove(possition);
        System.out.printf("\n \n<< Deleting Possition %d >>\n", possition);
        int totalVotes = totalVotes(candidates);
        printHeader();
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;

    }

    public static ArrayList<CandidateV7> americaV3(ArrayList<CandidateV7> candidates, String searchTerm) {
        int i = 0;
        for (int x = 0; x < candidates.size(); x++) {
            if (candidates.get(x) != null) {
                if (candidates.get(x).getName().equals(searchTerm)) {
                    i = x;

                }
            }

        }
        candidates.remove(i);

        System.out.printf("\n \n<< Deleting  %s >>\n", searchTerm);
        int totalVotes = totalVotes(candidates);
        printHeader();
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;

    }
}
