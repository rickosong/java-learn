/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public void setPanjang(int nilaiBaru){
        panjang = nilaiBaru;
    }
    public void setLebar(int nilaiBaru){
        lebar = nilaiBaru;
    }
    public int hitungLuas(){
        return panjang * lebar;
    }
    public int hitungKeliling(){
        return 2 * (panjang + lebar);
    }
}
