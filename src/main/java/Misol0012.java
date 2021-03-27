import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int k = 0;

        for (int i = 2; i <= s; i++) {
            boolean tek = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    tek = false;
                    break;
                }

            }
            if(tek) k++;
        }
        if( k % 2 == 0) {
            System.out.println("Bobur");
        } else {
            System.out.println("Ali");
        }

    }
    
}
