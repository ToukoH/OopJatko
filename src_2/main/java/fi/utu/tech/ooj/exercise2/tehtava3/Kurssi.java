package fi.utu.tech.ooj.exercise2.tehtava3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

// @.classInvariant getCredits() >= 0 && getCredits() <= 100
// @. classInvariantPrivate name != null && credits != null && credits >= 0 && credits <= 100 &&
// lecturer != null && courseAttendees != null && grade != null
public class Kurssi {
    public String name;
    public int credits;
    public String lecturer;
    public ArrayList<Opiskelija> courseAttendees;
    public HashMap<Opiskelija, Integer> grade;
    // B)
    // I THINK IT IS IMPORTANT TO BE ABLE TO ACCESS THESE ATTRIBUTES OVER AN API FOR EXAMPLE
    // FURTHER VALIDATION AND ACCESS RESTRICTIONS SHOULD BE IMPLEMENTED IN THE BACKEND

    public Kurssi(String name, int credits, String lecturer,
                  ArrayList<Opiskelija> courseAttendees, HashMap<Opiskelija, Integer> grade) {
        this.name = name;
        if (credits >= 0 && credits <= 100) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException
                    ("The number of credits must be a positive integer smaller than 100");
        }
        this.lecturer = lecturer;
        this.courseAttendees = courseAttendees;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public String getLecturer() {
        return lecturer;
    }

    public ArrayList<Opiskelija> getCourseAttendees() {
        return courseAttendees;
    }

    public HashMap<Opiskelija, Integer> getGrade() {
        return grade;
    }

    // @.pre true
    // @.post RESULT == (this.name)
    public void setName(String name) {
        this.name = name;
    }

    // @.pre credits instanceof Integer
    // @.post this.credits <= 100
    public void setCredits(int credits) {
        if (credits >= 0 && credits <= 100) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException
                    ("The number of credits must be a positive integer smaller than 100");
        }
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public void setCourseAttendees(ArrayList<Opiskelija> courseAttendees) {
        this.courseAttendees = courseAttendees;
    }

    public void setGrade(HashMap<Opiskelija, Integer> grade) {
        this.grade = grade;
    }

    // @.pre studentToAdd instanceof Opiskelija
    // @.post attendees.get(size()) == studentToAdd
    public void addToCourse(ArrayList<Opiskelija> attendees, Opiskelija studentToAdd) {
        if (!attendees.contains(studentToAdd)) {
            attendees.add(studentToAdd);
        } else {
            throw new Error("Student is already in the course");
        }
    }

    public void listAttendees(ArrayList<Opiskelija> attendees) {
        String attendeesAsStr = attendees
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        if (attendees.size() > 0) {
            System.out.println(String.format("Attendees of this course %s", attendeesAsStr));
        } else {
            System.out.println("No attendees");
        }
    }

    public void gradeStudent(HashMap<Opiskelija, Integer> studentGradePair,
                             Opiskelija studentToGrade, int gradeToGive) {
        studentGradePair.put(studentToGrade, gradeToGive);
    }

    public int amountOfAttendees(ArrayList<Opiskelija> attendees) {
        return attendees.size();
    }

    // @.pre assert studentGradePair.values().forEach() instanceof Integer
    // @.post RESULT <= 5.0 && RESULT >= 0.0
    public double calculateAverage(HashMap<Opiskelija, Integer> studentGradePair) {
        double sumOfGrades = studentGradePair
                .values()
                .stream()
                .reduce(0, Integer::sum);
        double amountOfPairs = studentGradePair.size();

        return amountOfPairs > 0 ? sumOfGrades/amountOfPairs : 0;
    }

    public String courseReport() {
        return "Kurssi{" +
                "name ='" + name + '\'' +
                ", amout of attendees =" + amountOfAttendees(courseAttendees) +
                ", Grade Point Average =" + calculateAverage(grade) + '\'' +
                '}';
    }
}
