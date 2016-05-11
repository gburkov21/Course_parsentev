package gburkov;

public class RemoveDublicate {

    public String[] removeDubl(String[] value) {
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[j].equals(value[i])) {
                    value[j] = "";
                }
            }
        }
        int i, length2;
        for (i = 0, length2 = 0; i < value.length; i++) {
            if (!value[i].equals("")) {
                length2++;
            }
        }
        String[] value2 = new String[length2];
        for (i = 0, length2 = 0; i < value.length; i++) {
            if (!value[i].equals("")) {
                value2[length2] = value[i];
                length2++;
            }
        }
        return value2;
    }

//    public boolean isUnique (String value, String[] values) {
//        boolean unique = true;
//        for (String value1 : values) {
//            if (value1.equals(value)) {
//                unique = false;
//            }
//        }
//        return unique;
//    }

}