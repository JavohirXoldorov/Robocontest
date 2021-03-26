import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int num, aloneNum = sc.nextInt();
        for (int i = 0; i <n-1 ; i++) {
            num = sc.nextInt();
            aloneNum = aloneNum ^num;
        }
        
      System.out.println(aloneNum);
   
}}
