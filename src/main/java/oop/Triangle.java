package oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }


    public boolean exist(double ab, double ac, double bc) {
        if (ab == 0 || ac == 0 || bc == 0) {

            return false;
        }
        if (ab < ac + bc && ac < ab + bc && bc < ac + ab) {
            return true;
        }
        return false;
    }


    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            /* написать формулу для расчета площади треугольника. */
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        } else
            rsl = -1;

        return rsl;
    }
}
//     * √ p *(p - ab) * (p - ac) * (p - bc)