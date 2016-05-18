package gburkov;

public class SubWord {

    boolean contains(String line, String sub) {
        boolean isContains = false;
        char[] lineArray = line.toCharArray();
        char[] subLineArray = sub.toCharArray();
        String result = "";

        for (char aSubLineArray : subLineArray) {
            for (char aLineArray : lineArray) {
                if (aSubLineArray == aLineArray) {
                    result = result + aSubLineArray;
                    break;
                }
            }
        }

        if (result.equals(sub)) {
            isContains = true;
        }

        return isContains;
    }
}