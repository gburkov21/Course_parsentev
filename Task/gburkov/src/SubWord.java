package gburkov;

public class SubWord {

    boolean contains(String line, String sub) {
        char[] lineArray = line.toCharArray();
        char[] subLineArray = sub.toCharArray();
        boolean isContains = false;
        int k = 0;

        for (int i = 0; i < lineArray.length; i++) {
            for (int j = 0; j < subLineArray.length; j++) {
                if (subLineArray[k] == lineArray[i]) {
                        k++;
                    if (k == subLineArray.length){
                        return isContains;
                    }
                        isContains = true;
                        break;
                }
                else {
                    isContains = false;
                    break;
                }
            }
        }

        return isContains;
    }
}