/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Barang {
    String kode, namaBarang, jenisBarang;
    int hargaBeli, hargaJual, stok;
    
    void tampilBarang() {
        System.out.println("DATA BARANG");
        System.out.println("KODE            : " + kode);
        System.out.println("NAMA BARANG     : " + namaBarang);
        System.out.println("JENIS BARANG    : " + jenisBarang);
        System.out.println("HARGA BELI      : " + hargaBeli);
        System.out.println("HARGA JUAL      : " + hargaJual);
        System.out.println("STOK            : " + stok);
        System.out.println("PAJAK           : " + hitungPajak());
        System.out.println("===================================");
    }
    
    double hitungPajak() {
        double pajak = hargaJual * 0.05;
        return pajak;
    }
}

