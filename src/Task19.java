import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int day = (h - a + (a - b) - 1) / (a - b) + 1;

        System.out.println(day);
    }
}