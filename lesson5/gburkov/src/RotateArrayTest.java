package gburkov;

public class RotateArrayTest {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.round(Math.random() * 10);
            }
        }

        RotateArray myArray = new RotateArray();
        myArray.printArray(array);
        System.out.println();
        myArray.rotate(array);
        myArray.printArray(array);
    }
}