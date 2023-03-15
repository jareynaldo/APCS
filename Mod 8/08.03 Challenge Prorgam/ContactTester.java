// This program is meant combine all of my previus knowledge to build a search program
// 
// By Jose Reynaldo
// 3/15/23

public class ContactTester {
    public static void main(String[] args) {
        int test;
        Contact[] contacts = new Contact[10];

        contacts[0] = new Contact("Martha Stuwart", "Aunt", "Jun 26th", "mart@stuwart.com", 502388803);
        contacts[1] = new Contact("Marcos Brots", "Cousin", "Feb 12th", "mark@brots.com", 503854484);
        contacts[2] = new Contact("Jessica Jones", "Friend", "Aug 16th", "jessjones@gmail.com", 508992658);
        contacts[3] = new Contact("Robert Smith", "Co-worker", "Oct 19th", "robsmith@work.com", 509247125);
        contacts[4] = new Contact("Emily Nguyen", "Classmate", "Mar 5th", "annanguyen@school.edu", 502904735);
        contacts[5] = new Contact("David Kim", "Doctor", "Jul 22nd", "dkim@medicalgroup.com", 503376889);
        contacts[6] = new Contact("Samantha Lee", "Landlord", "Dec 14th", "samanthalee@realestate.com", 508632197);
        contacts[7] = new Contact("Kevin Brown", "Neighbor", "Jun 5th", "kevinbrown@yahoo.com", 502145896);
        contacts[8] = new Contact("Karen Hernandez", "Tutor", "Mar 17th", "khernandez@tutoringcenter.com",
                503902865);
        contacts[9] = new Contact("Anna Nguyen", "Classmate", "April 3rd", "annanguyen@school.edu", 508736489);

        System.out.println("Original Array:");
        printContacts(contacts);

        // Title Sort
        contacts = SortByName(contacts);
        // Search 1
        System.out.println("\n\nSearching for Samantha Lee: ");
        test = SearchName(contacts, "Samantha Lee");
        if (test != -1)
            System.out.println("Found: " + contacts[test]);
        else
            System.out.println("Not found. ");

        // Search 2
        System.out.println("\n\nSearching for Mark Evans: ");
        test = SearchName(contacts, "Mark Evans");
        if (test != -1)
            System.out.println("Found: " + contacts[test] + "\n\n");
        else
            System.out.println("Not found. \n\n");

        // relation sort
        contacts = SortByRelation(contacts);
        System.out.println("\nSearching for Classmates: ");
        SearchRelation(contacts, "Classmate");
        System.out.println("\n");

        System.out.println("\nSearching for Tutor: ");
        SearchRelation(contacts, "Tutor");
        System.out.println("\n");

        System.out.println("\nSearching for Great-Grandma: ");
        SearchRelation(contacts, "Great-Grandma");
        System.out.println("\n");

        SearchByMonth(contacts, "Mar");
        SearchByMonth(contacts, "Jan");

        SearchByPhone(contacts, 502904735);
        SearchByPhone(contacts, 508736463);

        SearcByEmail(contacts, "annanguyen@school.edu");
        SearcByEmail(contacts, "Fmarkedwards@gmail.com");

    }

    public static void printContacts(Contact[] r) {
        System.out.println(
                "Name                 Relation        Birthday      Email Adress                   Phone Number");
        System.out.println(
                "-----------------------------------------------------------------------------------------------");
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i]);
        System.out.println("\n");
    }

    public static Contact[] SortByName(Contact[] source) { // sort elements by name
        int i;
        int k;
        int maxYear;
        Contact year;

        for (i = source.length - 1; i >= 0; i--) {
            maxYear = 0;

            for (k = 0; k <= i; k++) {

                if (source[k].getName().compareTo(source[maxYear].getName()) > 0) {
                    maxYear = k;
                }

            }
            year = source[i];
            source[i] = source[maxYear];
            source[maxYear] = year;

        }
        System.out.println("<< Sorted by Name:");
        printContacts(source);
        return source;
    }

    public static Contact[] SortByRelation(Contact[] source) { // sort elements by relations
        int i;
        int k;
        int maxYear;
        Contact year;

        for (i = source.length - 1; i >= 0; i--) {
            maxYear = 0;

            for (k = 0; k <= i; k++) {

                if (source[k].getRelation().compareTo(source[maxYear].getRelation()) > 0) {
                    maxYear = k;
                }

            }
            year = source[i];
            source[i] = source[maxYear];
            source[maxYear] = year;

        }
        System.out.println("<< Sorted by Relation:");
        printContacts(source);
        return source;
    }

    // search based off Name
    public static int SearchName(Contact[] r, String toFind) {
        int high = r.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (r[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }

        if ((low >= 0) && (r[low].getName().compareTo(toFind) == 0))
            return low;
        else
            return -1;
    }

    // search based off Relation
    public static void SearchRelation(Contact[] r, String toFind) {
        int high = r.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;

            if (r[probe].getRelation().compareTo(toFind) > 0)
                high = probe;
            else {
                low = probe;
                if (r[probe].getRelation().compareTo(toFind) == 0) {
                    break;
                }
            }
        }

        if ((low >= 0) && (r[low].getRelation().compareTo(toFind) == 0)) {
            linearPrintArt(r, low, toFind);
        } else
            System.out.println("there were no " + toFind + "'s");
    }

    public static void linearPrintArt(Contact[] r, int low, String toFind) {
        int i;
        int start = low;
        int end = low;
        i = low - 1;
        while ((i >= 0) && (r[i].getRelation().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        i = low + 1;
        while ((i < r.length) && (r[i].getRelation().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        for (i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    // simpler sequential searches
    public static void SearchByMonth(Contact[] contacts, String month) {
        System.out.println("Contacts with birthdays in " + month + ":");
        for (Contact contact : contacts) {
            if (contact.getBDay().contains(month)) {
                System.out.println(contact);
            }
        }
        System.out.println();

    }

    public static void SearchByPhone(Contact[] contacts, int phone) {
        System.out.println("Contacts with phone number " + phone + ":");
        for (Contact contact : contacts) {
            if (contact.getPhone() == phone) {
                System.out.println(contact);
            }
        }
        System.out.println();

    }

    public static void SearcByEmail(Contact[] contacts, String email) {
        System.out.println("Contacts with email address " + email + ":");
        for (Contact contact : contacts) {
            if (contact.getEmail().equals(email)) {
                System.out.println(contact);
            }
        }
        System.out.println();

    }

}
