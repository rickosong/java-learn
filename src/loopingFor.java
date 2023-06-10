/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class loopingFor {
    public static void main(String[] args){
        String nilai = JOptionPane.showInputDialog("Berapa kali pengulangan?");
        
        int ubahNilaiAngka = Integer.parseInt(nilai);
        
        for (int i = 1; i <= ubahNilaiAngka; i++){
            System.out.println("Saya ulang program ini " + i + " kali");
//              System.out.print(i + " ");
        }
    }
}
