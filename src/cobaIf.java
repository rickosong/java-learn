/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class cobaIf {
    public static void main (String[] args){
        int tugas, praktek, uas;
        double nilai;
        tugas = 40;
        praktek = 40;
        uas = 34;
        
        nilai = (tugas*0.2)+(praktek*0.5)+(uas*0.3);
        
        if (nilai < 50){
            System.out.println("Status =  Perbaikan");
        } else {
            System.out.println("Status = Damn boy congrats");
        }
        
        System.out.println("Nilai anda adalah = " +nilai);
        
        String huruf;
        if (nilai >= 80){
            huruf = "Nilai anda adalah A";
        } else if (nilai >= 70) {
            huruf = "Nilai anda adalah B";
        } else if (nilai >=55){
            huruf = "Nilai anda adalah C";
        } else if (nilai >= 40){
            huruf = "Nilai anda adalah D";
        } else {
            huruf = "Nilai anda adalah E";
        }
        
        System.out.println(huruf);
    }
}
