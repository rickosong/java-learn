/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class IFProdi {
    public static void main(String[] args) {
        char inisial;
        inisial = 'Z';
        String prodi;
        
        if (inisial == 'B'){
            prodi = "Administrasi Bisnis";
        } else if (inisial == 'A'){
            prodi = "Akuntansi";
        } else if (inisial == 'D'){
            prodi = "Bisnis Digital";
        } else if (inisial == 'M') {
            prodi = "Manajemen informatika";
        } else if (inisial == 'T'){
            prodi = "Teknik Informatika";
        } else if (inisial == 'S') {
            prodi = "Teknik Sipil";
        } else {
            prodi = "tidak dikenali";
        }
        
        System.out.println("inisial prodi anda adalah " + inisial + " = " + prodi);
    }
}
