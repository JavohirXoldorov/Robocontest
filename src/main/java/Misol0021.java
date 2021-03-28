import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, N = 0;
        for (int i = 0; i < 3; i++) {
            a = sc.nextInt();
            if(a % 2 == 0) {
              N += a/2;
            } else {
              N += a/2 + 1;
            }
        }
        System.out.println(N);

}}
