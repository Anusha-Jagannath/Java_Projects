package stringdemo;

public class ReverseString {

    public static void main(String args[]) {
        String s1 = "He is a boy";
        String[] newString = s1.split(" ");
        int count = 0;
        for (String s : newString) {
            count++;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.println(newString[i]);
        }
    }
}
