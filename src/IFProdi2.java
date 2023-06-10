/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class IFProdi2 {
    public static void main(String[] args) {
        String inisial;
        String prodi;
        
        inisial = JOptionPane.showInputDialog("Masukkan inisial prodi anda");
        
        if ("B".equals(inisial)){
            prodi = "Administrasi Bisnis";
        } else if ("A".equals(inisial)){
            prodi = "Akuntansi";
        } else if ("D".equals(inisial)){
            prodi = "Bisnis Digital";
        } else if ("M".equals(inisial)) {
            prodi = "Manajemen informatika";
        } else if ("T".equals(inisial)){
            prodi = "Teknik Informatika";
        } else if ("S".equals(inisial)) {
            prodi = "Teknik Sipil";
        } else {
            prodi = "tidak dikenali";
        }
        
        System.out.println("inisial prodi anda adalah " + inisial + " = " + prodi);
    }
    
//    Note : penulisan kode if else seperti ini dilakukan jika kamu ingin 
}
