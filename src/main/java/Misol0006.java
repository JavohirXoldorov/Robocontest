import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sana, oy = 9, yil;
        n = sc.nextInt();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            sana = 12;
        } else {
            sana = 13;
        }
        System.out.println(String.format("%02d/%02d/%04d", sana, oy, n));
    }
}
