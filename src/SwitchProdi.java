
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class SwitchProdi {
    public static void main(String[] args){
        String inisial;
        String prodi;
        
        inisial = JOptionPane.showInputDialog
        ("Pilihan : \n"
                        + "1. AB \n"
                        + "2. MI \n"
                        + "3. BD \n"
                        + "4. AK \n"
                        + "5. TI \n"
        
        );
        
        int init = Integer.parseInt(inisial);
        
        switch(init) {
            case 1:
                prodi = "Prodi Adniministrasi Bisnis";
                break;
            case 2:
                prodi = "Prodi Manajamen Informatika";
                break;
            case 3:
                prodi = "Prodi Bisnis Digital";
                break;
            case 4:
                prodi = "Prodi Akuntansi";
                break;
            case 5:
                prodi = "Prodi Teknik Informatika";
                break;
            default:
                prodi = "tidak ada dalam pilihan diatas";
                break;
        }
        JOptionPane.showMessageDialog(null,"Prodi anda adalah " + prodi);
//        JOptionPane.
    }
}
