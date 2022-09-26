package fi.utu.tech.ooj.exercise1;

public class Tehtava2 {
    // TODO: Tehtävä 2: määrittele tämä
    /**
     * Method checks if the time period bounded by txStart and txEnd are overlapping.
     * @param t1Start Start of the first time period.
     * @param t1End End of the first time period.
     * @param t2Start Start of the second time period.
     * @param t2End End of the second time period.
     * @.pre t1Start > 0 && t1Start != null && t2Start > 0 && t2Start != null && t1End > 0 && t1End != null && t2End > 0 && t2End != null
     * Alkuehto: Parameters are integers greater than zero and not null. t1- and t2Start are determined to
     * be greater than their corresponding t1- and t2End -values.
     * @.post RESULT != null &&
     * RESULT == true if (t1Start <= t2Start && t2Start <= t1End || t1Start <= t2End && t2End <= t1End
     * || t2Start <= t1Start && t1Start <= t2End || t2Start <= t1End && t1End <= t2End) else false
     * Loppuehto: Returns true if time periods bounded by parameters are overlapping and false if not.
     */
    public static boolean areOverlapping(int t1Start, int t1End, int t2Start, int t2End) {
        if (t1Start <= t2Start && t2Start <= t1End) return true;
        if (t1Start <= t2End && t2End <= t1End) return true;
        if (t2Start <= t1Start && t1Start <= t2End) return true;
        if (t2Start <= t1End && t1End <= t2End) return true;
        return false;
    }
}
