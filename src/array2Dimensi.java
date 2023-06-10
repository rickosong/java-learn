/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class array2Dimensi {
    public static void main(String[] args) {
        String[][] data = new String[11][4];
        for (int i=1;i<=3;i++) {
            System.out.println("Masukkan data ke- " + i);
            for(int j=1; j<=3; j++) {
                if (j==1){
                    System.out.print("Masukkan NIM : ");
                    data[i][j] = new Scanner (System.in).next();
                }
                else if (j==2){
                    System.out.print("Masukkan Nama : ");
                    data[i][j] = new Scanner(System.in).next();
                }
                else if(j==3){
                    System.out.print("Masukkan Jurusan : ");
                    data[i][j] = new Scanner (System.in).next();
                }
            }
        }
        
        for (int i=1;i<=3;i++) {
            for (int j=1;j<=3;j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
