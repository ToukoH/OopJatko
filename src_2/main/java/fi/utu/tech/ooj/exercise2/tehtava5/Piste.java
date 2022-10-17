package fi.utu.tech.ooj.exercise2.tehtava5;

// määrittää kaksiulotteisen xy-pisteen
final class Piste {
    final double x;
    final double y;

    public Piste(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // laskee uuden pisteen r-säteisellä kehällä kulmassa angle
    Piste kehä(double angle, double r) {
        return new Piste(
                x + r * Math.cos(angle),
                y + r * Math.sin(angle)
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}