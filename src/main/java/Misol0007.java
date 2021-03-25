import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        double a[] = new double[45];
        a[0] = 2;
        a[1] = 2;
        for (int i = 2; i < 45; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.printf("%.0f", a[n - 1]);
    }
}
