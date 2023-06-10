/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 *
 * @author Administrator
 */
//import javax.swing.JOptionPane;

public class Perpus {
    public static void main(String[] args){
//        Deklarasi anggota perpus
        Anggota Ricko = new Anggota();
        Anggota Raj = new Anggota();
        Anggota Noval = new Anggota();
        Anggota Ryan = new Anggota();
        Anggota Reja = new Anggota();
        
//        isi data anggota perpus
        Ricko.ID = "AP01";
        Ricko.nama = "Mohammad Ricko Aprilianto";
        Ricko.alamat = "Jalan Padat Karya Komplek Purnama Permai 3 Jalur 7B No.313";
        Ricko.hp = "08193242218";
        Ricko.umur = 19;
        
        Raj.ID = "AP02";
        Raj.nama = "Raj Surya Ajie Perkasa";
        Raj.alamat = "Jalan-Jalan";
        Raj.hp = "085349171494";
        Raj.umur = 19;
        
        Ryan.ID = "AP03";
        Ryan.nama = "Ryan Rizky Pratama";
        Ryan.alamat = "Jalan Tiada Akhir";
        Ryan.hp = "082345678912";
        Ryan.umur = 19;
        
        Reja.ID = "AP04";
        Reja.nama = "Mohammad Ricko Aprilianto";
        Reja.alamat = "Jalan Padat Karya Komplek Purnama Permai 3 Jalur 7B No.313";
        Reja.hp = "08193256221";
        Reja.umur = 19;
        
        Noval.ID = "AP05";
        Noval.nama = "Noval Ifwan Saputra";
        Noval.alamat = "Jalan Yang Sesat";
        Noval.hp = "08193218672";
        Noval.umur = 19;
        
//        cetak data anggota
        int i = 1;

        System.out.println("Data Anggota " + i);
        System.out.println("ID  : " + Ricko.ID);
        System.out.println("NAMA : " + Ricko.nama);
        System.out.println("ALAMAT : " + Ricko.alamat);
        System.out.println("NOMOR HP : " + Ricko.hp);
        System.out.println("UMUR : " + Ricko.umur);
        i++;
        
        System.out.println("==============================");
        
        System.out.println("Data Anggota " + i);
        System.out.println("ID  : " + Raj.ID);
        System.out.println("NAMA : " + Raj.nama);
        System.out.println("ALAMAT : " + Raj.alamat);
        System.out.println("NOMOR HP : " + Raj.hp);
        System.out.println("UMUR : " + Raj.umur);
        i++;

        
        System.out.println("==============================");
        
        System.out.println("Data Anggota " + i);
        System.out.println("ID  : " + Ryan.ID);
        System.out.println("NAMA : " + Ryan.nama);
        System.out.println("ALAMAT : " + Ryan.alamat);
        System.out.println("NOMOR HP : " + Ryan.hp);
        System.out.println("UMUR : " + Ryan.umur);
        i++;

        
        System.out.println("==============================");
        
        System.out.println("Data Anggota " + i);
        System.out.println("ID  : " + Reja.ID);
        System.out.println("NAMA : " + Reja.nama);
        System.out.println("ALAMAT : " + Reja.alamat);
        System.out.println("NOMOR HP : " + Reja.hp);
        System.out.println("UMUR : " + Reja.umur);
        i++;

        System.out.println("==============================");
        
        System.out.println("Data Anggota " + i);
        System.out.println("ID  : " + Noval.ID);
        System.out.println("NAMA : " + Noval.nama);
        System.out.println("ALAMAT : " + Noval.alamat);
        System.out.println("NOMOR HP : " + Noval.hp);
        System.out.println("UMUR : " + Noval.umur);
        
//        search anggota
        
    }
}
