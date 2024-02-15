package ex_3;

import java.awt.datatransfer.StringSelection;
import java.util.HashSet;

public class Teacher extends Person{
    private HashSet<String> subjects = new HashSet<>();
    public boolean addSubject(String subject) {
        if (subjects.contains(subject)) {
            System.out.println("ERROR: DUPLICATED SUBJECT");
            return false;
        } else {
            System.out.println("SUBJECT ADDED");
            subjects.add(subject);
        }
        return true;
    }
    public boolean removeSubject(String subject) {
        if (subjects.contains(subject)) {
            System.out.println("SUBJECT REMOVED");
            subjects.remove(subject);
        } else {
            System.out.println("ERROR: SUBJECT NOT FOUND");
            return false;
        }
        return true;
    }
    public Teacher(String name, String address) {
        super(name, address);
        System.out.println("Sóc el constructor de la classe Teacher");
    }
}
