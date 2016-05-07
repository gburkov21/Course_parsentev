package gburkov;

public class TriangleTest
{
    public static void main(String[] args)
    {
        Point a = new Point(-1, 3);
        Point b = new Point(2, -3);
        Point c = new Point(-1, -4);

        Triangle triangle = new Triangle(a, b, c);

        if (triangle.isTriangle()) {
            System.out.println("triangle area: " + triangle.area());
            MaxLength maxLength = new MaxLength(triangle);
            System.out.println("max length: " + maxLength.max(a, b, c));
        } else {
            System.out.println("figure is not a triangle!");
        }
    }
}