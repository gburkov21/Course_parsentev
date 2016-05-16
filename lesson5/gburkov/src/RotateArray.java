package gburkov;

public class RotateArray {

    public void rotate(int[][] values) {
        int[][] array2 = new int[values.length][values.length];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                array2[i][j] = values[values.length - j - 1][i];
            }
        }
        printArray(array2);
    }

    public void printArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
}