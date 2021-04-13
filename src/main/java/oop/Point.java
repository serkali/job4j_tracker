package oop;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point() {
    }

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Point point = new Point(0, 0,0);
        Point point1 = new Point(0, 2,2);
        double dist = point.distance3d(point1);
        System.out.println(dist);
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x- that.x,2)+Math.pow(this.y-that.y,2)+Math.pow(this.z-that.z,2));
    }

}

