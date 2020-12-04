package uts.if1.pkg10119016.adityailhams.no2;

import java.util.Scanner;

/**
 *
 * @author aditi
 * NAMA              :Aditya Ilham Subagja
 * Kelas             :IF1
 * NIM               :10119016
 * Deskripsi Program :program ini berisi program tabungan
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukkan Saldo Awal\t: ");
        Tabungan tabungan = new Tabungan(scan.nextInt());
        System.out.print("Jumlah Uang Yang Diambil: ");
        int sisaSaldo = tabungan.ambilTabungan(scan.nextInt());
        System.out.println("Saldo Anda Sekarang\t: " +sisaSaldo);
    }
    
}
