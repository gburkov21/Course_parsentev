package gburkov;

public class TriangleTest
{
    public static void main(String[] args)
    {
        Point a = new Point(-1, 3);
        Point b = new Point(2, -3);
        Point c = new Point(-1, -4);

        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.area());

        MaxLength maxLength = new MaxLength(triangle);
        System.out.println(maxLength.max(a, b, c));
    }
}