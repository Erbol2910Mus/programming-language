import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int hours = (n / 60) % 24;
        int minutes = n % 60;

        System.out.println(hours + " " + minutes);
    }
}