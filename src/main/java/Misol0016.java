import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String k = "";
        k += a;
        int mil = 0;
        if (k.length() >= 12) {
            tek1(k.charAt(0));
            yuz();
            k = k.substring(1, k.length());
        }
        if (k.length() >= 11) {
            tek2(k.charAt(0));
            k = k.substring(1, k.length());
        }
        if (k.length() >= 10) {
            tek1(k.charAt(0));
            milliard();
            k = k.substring(1, k.length());
        }
        if (k.length() >= 9) {
            tek1(k.charAt(0));
            if (k.charAt(0) != '0') {
                yuz();
                mil = 1;
            }
            k = k.substring(1, k.length());
        }
        if (k.length() >= 8) {
            tek2(k.charAt(0));
            if (k.charAt(0) != '0') {
                mil = 1;
            }
            k = k.substring(1, k.length());
        }
        if (k.length() >= 7) {
            tek1(k.charAt(0));
            if (k.charAt(0) != '0') {
                mil = 1;
            }
            if (mil != 0) {
                million();
            }
            k = k.substring(1, k.length());
        }
        mil = 0;
        if (k.length() >= 6) {
            tek1(k.charAt(0));
            if (k.charAt(0) != '0') {
                yuz();
                mil = 1;
            }
            k = k.substring(1, k.length());
        }
        if (k.length() >= 5) {
            tek2(k.charAt(0));
            if (k.charAt(0) != '0') {
                mil = 1;
            }
            k = k.substring(1, k.length());
        }
        if (k.length() >= 4) {
            tek1(k.charAt(0));
            if (k.charAt(0) != '0') {
                mil = 1;
            }
            if (mil != 0) ming();
            k = k.substring(1, k.length());
        }
        if (k.length() >= 3) {
            tek1(k.charAt(0));
            if (k.charAt(0) != '0') yuz();
            k = k.substring(1, k.length());
        }
        if (k.length() >= 2) {
            tek2(k.charAt(0));
            k = k.substring(1, k.length());
        }
        if (k.length() >= 1) {
            tek1(k.charAt(0));
        }

    }

    public static void tek1(char a) {
        switch (a) {
            case '1':
                System.out.print("bir ");
                break;
            case '2':
                System.out.print("ikki ");
                break;
            case '3':
                System.out.print("uch ");
                break;
            case '4':
                System.out.print("to'rt ");
                break;
            case '5':
                System.out.print("besh ");
                break;
            case '6':
                System.out.print("olti ");
                break;
            case '7':
                System.out.print("yetti ");
                break;
            case '8':
                System.out.print("sakkiz ");
                break;
            case '9':
                System.out.print("to'qqiz ");
            default:
                System.out.print("");
                break;
        }
    }

    public static void tek2(char l) {

        switch (l) {
            case '1':
                System.out.print("o'n ");
                break;
            case '2':
                System.out.print("yigirma ");
                break;
            case '3':
                System.out.print("o'ttiz ");
                break;
            case '4':
                System.out.print("qirq ");
                break;
            case '5':
                System.out.print("ellik ");
                break;
            case '6':
                System.out.print("oltmish ");
                break;
            case '7':
                System.out.print("yetmish ");
                break;
            case '8':
                System.out.print("sakson ");
                break;
            case '9':
                System.out.print("to'qson ");
            default:
                System.out.print("");
                break;
        }
    }

    public static void yuz() {
        System.out.print("yuz ");
    }

    public static void ming() {
        System.out.print("ming ");
    }

    public static void million() {
        System.out.print("million ");
    }

    public static void milliard() {
        System.out.print("milliard ");
    }
}
