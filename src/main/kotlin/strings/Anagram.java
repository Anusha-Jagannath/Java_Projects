package strings;

public class Anagram {

    public static void main(String[] args) {
        System.out.println("Anagram of strings");
        String str1="aat";
        String str2="abt";
        boolean isAnagram=false;
        boolean isVisited[] = new boolean[str2.length()];

        if (str1.length() == str2.length()) {
            for (int i=0;i<str1.length();i++) {
                char c = str1.charAt(i);
                isAnagram=false;
                for (int j=0;j<str2.length();j++) {
                    if (c == str2.charAt(j) && !isVisited[j]) {
                        isAnagram = true;
                        isVisited[j] = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }

            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }

    }
}
