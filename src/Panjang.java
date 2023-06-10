/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;

//class PersegiPanjang{
//    public int panjang;
//    public int lebar;
//    
//    public void setPanjang(int nilaiBaru){
//        panjang = nilaiBaru;
//    }
//    public void setLebar(int nilaiBaru){
//        lebar = nilaiBaru;
//    }
//    public int hitungLuas(){
//        return panjang * lebar;
//    }
//    public int hitungKeliling(){
//        return 2 * (panjang + lebar);
//    }
//}

public class Panjang {
    public static void main(String[] args){
        String panjangPersegi = JOptionPane.showInputDialog("masukkan panjang persegi");
        String lebarPersegi = JOptionPane.showInputDialog("Masukkan lebar persegi");
        
        int nilaiPanjang = Integer.parseInt(panjangPersegi);
        int nilaiLebar = Integer.parseInt(lebarPersegi);
        
        PersegiPanjang PP = new PersegiPanjang();
        PP.setPanjang(nilaiPanjang);
        PP.setLebar(nilaiLebar);
        
        JOptionPane.showMessageDialog(null, "luas persegi panjang adalah " + PP.hitungLuas() + " dan kelilingnya adalah " + PP.hitungKeliling());
        System.out.println("Luasnya adalah " + PP.hitungLuas());
        System.out.println("Keliling adalah " + PP.hitungKeliling());
    }
}
