package fi.utu.tech.ooj.exercise1;

public class Tehtava3 {
    class Student {

    }

    /**
     * @.pre s != null && s.length() > 0 && times >= 0
     * Merkkijono s on pituudeltaan suurempi kuin nolla ja erisuuri kuin null. Times on suurempi kuin nolla
     * ja kuvastaa sitä kuinka monta kertaa merkkijono s tulostetaan
     * @.post EI MÄÄRITETTY
     */
    String repeatString( String s, int times) {
        return s.repeat(times);
    }

    /**
     * @.pre allStudents != null && FORALL(s : allStudents; s != null)
     * The array representing all students is not empty and all student objects inside that array are not null.
     * @.post EI MÄÄRITETTY
     */
    public Student[] getActiveStudents(Student[] allStudents) {
        return null; // ei toteutettu
    }

    /**
     * @.pre EI MÄÄRITETTY
     * @.post s.length() <= RESULT.length() &&
     *        RESULT.length() <= 2*s.length() &&
     *        RESULT.substring(0, s.length()).equals(s) &&
     *        new StringBuilder(RESULT).reverse().toString().equals(RESULT)
     * Loppuehto: Length of the given parameter is smaller or equal to itself reversed (RESULT). Result is also smaller than
     *            the length of given parameter multiplied by two. The result, sliced from first char to last equals itself.
     *
     */
    String generatePalindrome(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * @.pre students != null &&
     *       studentNumber != null &&
     *       studentNumber.length() > 0 &&
     *       FORALL(i : 0 <= i < studentNumber.length(); Character.isDigit(studentNumber.charAt(i)))
     *
     *       Students table of Student type objects can't be empty. Also, the student number associated with the
     *       corresponding student can't be null or smaller or equal to zero. Also, the student number must be all numbers
     *       for the whole length of the string.
     * @.post EI MÄÄRITETTY
     */
    Student findStudent(Student[] students, String studentNumber) {
        return null; // ei toteutettu
    }

    /**
     * @.pre (EXISTS(s : students;
     *          s.getStudentNumber ().equals(studentNumber)) ==> (RESULT != null)) &&
 *           (RESULT.getStudentNumber().equals(studentNumber) &&
     *          (!EXISTS(s : students; s.getStudentNumber().equals(studentNumber))) ==> (RESULT == null))`
     *
     * @.post The result is not null and same as the original student number given as a parameter. If the student doesn't
     *        exist in the register, the result will be null.
     */
    Student findStudent2(Student[] students, String studentNumber) {
        return null; // ei toteutettu
    }
}
