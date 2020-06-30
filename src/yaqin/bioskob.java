/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaqin;

import java.util.Scanner;

/**
 *
 * 
 */
public class bioskob {
    public static void main(String[] args) {
               //Java Library Scanner
       Scanner scan = new Scanner(System.in);
       
       String nama;
       int no_kursi;
       for (String i = "Y"; i.equals("Y")||i.equals("y"); )
       {
       //Header Bioskop
       System.out.println("======================================");
       System.out.println("||         SELAMAT DATANG DI        ||");
       System.out.println("||           BIOSKOP YAQIN          ||");
       System.out.println("======================================");
       //Masuukan Data Pembeli
       System.out.print("Masukkan Nama Pemesan : ");
       nama = scan.nextLine();
       System.out.print("Masukkan Nomor Kursi : ");
       no_kursi = scan.nextInt();

      //Menu Filem Bioskob
        System.out.println("======================================");
        System.out.println("|            PILIHAN FILEM           |");
        System.out.println("======================================");
        System.out.println("| NAMA  FILEM          | HARGA       |");
        System.out.println("|1 Warkop  DKI .R     |   Rp 40.000  |");
        System.out.println("|2 Dilan 1991         |   Rp 40.000  |");
        System.out.println("|3 Fast and Furious 9 |   Rp 40.000  |");
        System.out.println("|4 Dua Garis Biru     |   Rp 35.000  |");
        System.out.println("|5 Yo wis ben         |   Rp 35.000  |");
        System.out.println("======================================");
        
        //Pembayaran & kembalian
        int bayar, kembalian;
        //Harga awal
        int harga  = 0;
        //Harga Per-Item Menu Filem
        int f1, f2, f3, f4, f5; 
        f1 = 40000; //Warkop  DKI .R
        f2 = 40000; //Dilan 1991
        f3 = 40000; //Fast and Furious 9
        f4 = 35000; //Dua Garis Biru
        f5 = 35000; //Yo wis ben
        
        String filem = null;
        
        //Variable Menu
        int mnNomor = 0, mnJumlah = 0;
        
        
        System.out.println("_____________________________________");
        System.out.print("Pilih Nomor Filem yang akan di pesan : ");
        mnNomor = scan.nextInt();
        System.out.print("Masukkan Jumlah Pesanan : ");
        mnJumlah = scan.nextInt();
        System.out.println("_____________________________________");
        
            switch (mnNomor) {
                case 1:
                    filem = " Warkop  DKI .R";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + filem);
                    harga = harga + f1 * mnJumlah;
                    break;
                case 2:
                    filem = " Dilan 1991";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + filem);
                    harga = harga + f2 * mnJumlah;
                    break;
                case 3:
                    filem = " Fast and Furious 9";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + filem);
                    harga = harga + f3 * mnJumlah;
                    break;
                case 4:
                    filem = " Dua Garis Biru";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + filem);
                    harga = harga + f4 * mnJumlah;
                    break;
                case 5:
                    filem = " Yo wis ben";
                    System.out.println("Pilihan anda nomor " +mnNomor + " adalah" + filem);
                    harga = harga + f5 * mnJumlah;
                    break;
                default:
                    System.out.println("Nomor Filem yang anda pilih tidak ada di daftar.");
                    break;
            }
            
            System.out.println("Total = Rp."+harga);
            System.out.print("Bayar : ");
            bayar = scan.nextInt();
            kembalian = bayar-harga;
            System.out.println("======================================");
            System.out.println("||         SELAMAT DATANG DI        ||");
            System.out.println("||           BIOSKOP YAQIN          ||");
            System.out.println("======================================");
            System.out.println("Nama Pemesan : " + nama);
            System.out.println("Nomor Kursi  : " + no_kursi);
            System.out.println("--------------------------------------");
            System.out.println("Tiket yang di pesan :                 ");
            System.out.println(" " + filem +"   " + "X"+mnJumlah +"   " + "Rp"+ harga);
            System.out.println("--------------------------------------");
            System.out.println("Total                " + "Rp" + harga);
            System.out.println("Jumlah Uang          " + "Rp" + bayar);
            System.out.println("Kembalian            " + "Rp" + kembalian);
            System.out.println("======================================");
            System.out.println("||            Terima Kasih          ||");
            System.out.println("======================================");

            
            System.out.print("Apakah anda ingin Memesan Lagi? [Y/T] : ");
            i = scan.next();
    }
    }    
}
