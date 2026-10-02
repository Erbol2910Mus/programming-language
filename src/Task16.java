import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int s1 = in.nextInt();

        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int s2 = in.nextInt();

        int time1 = h1 * 3600 + m1 * 60 + s1;
        int time2 = h2 * 3600 + m2 * 60 + s2;

        System.out.println(time2 - time1);
    }
}