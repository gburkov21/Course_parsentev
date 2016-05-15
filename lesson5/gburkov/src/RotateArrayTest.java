package gburkov;

public class RotateArrayTest {
    public static void main(String[] args) {
        int[][] values = new int[3][3];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = (int) Math.round(Math.random() * 10);
            }
        }

        RotateArray myArray = new RotateArray();
        myArray.printArray(values);
        System.out.println();
        myArray.rotate(values);
        myArray.printArray(values);
    }
}