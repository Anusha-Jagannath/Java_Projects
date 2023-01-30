package recursionpart2;

public class PermutationOfString {

    public static void main(String args[]){
        System.out.println("Printing string permutations");
    }

    static void permutations(String s, int l,int r) {

        if (l == r) {
            System.out.println(s);
            return;
        }

        for(int i=l;i<r;i++) {
           String s1 = interchange(s,l,i);
           permutations(s1,l,r);
           interchange(s1,l,i);
        }

    }

    static String interchange(String s, int a,int b) {
        char array[] = s.toCharArray();
        char temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        String s1 = new String(array);
        return s1;
    }
}
