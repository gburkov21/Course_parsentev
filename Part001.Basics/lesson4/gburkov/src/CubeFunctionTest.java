package gburkov;

public class CubeFunctionTest {
    public static void main(String[] args) {

        CubeFunction function = new CubeFunction(2, 5, 3);
        double discr = function.b * function.b - (4 * function.a * function.c);
        float x1;
        float x2;

        if (discr == 0) {
            x1 = x2 = -function.b / (2 * function.a);
            float y = function.calculate((int) x1);
            System.out.println("x = " + x1);
            System.out.println("y = " + y);


        } else if (discr > 0) {
            x1 = (float) ((-function.b + Math.sqrt(discr)) / (2 * function.a));
            x2 = (float) ((-function.b - Math.sqrt(discr)) / (2 * function.a));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            float y1 = function.calculate((int) x1);
            float y2 = function.calculate((int) x2);
            System.out.println("y1 = " + y1);
            System.out.println("y2 = " + y2);

        } else System.out.println("no values");
    }
}