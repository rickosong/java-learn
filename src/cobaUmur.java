/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class cobaUmur {
    public static void main(String[] args){
        int umur = 60;
        String kategori;
        
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
