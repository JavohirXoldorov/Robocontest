import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][3];
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3 ; j++) {
                a[i][j]=sc.nextInt();
            }
        }
      int S1 = a[0][0]*3600+a[0][1]*60+a[0][2];
      int S2 = a[1][0]*3600+a[1][1]*60+a[1][2];
      System.out.println(S2-S1);

}}
