/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1lanjutan;

import java.util.Scanner;

/**
 *
 * @author win 7
 */
public class Latihan3 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a, b, c;
        System.out.println("PROGRAM MENJUMLAHKAN 2 NILAI");
        
        System.out.println("Masukkan nilai a : ");
        a = masukan.nextInt();
            
        System.out.println("Masukkan nilai b : ");
        b = masukan.nextInt();
        
            
        System.out.println("Masukkan nilai c : ");
        c = masukan.nextInt();
        
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
           System.out.println("Jumlah b + c : "+(jumlah(b,c)));
              System.out.println("Jumlah a + c : "+(jumlah(a,c)));
        
        
    }

    private static int jumlah(int a, int b) {
       int hasil = a + b;
        return hasil;
    }
}
