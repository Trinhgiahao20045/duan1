/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dulieumang1chieu;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //khai bao mang luu so nguyen
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("cho biet so phan tu: ");
        n = sc.nextInt();
        a = new int[n];
//Nhap giá trị cho mảng từ bàn phím
        nhapMang(a, sc);
//a.xuat mang ra man hinh
        System.out.println("===Mang a=====");
        xuatMang(a);
//b.Tinh tong mang
        int tong = tinhTong(a);
        System.out.print("\nTong gia tri mang:" + tong);
//c.Dem duong le trong mang
        int dem_duong_le = demDuongLe(a);
        System.out.print("\nSo duong le co trong mang:" + dem_duong_le);
        int max = TimMax(a);
        System.out.print("\nPhan tu lon nhat:" + max);
    }
    //nhap mang

    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhap a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
    //a.xuat mang

    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    //b.tinh tong gia tri
    public static int tinhTong (int[]a)
    {
        int sum=0;
        for(int x : a)
        {sum+=x;}
        return sum;
    }
    //c.dem co bao nhieu duong le
    public static int demDuongLe(int[] a){
        int dem_duong_le =0;
        for(int x : a)
        {if (x > 0 && x%2 !=0) 
        {dem_duong_le++; 
        }
       }
        return dem_duong_le; 
    }
    //.tim phan lon nhat cua mang
    public static int TimMax(int []a){
        int max=a[0];
        for(int x : a)
        {if (x > max)
        {
            max=x;
        }
        }
        return max;
    }
}
