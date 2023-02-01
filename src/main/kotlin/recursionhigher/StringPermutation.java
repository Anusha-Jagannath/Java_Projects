package recursionhigher;

public class StringPermutation {

    public static void main(String args[]) {
        System.out.println("Learning string permutations");
    }

    private static void permutations(String s,int l,int r) {
        if (l == r) {
            System.out.println(s);
            return;
        }

        for(int i = l;i<r;i++) {
            s = interchange(s,l,i);
            permutations(s,l+1,r);
            s = interchange(s,l,i);
        }
    }

    private static String interchange(String s,int a,int b) {
        char arr[] = s.toCharArray();
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return new String(arr);
    }
}
