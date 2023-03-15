//This program is meant to create contact objects
// 
// By Jose Reynaldo
// 3/15/23
public class Contact {
    private int phone;
    private String name, relation, birthday, email;

    public Contact(String name, String relation, String birthday, String email, int phone) {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String t) {
        name = t;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String a) {
        relation = a;
    }

    public String getBDay() {
        return birthday;
    }

    public void setBDay(String t) {
        birthday = t;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String t) {
        email = t;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int t) {
        phone = t;
    }

    public String toString() {
        String input = phone + ""; // to convert to readable format
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
        String str = String.format("%-20s %-14s  %-13s %-30s %4s", name, relation, birthday, email, number);
        return str;
    }
}
