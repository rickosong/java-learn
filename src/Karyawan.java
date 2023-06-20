/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Karyawan {
    String ID, nama, divisi;
    double gaji;
    
//    method void
    void cetakdata() {
        System.out.println("===========================");
        System.out.println("Data Karyawan");
        System.out.println("ID              : " + ID);
        System.out.println("NAMA            : " + nama);
        System.out.println("DIVISI          : " + divisi);
        System.out.println("GAJI            : RP. " + gaji);      
        System.out.println("SUMBANGAN ZAKAT : RP. " + hitungSumbanganZakat());
    }
    
//    method non-void
    double hitungSumbanganZakat() {
        double zakat = gaji * 0.025;
        return zakat;
    }
}
