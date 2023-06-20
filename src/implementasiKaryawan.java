/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class implementasiKaryawan {
    public static void main(String[] args){
        //        membuat karyawan
        Karyawan Ricko = new Karyawan();
        Karyawan Raj = new Karyawan();
        
//        mengisi nilai ke dalam objek karyawan Ricko
        Ricko.ID = "PakeNanya04";
        Ricko.divisi = "IT Consultant";
        Ricko.nama = "Mohammad Ricko Aprilianto";
        Ricko.gaji = 5000000.00;
        
//        mengisi nilai ke dalam objek karyawan Raj
        Raj.ID = "PakeNanya02";
        Raj.divisi = "Direktur Personalia";
        Raj.nama = "Raj Surya Ajie Perkasa";
        Raj.gaji = 2000000.00;
        
//        mencetak data dengan method
        Ricko.cetakdata();
        Raj.cetakdata();
        
//        cetak data secara manual
//        System.out.println("Data Karyawan");
//        System.out.println("ID  : " + Ricko.ID);
//        System.out.println("NAMA : " + Ricko.nama);
//        System.out.println("DIVISI : " + Ricko.divisi);
//        System.out.println("GAJI : " + Ricko.gaji);
//        
//        System.out.println("==============================");
//        
//        System.out.println("Data Karyawan");
//        System.out.println("ID  : " + Raj.ID);
//        System.out.println("NAMA : " + Raj.nama);
//        System.out.println("DIVISI : " + Raj.divisi);
//        System.out.println("GAJI : " + Raj.gaji);
//        
    }
}
