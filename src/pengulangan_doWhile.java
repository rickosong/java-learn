
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class pengulangan_doWhile {
    public static void main(String[] args){
        String nilai = JOptionPane.showInputDialog("Berapa kali pengulangan?");
        int ubahNilaiAngka = Integer.parseInt(nilai);
        
        int i = 1;
        do{
            System.out.print(i + " ");
            i++;
        } while(i <= ubahNilaiAngka);
    }
}
