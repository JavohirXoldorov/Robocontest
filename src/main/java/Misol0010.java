import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        double summa  = 0;
        for (int i = 0; i <3 ; i++) {
            summa += sc.nextDouble();
        }
        if(summa<price) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
    
}
