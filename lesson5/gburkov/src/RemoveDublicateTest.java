package gburkov;

public class RemoveDublicateTest {
    public static void main(String[] args) {
        RemoveDublicate dublicate = new RemoveDublicate();
        String[] strings = {"aa", "bb", "dd", "bb", "sdf", "cc", "ee", "cc", "dd", "ee", "aa", "sdf", "sdf", "aa", "bb"};
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(dublicate.removeDubl(strings)));
    }
}