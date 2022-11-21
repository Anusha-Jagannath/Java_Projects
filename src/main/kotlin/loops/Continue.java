package loops;

public class Continue {
    public static void main(String[] args) {
        System.out.println("Learning continue");
        for (int i=0;i<100;i++) {
            if (i>40 &&i<50)
                continue;
            System.out.println(i);
        }

        System.out.println("Nested for loops");
        for (int j=1;j<=10;j++) {
            for (int i=1;i<=10;i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
