import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0,b = 0, f = 6;
            for (int i = 0; i < 2 ; i++) {
              if(i == 0) {
                a = sc.nextInt();
              } else {
                b = sc.nextInt();
              }
            }
         double result = 2;
        for (int i = a; i >= 1 ; i--) {
            result = (result * result) % b;
        }
        System.out.printf("%.0f",result);
}}
