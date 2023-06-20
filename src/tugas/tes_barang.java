/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class tes_barang {
    public static void main(String[] args){
//        instansiasi obejct barang
        Barang Barang1 = new Barang();
        Barang Barang2 = new Barang();
        Barang Barang3 = new Barang();
        
//        isi data barang
        Barang1.kode = "BE01";
        Barang1.namaBarang = "Motherboard Asus ROG";
        Barang1.jenisBarang = "Elektronik";
        Barang1.hargaBeli = 500000;
        Barang1.hargaJual = 1000000;
        Barang1.stok = 8;
        
        Barang2.kode = "BPRT02";
        Barang2.namaBarang = "Pel Lantai";
        Barang2.jenisBarang = "Peralatan Rumah Tangga";
        Barang2.hargaBeli = 10000;
        Barang2.hargaJual = 25000;
        Barang2.stok = 150;
        
        Barang3.kode = "BE03";
        Barang3.namaBarang = "Power Supply Unit";
        Barang3.jenisBarang = "Elektronik";
        Barang3.hargaBeli = 300000;
        Barang3.hargaJual = 650000;
        Barang3.stok = 20;
        
//        cetak data barang
        Barang1.tampilBarang();
        Barang2.tampilBarang();
        Barang3.tampilBarang();
    }
}
