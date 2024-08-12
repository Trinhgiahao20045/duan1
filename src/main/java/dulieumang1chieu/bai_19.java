/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dulieumang1chieu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//khai bao mang
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        n = docsophantu(sc);
        //cap phat so phan tu cho mang
        a = new int[n];
        phatsinhmang(a);
        //xuat mang
        System.out.print("\nmang duoc phat sinh:");
        xuatMang(a);

    }
    //a.xuat mang

    public static void xuatMang(int[] a) {
        System.out.print(Arrays.toString(a));
    }

    //b.dem co bao nhieu duong le
    public static void phatsinhmang(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
    }

    //.tim phan nho nhat cua mang
    public static int docsophantu(Scanner sc) {
        int n = 0;
        do {
            System.out.print("cho biet so phan tu mang (1<=n<=20: ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        return n;
    }

    public static void sapxeptang(int[] a) {
        Arrays.sort(a);
    }
}
