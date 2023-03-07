//
//the point of this class is to manipulate student scores and 
//allow a teacher to assign values and remove when neccesary 
//
// 03/3/23
//
// Jose Reynaldo
//

import java.util.ArrayList;

public class Teacher {

    public static void main(String[] args) {

        ArrayList<Students> studentArray = new ArrayList<Students>();
        studentArray.add(new Students("Marco Wallaburg", 89, 65, 78, 56, 45));
        studentArray.add(new Students("Jerry Chairs", 85, 75, 32, 99, 63));
        studentArray.add(new Students("Ketchup Brotwardst", 87, 72, 56, 84, 62));
        studentArray.add(new Students("Mike Lawrance", 86, 72, 82, 63, 55));
        studentArray.add(new Students("Baddie McBad", 23, 12, 63, 56, 22));

        printElements(studentArray);
        studentArray = changeName(studentArray, "Jerry Chairs", "Mark Heinz");
        studentArray = changeSingleQuiz(studentArray, 5, 5, 98);
        int[] newQuizScores = { 89, 65, 45, 78, 96 };
        studentArray = replaceAStudnet(studentArray, "Mike Lawrance", "Mark Library", newQuizScores);
        int[] newQuizScoresv2 = { 86, 64, 79, 100, 87 };
        studentArray = addBefore(studentArray, "Mark Heinz", "Bruce Wane", newQuizScoresv2);
        studentArray = deleteStudent(studentArray, "Baddie McBad");
    }

    public static void printElements(ArrayList<Students> students) {
        printHeader();
        for (Students currentStudent : students) {
            if (currentStudent != null) {
                System.out.println(currentStudent.toString());

            }
        }
    }

    public static void printHeader() {
        System.out.printf("%22s %10s %10s %10s %10s %10s \n", "Student name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("=============================================================================");
    }

    public static ArrayList<Students> changeName(ArrayList<Students> students, String target, String replacement) {

        for (Students currentStudent : students) {
            if (currentStudent.getName() == target) {
                currentStudent.setName(replacement);
            }
        }
        System.out.printf("\n \n <<-- Changing %s to %s -->>\n\n", target, replacement);
        printElements(students);
        return students;
    }

    public static ArrayList<Students> changeSingleQuiz(ArrayList<Students> students, int numStudent, int index,
            int replacement) {

        students.get(numStudent - 1).setQuizScore(index - 1, replacement);
        System.out.printf("\n \n <<-- Changing %s quiz number %d to %d -->>\n\n",
                students.get(numStudent - 1).getName(),
                index, replacement);
        printElements(students);
        return students;
    }

    public static ArrayList<Students> replaceAStudnet(ArrayList<Students> students, String target, String replacement,
            int[] newScores) {

        for (Students currentStudent : students) {

            if (currentStudent.getName() == target) {
                currentStudent.setName(replacement);
                for (int i = 0; i < 5; i++) {
                    currentStudent.setQuizScore(i, newScores[i]);
                }
            }
        }
        System.out.printf("\n \n <<-- Changing %s to %s -->>\n\n", target, replacement);
        printElements(students);
        return students;
    }

    public static ArrayList<Students> addBefore(ArrayList<Students> students, String target, String replacement,
            int[] newScores) {

        int counter = 0;
        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getName() == target) {
                counter = i;
            }
        }
        students.add(counter,
                new Students(replacement, newScores[0], newScores[1], newScores[2], newScores[3], newScores[4]));
        System.out.printf("\n \n <<-- adding %s before  %s -->>\n\n", replacement, target);
        printElements(students);
        return students;
    }

    public static ArrayList<Students> deleteStudent(ArrayList<Students> students, String target) {

        int counter = 0;
        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getName() == target) {
                counter = i;
            }
        }
        students.remove(counter);
        System.out.printf("\n \n <<-- Removing %s -->>\n\n", target);
        printElements(students);
        return students;
    }

}