package hashmapworking;

public class Demo {

    public static void main(String args[]) {
        System.out.println(getHash("cat"));
        System.out.println(getHash("CAT"));
    }

    static private int getHash(String s) {
        int hash = 0;
        for(int i=0;i<s.length();i++) {
            hash = hash + s.charAt(i);
        }
        return hash;
    }

    //s.charAt(i)*pow(31, n-i)
}
