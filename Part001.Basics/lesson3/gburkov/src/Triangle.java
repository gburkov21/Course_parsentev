package gburkov;

public class Triangle
{
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        double ab = Math.abs(Math.sqrt(Math.pow((this.b.x - this.a.x), 2) + Math.pow((this.b.y - this.a.y), 2)));
        double ac = Math.abs(Math.sqrt(Math.pow((this.c.x - this.a.x), 2) + Math.pow((this.c.y - this.a.y), 2)));
        double bc = Math.abs(Math.sqrt(Math.pow((this.c.x - this.b.x), 2) + Math.pow((this.c.y - this.b.y), 2)));

        if ((ab < ac + bc) && (ac < ab + bc) && (bc < ac + bc)) return true;
        else return false;
    }

    public double area()
    {
        double square = Math.abs(0.5 * ((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y)));
        return square;

       //calculate the triangle area
    }
}