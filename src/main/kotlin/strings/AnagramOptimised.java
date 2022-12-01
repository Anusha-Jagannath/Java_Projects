package strings;

public class AnagramOptimised {

    public static void main(String args[]) {
        String str1="cat";
        String str2="act";
        boolean isAnagram = true;

        int al[] = new int[256];
        int bl[] = new int[256];

        for (char c: str1.toCharArray()) {
            al[c] += 1;
        }

        for (char c: str2.toCharArray()) {
            bl[c] += 1;
        }

        for (int i=0;i<256;i++) {
            if (al[i]!=bl[i]) {
                isAnagram=false;
                break;
            }
        }

        for (int i=0;i<256;i++) {
            System.out.print(al[i]);
        }
        System.out.println();
        for (int i=0;i<256;i++ ){
            System.out.print(bl[i]);
        }

        if (isAnagram) {
            System.out.println("Anagram string");
        } else {
            System.out.println("Not a anagram string");
        }
    }
}
