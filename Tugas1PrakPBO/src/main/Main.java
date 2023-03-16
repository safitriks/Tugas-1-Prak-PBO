/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
/**
 * SafitriKurniaSuardini
 * 123210095
 * Plug D
 * @author ASUS
 */
// import pakai * artinya import all
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil;
        double p, l, j, t;
        boolean ulang = true;
        
        while(ulang){
            System.out.println("================");
            System.out.println("   Menu Utama   ");
            System.out.println("================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("99. Exit");
            System.out.println("Pilih : ");
            pil = sc.nextInt();
            
            switch(pil){
                case 1:
                    System.out.println("Ini Balok");
                    System.out.println("Masukkan nilai");
                    
                    PersegiPanjang pp = new PersegiPanjang(0,0);
                    Balok bk = new Balok(0,0,0);
                
                    System.out.print("Panjang   : ");
                    p = sc.nextInt();
                    pp.setPanjang(p);
                    bk.setPanjang(p);
                    
                    System.out.print("Lebar     : ");
                    l = sc.nextInt();
                    pp.setLebar(l);
                    bk.setLebar(l);
       
                    System.out.print("Tinggi    : ");
                    t = sc.nextInt();
                    bk.setTinggi(t);
                    
                    System.out.println("Keliling        = " + pp.keliling());
                    System.out.println("Luas            = " + pp.luas());
                    System.out.println("Luas Permukaan  = " + bk.luas_per());
                    System.out.println("Volume          = " + bk.volume());
                    break;
                    
                case 2:
                    System.out.println("Ini Tabung");
                    System.out.println("Masukkan nilai");
                    
                    Lingkaran li = new Lingkaran(0);
                    Tabung tb = new Tabung(0,0);
                    System.out.print("Jari-jari : ");
                    j = sc.nextInt();
                    li.setJari(j);
                    tb.setJari(j);
                    
                    System.out.print("Tinggi    : ");
                    t = sc.nextInt();
                    tb.setTinggi(t);
                    
                    System.out.println("Keliling        = " + li.keliling());
                    System.out.println("Luas            = " + li.luas());
                    System.out.println("Luas Permukaan  = " + tb.luas_per());
                    System.out.println("Volume          = " + tb.volume());
                    break;
                    
                case 99:
                    System.out.println("Terima Kasih, Program Berakhir.");
                    ulang = false;
                    break;
                    
                default:
                    System.out.println("Maaf, menu tidak tersedia. Mohon masukkan menu dengan benar!");
                    break;
            }
        }
    }
    
}