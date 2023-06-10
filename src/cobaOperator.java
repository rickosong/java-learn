/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class cobaOperator {
    public static void main(String[] args){
        int a = 10; // var a diis nilai 10
        a += 5; // a = a+5 -> 10+5 -> a = 15
        
        System.out.println(a);
        
        a--; // a= a-1 -> 15-1 -> a = 14 
        System.out.println(a);
        
        a++; // a = a+1 -> 14+1 -> a = 15
        System.out.println(a);
        
        boolean d;
        int e,f;
        e = 25;
        f = 30;
        
        d = e <= f; 
        d = e>f; // 25 > 30 -> false
        d = e==f; // 25 == 30 -> false
        
        System.out.println(d);
        
        boolean n;
        d = e<f;
        n = e==f;
        
        System.out.println("e = " +e);
        System.out.println("f = " +f);
        System.out.println("nilai d = " +d); // 25 < 30 -> true
        System.out.println("nilai n = " +n); // 25 == 30 -> false
        System.out.println(d && n); // nilai d dan n -> false
        System.out.println(d || n); // nilai d atau n -> true
        
        boolean raj = true;
        
//        if(raj == true) {
//            System.out.println("1");
//        } else {
//            System.out.println("0");
//        }
    }
}
