
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class testArray1Dimensi {
    public static void main (String[] args) {
        Scanner masuk = new Scanner(System.in);
        float jumlah, rata, maks, min;
        float nilai[] = new float[5];
        
        System.out.println("Masukkan 5 buah data nilai");
        for(int i=0;i<5;i++){
            System.out.print("Data ke" + (i+1) + ":");
            nilai[i]=masuk.nextFloat();
        }
         System.out.println("data nilai yang dimasukkan");
         for (int i=0;i<5;i++)
         System.out.println("Nilai ke " + i + " : " + nilai[i]);
    }
}

