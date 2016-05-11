package gburkov;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] values = {8, 3, 29, 1, 13, 5, 2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(values);
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}