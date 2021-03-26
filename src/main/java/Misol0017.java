import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
      int k = 0;
        for (int i = 1; i <50000000; i++) {
            if(tek(i) == 1)
            { k++; }
            if(k == n){
                System.out.println(i);
              break;
            }
        }
    }
public  static  int tek(int a){
        String b = "";
        b += a;
        int S = 0;
    for (int i = 0; i <b.length() ; i++) {
        S += b.charAt(i)-48;
    }
  S = S*S;
    if( a%S == 0)
      return 1;
    return 0;


}
}
