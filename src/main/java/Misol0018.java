import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        ArrayList<Integer> arr=new ArrayList<>();
        int A[][]={{4,9,2},{3,5,7},{8,1,6}};
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        int min=0,Summa=0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Summa += Math.abs(a[i][j] - A[i][j]);
                }}
            arr.add(Summa);  Summa=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Summa += Math.abs(a[i][j] - A[i][2-j]);
            }}
        arr.add(Summa);  Summa=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Summa += Math.abs(a[i][j] - A[j][2-i]);
            }}
        arr.add(Summa);  Summa=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Summa += Math.abs(a[i][j] - A[2-j][2-i]);
            }}
        arr.add(Summa);  Summa=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Summa += Math.abs(a[i][j] - A[2-i][j]);
            }}
        arr.add(Summa);  Summa=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Summa += Math.abs(a[i][j] - A[2-i][2-j]);
            }}
        arr.add(Summa);  Summa=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Summa += Math.abs(a[i][j] - A[j][i]);
            }}
        arr.add(Summa);  Summa=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Summa += Math.abs(a[i][j] - A[2-j][i]);
            }}
        arr.add(Summa);  Summa=0;       Collections.sort(arr);
        System.out.println(arr.get(0));}}
