import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int minutes = 9 * 60 + n * 45 + (n - 1) / 2 * 5 + n / 2 * 15;

        System.out.println(minutes / 60 + " " + minutes % 60);
    }
}