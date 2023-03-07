//This is the revised version with just arrays, and with updated names
// 
// 3/2/23
// Jose Reynaldo
// 

import java.util.ArrayList;

public class ElectionTesterV8 {
    public static void main(String[] args) {

        CandidateV8[] Candidates = new CandidateV8[6];
        Candidates[0] = new CandidateV8("Vermin Supreme", 1560202);
        Candidates[1] = new CandidateV8("Kanye West", 896524);
        Candidates[2] = new CandidateV8("Jill Biden", 28645);
        Candidates[3] = new CandidateV8("Trump Jr", 28645);
        Candidates[4] = new CandidateV8("Marco Rubio", 15642);
        Candidates[5] = new CandidateV8("Tony Hawk", 2565651);

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

    public static void printingCandidateValues(CandidateV8 candidates[]) {
        for (CandidateV8 currentCandidate : candidates) {
            System.out.println(currentCandidate);
        }
        System.out.println("\n");
    }

    public static int totalVotes(CandidateV8 candidates[]) {
        int totalVotes = 0;
        for (CandidateV8 currentCandidate : candidates) {
            if (currentCandidate != null) {
                totalVotes += currentCandidate.getVotes();
            }

        }
        return totalVotes;
    }

    public static void printingExactValues(CandidateV8 candidates[]) {

        System.out.println("Election Results: \n");
        printHeader();
        int totalVotes = totalVotes(candidates);
        printCandidates(candidates, totalVotes);

        printHeader(totalVotes);
    }

    public static CandidateV8[] changeCandidate(CandidateV8 candidates[], String target,
            String change) {

        System.out.printf("\n \n<< Changing %s to %s  >>\n", target, change);
        printHeader();
        for (CandidateV8 currentCandidate : candidates) {
            if (currentCandidate.getName().equals(target)) {
                currentCandidate.setName(change);
            }
        }
        int totalVotes = totalVotes(candidates);
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;
    }

    public static CandidateV8[] changeVotes(CandidateV8 candidates[], String target, int change) {

        System.out.printf("\n \n<< Changing  %s votes to %,d  >>\n", target, change);
        printHeader();
        for (CandidateV8 currentCandidate : candidates) {
            if (currentCandidate.getName().equals(target)) {
                currentCandidate.setVotes(change);
            }
        }
        int totalVotes = totalVotes(candidates);
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;
    }

    public static CandidateV8[] doAnAmerica(CandidateV8 candidates[], String target,
            String newCandidate,
            int newVotes) {

        System.out.printf("\n \n<< Changing  %s to %s with %,d votes >>\n", target, newCandidate, newVotes);
        printHeader();
        for (CandidateV8 currentCandidate : candidates) {
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

    public static void printCandidates(CandidateV8 candidates[], int totalVotes) {
        for (CandidateV8 currentCandidate : candidates) {
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

    public static CandidateV8[] addInThisPos(CandidateV8 candidates[], int possition, String replacedName,
            int recplacedVotes) {

        candidates[possition].setName(replacedName);
        candidates[possition].setVotes(recplacedVotes);
        System.out.printf("\n \n<< Changing  possition %d to %s with %,d votes >>\n", possition, replacedName,
                recplacedVotes);

        printHeader();
        int totalVotes = totalVotes(candidates);
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;
    }

    public static CandidateV8[] addInPrevPoss(CandidateV8 candidates[], String target, String replacedName,
            int recplacedVotes) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getName().equals(target)) {

                candidates[i - 1].setName(replacedName);
                candidates[i - 1].setVotes(recplacedVotes);
            }
        }
        int totalVotes = totalVotes(candidates);
        System.out.printf("\n \n<< Before %s, Add %s with %,d votes >>\n", target, replacedName,
                recplacedVotes);

        printHeader();
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;
    }

    public static CandidateV8[] americaV2(CandidateV8 candidates[], int possition) {
        candidates[possition] = null;

        System.out.printf("\n \n<< Deleting Possition %d >>\n", possition);
        int totalVotes = totalVotes(candidates);
        printHeader();
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;

    }

    public static CandidateV8[] americaV3(CandidateV8 candidates[], String searchTerm) {
        int i = 0;
        for (int x = 0; x < candidates.length; x++) {
            if (candidates[x] != null) {
                if (candidates[x].getName().equals(searchTerm)) {
                    i = x;

                }
            }

        }
        candidates[i] = null;

        System.out.printf("\n \n<< Deleting  %s >>\n", searchTerm);
        int totalVotes = totalVotes(candidates);
        printHeader();
        printCandidates(candidates, totalVotes);
        printHeader(totalVotes);
        return candidates;

    }

}