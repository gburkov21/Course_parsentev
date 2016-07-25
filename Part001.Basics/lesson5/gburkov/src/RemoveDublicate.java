package gburkov;

public class RemoveDublicate {

    public String[] removeDubl(String[] value) {
        int index, length2;
        String[] value2 = new String[value.length];
        for (index = 0, length2 = 0; index < value.length; index++) {
            for (int j = index + 1; j < value.length; j++) {
                if (value[j].equals(value[index])) {
                    value[j] = "";
                }
            }
            if (!value[index].isEmpty()) {
                value2[length2] = value[index];
                length2++;
            }
        }
        value2 = Arrays.copyOf(value2, length2);
        return value2;
    }
}