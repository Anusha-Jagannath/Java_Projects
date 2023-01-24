package reverse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<5;i++) {
            list.add(i);
        }

        reverseList(list);
    }

    private static void reverseList(List<Integer> list) {
        List<Integer> reverse = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--) {
            reverse.add(list.get(i));
        }

        System.out.println(reverse);
    }
}
