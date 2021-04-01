import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(left(n) == tek(right(n)))
          System.out.println("1");
        else System.out.println("0");
    }

    public static int left(int a) {
        String b = "";
        b += a;
        int Summa = 0;
        for (int i = 0; i < b.length(); i++) {
            Summa += b.charAt(i) - 48;
        }
        return Summa;
    }

    public static String right(int a) {
        int i = 2;
        String k = "";
        while (a > 1) {
            if (a % i == 0) {
                a = a / i;
                k += i;
            } else {
                i++;
            }
        }
        return k;
    }

    public static int tek(String a) {
        int Summa = 0;
        for (int i = 0; i < a.length(); i++) {
            Summa += a.charAt(i) - 48;
        }
        return Summa;
    }
}
