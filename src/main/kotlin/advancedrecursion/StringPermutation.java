package advancedrecursion;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

    static Set set = new HashSet();

    public static void main(String args[]) {
        System.out.println("Learning string permutation");
        String s = "abcc";
        permutation(s,0,3);
    }

    private static void permutation(String s, int l, int r) {

        if (l == r) {
            if (set.contains(s)) {
              return;
            }
            set.add(s);
            System.out.println(s);
            return;
        }

        for(int i=l;i<=r;i++) {
            s = interchange(s,l,i);
            permutation(s,l+1,r);
            s = interchange(s,l,i);
        }

    }

    private static String interchange(String s,int a,int b) {
        char c[] = s.toCharArray();
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
        return new String(c);
    }
}
