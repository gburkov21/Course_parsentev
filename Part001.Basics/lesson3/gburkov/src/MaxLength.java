package gburkov;

public class MaxLength
{
    Triangle triangle;

    public MaxLength(Triangle triangle)
    {
        this.triangle = triangle;
    }

    public double max(Point a, Point b, Point c)
    {
        double ab = Math.abs(Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2)));
        double ac = Math.abs(Math.sqrt(Math.pow((c.x - a.x), 2) + Math.pow((c.y - a.y), 2)));
        double bc = Math.abs(Math.sqrt(Math.pow((c.x - b.x), 2) + Math.pow((c.y - b.y), 2)));
        if (ab > Math.max(ac, bc)) return ab;
        else if (ac > Math.max(ab, bc)) return ac;
        else return bc;

    }
}