package gburkov;

public class SubWord {

    boolean contains(String line, String sub) {
        char[] lineArray = line.toCharArray();
        char[] subLineArray = sub.toCharArray();
        boolean isContains = false;

        for (int i = 0; i < lineArray.length; i++) {
            for (int j = 0; j < subLineArray.length; j++) {

                if (subLineArray[j] == lineArray[i]) {
                    isContains = true;
                    i++;

                    if (j == subLineArray.length-1){
                        return isContains;
                    }
                    continue;
                }
                    isContains = false;
                    break;


            }
        }

        return isContains;
    }
}