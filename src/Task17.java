import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int days = (m + n - 1) / n;

        System.out.println(days);
    }
}