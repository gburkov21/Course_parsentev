package gburkov;

public class SubWordTest {
    public static void main(String[] args) {
        SubWord test = new SubWord();
        String word = "hello java";
        String subWord = "java";
        System.out.println(test.contains(word, subWord));
    }
}