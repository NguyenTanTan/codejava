/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Pro 2004
 */
public class JavaApplication {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int [] arr= new int[100];
        // sinh ngẫu nhiên mảng 100 giá trị
        for (int i=0; i<100; i++) {
          Random rand= new Random(); 
          int randnum= rand.nextInt(100)+1;
          arr[i]=randnum;
       }
        System.out.println("Mang ngau nhien 100 gia tri: ");
        System.out.println(Arrays.toString(arr));
         //Tìm kiếm giá trị trong mảng
        System.out.println("Nhap gia tri muon tim kiem: ");
        int n=input.nextInt();
        for (int i=0; i<100;i++){
            if(n==arr[i]){
                System.out.println("Tim thay gia tri o vi tri "+ i);
                }     
            }
        // Sắp xếp mảng
        int tam;
        for (int i=0; i<100;i++)
            for (int j=i+1;j<100;j++){
                if(arr[i]>arr[j]){
                    tam=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tam;  
                }     
            }
        // In mảng đã sắp xếp tăng dần
        System.out.println("Mang da duoc sap xep tang dan: ");
        System.out.println(Arrays.toString(arr));
        //Tìm kiếm giá trị trong mảng
        System.out.println("Nhap gia tri muon tim kiem: ");
        int m=input.nextInt();
        for (int i=0; i<100;i++){
            if(n==arr[i]){
                System.out.println("Tim thay gia tri o vi tri "+ i);
                }     
            }
    }
    
}
