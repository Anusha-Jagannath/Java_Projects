package accessmodifiers.subpackage;

import java.io.*;
import java.util.*;

public class gkg {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count=0;
        // Write your code here.
        if(!scan.hasNext()) {
            String[] a = s.trim().split("[ !,?._'@]+");
            for(int i=0;i<a.length;i++) {
                count++;
            }

            System.out.println(count);
            for( String s1: a) {
                System.out.println(s1);
            }
        } else {
            System.out.print(0);
        }

    }
}