/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

// Nama : Mohammad Ricko Aprilianto
// Kelas : 2A Bisnis Digital


public class Umur {
    public static void main(String[] args){
        int umur = 1;
        String kategori;
        
//        if (umur < 5) {
//            kategori = "balita";
//        } else if (umur >= 5 && umur < 12) {
//            kategori = "Anak-Anak";
//        } else if (umur >= 12 && umur < 18) {
//            kategori = "Remaja";
//        } else if (umur >= 18 && umur < 40) {
//            kategori = "Dewasa";
//        } else if (umur >= 40 && umur < 60) {
//            kategori = "Parobaya";
//        } else {
//            kategori = "Lanjut usia";
//        }

            if (umur < 5) {
                kategori = "Balita";
            } else if (umur < 12){
                kategori = "Anak-anak";
            } else if (umur < 18){
                kategori = "Remaja";
            } else if (umur < 40) {
                kategori = "Dewasa";
            } else if (umur < 60){
                kategori = "parobaya";
            } else {
                kategori = "lanjut usia";
            }
        
        System.out.println(kategori);
    }
}
