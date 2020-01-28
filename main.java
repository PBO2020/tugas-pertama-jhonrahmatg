/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Praktikan
 */
public class main {
    public static void main(String args[]){
        Kalkulator g = new Kalkulator();
        
        g.setAngka1(10);
        g.setAngka2(5);
        
        int penjumlahan = g.getAngka1() + g.getAngka2();
        int pengurangan = g.getAngka1() - g.getAngka2();
        int perkalian   = g.getAngka1() * g.getAngka2();
        int pembagian   = g.getAngka1() / g.getAngka2();
        
        System.out.println("Hasil Penjumlahan ==>" + g.getAngka1() + "+" + g.getAngka2() + "=" + penjumlahan);
        System.out.println("Hasil Pengurangan ==>"   + g.getAngka1() + "-" + g.getAngka2() + "=" + pengurangan);
        System.out.println("Hasil Perkalian ==>"   + g.getAngka1() + "*" + g.getAngka2() + "=" + perkalian);
        System.out.println("Hasl Pembagian ==>"     + g.getAngka1() + "/" + g.getAngka2() + "=" + pembagian);
        
    }
}
