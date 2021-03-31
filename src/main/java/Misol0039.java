import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean t = true;
            int k = i % 100;
            if (k + i != n) t = false;
            if (t) System.out.print(i+" ");
        }
    }
}
