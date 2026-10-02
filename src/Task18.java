import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(n - k % n);
    }
}