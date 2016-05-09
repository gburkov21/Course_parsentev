package gburkov;

public class Factorial {

    public static int fact(int value) {
        if (value < 0) return -1;
        else if (value == 0) return 1;
        else {
            int sum = 1;
            for (int i = 1; i <= value; i++) {
                sum = sum * i;
            }
            return sum;
        }
    }
}