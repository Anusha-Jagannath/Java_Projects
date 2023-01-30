package recursionpart;

public class Permutation {

    public static void main(String args[]) {
        System.out.println("Learning string permutation");

    }

    private static void stringPermutation(String s,int l,int r) {
        if (l == r) {
            System.out.println(s);
            return;
        }

        for(int i=l;i<=r;i++) {
            String s1 = interchange(s,l,i);
            stringPermutation(s,l+1,r);
            s1 = interchange(s,l,i);
        }
    }

    private static String interchange(String s, int a,int b) {
        char c[] = s.toCharArray();
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;

        return new String(c);

    }
}
