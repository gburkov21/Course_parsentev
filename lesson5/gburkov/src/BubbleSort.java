package gburkov;

public class BubbleSort {

    public int[] sort (int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                }
            }
        }
        return values;
    }
}