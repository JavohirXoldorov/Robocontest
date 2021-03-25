import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        int k = 0;
        int a = 0, b = 0, c = 0;
        if (n == 0) {
            System.out.println("-1");
        }
        else if (n == -1) {
            System.out.println("1");
        }
        else {
            if (n < 0) b = -n;
            else b = n;
            for (int i = 1; i <= Math.sqrt(b); i++) {
                if (b % i == 0) {
                    if (b / i == i) {
                        k+=2;
                    } else {
                        k += 2;
                    }
                }
            }
            if(n<0&&Math.sqrt(-n)%1.0==0){k=k-1;}
            System.out.println(k);

        }

    }
}
