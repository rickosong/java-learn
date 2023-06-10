/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;


public class array1Dimensi {
    public static void main (String[] args) {
        Scanner masuk = new Scanner(System.in);
        float jumlah, rata, maks, min;
        float nilai[] = new float[5];
        
        System.out.print("Masukkan 5 buah data nilai");
        for(int i=0;i<5;i++){
            System.out.print("Data ke" + (i+1) + ":");
            nilai[i]=masuk.nextFloat();
        }
        
        System.out.println("data nilai yang dimasukkan");
        for (int i=0;i<5;i++)
            System.out.println(nilai[i]);
            jumlah = 0;
            for (int i=0;i<5;i++)
                jumlah = jumlah + nilai[i];
                rata = jumlah / 5;
            {
                maks = nilai[0];
                min = nilai[0];
                for (int i=0;i<5;i++)
                {
                    if (maks < nilai[i])
                        maks = nilai[i];
                        if (min > nilai[i])
                            min = nilai[i];
                }
            }
            System.out.println("jumlah: " + jumlah);
            System.out.println("rata-rata: " + rata);
            System.out.println("Nilai Terbesar: " + maks);
            System.out.println("Nilai Terkecil: " + min);
    }
}
