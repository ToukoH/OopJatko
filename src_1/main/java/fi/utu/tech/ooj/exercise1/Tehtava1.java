package fi.utu.tech.ooj.exercise1;

public class Tehtava1 {
    // TODO: Tehtävä 1: määrittele tämä
    /**
     * Takes two parameters width and height, multiplies them and returns their product which represents
     * the area bounded by the parameters
     * @param w Width.
     * @param h Height.
     * @.pre w > 0 && w != 0 && h > 0 && h != 0
     * Parameters w and h are floating point numbers greater than 0 and are not equal to null.
     * @.post RESULT == w * h && RESULT != null && RESULT > 0
     * Returns a single floating point value which is greater than 0 and not null.
     */
    public static double area(double w, double h) {
        return w * h;
    }
}
