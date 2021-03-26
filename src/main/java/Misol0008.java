import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSum = 0, minValue = Integer.MAX_VALUE, maxValue = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            totalSum += num;
            if (minValue > num) minValue = num;
            if (maxValue < num) maxValue = num;
        }

        System.out.printf("%.0f %.0f", (totalSum - maxValue+0.0), (totalSum - minValue+0.0));
    }
}
