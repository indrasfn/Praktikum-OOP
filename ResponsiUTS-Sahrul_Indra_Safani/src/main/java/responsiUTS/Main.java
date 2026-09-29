/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author Msi_Thin
 */
public class Main {
    public static void main(String[] args) {
        // memanggil kelas elektronik
        // buat objek mouse
        System.out.println("=== Daftar Produk Elektronik ===");
        Produk mouse = new Elektronik("Mouse", 200000, 2);
        mouse.tampilkanInfo();
        System.out.println("-------------------");
        
        // overloading
        Elektronik keyboard = new Elektronik("Keyboard", 300000, 2);
        keyboard.tampilkanInfo("Keluaran Terbaru");
        System.out.println("-------------------");
        
        // memanggil kelas makanan
        // buat objek bakso
        System.out.println("=== Daftar Produk Makanan ===");
        Produk bakso = new Makanan("Bakso", 15000, "1 Oktober 2026");
        bakso.tampilkanInfo();
        System.out.println();
        
        // memanggil kelas pegawaiTetap
        // buat objek
        System.out.println("=== Data Pegawai Tetap ===");
        PegawaiTetap pegawaitetap1 = new PegawaiTetap("Banu", 3000000, 1000000);
        pegawaitetap1.tampilkanInfo();
        System.out.println("-------------------");
        
        // memanggil kelas PegawaiKontrak
        // buat objek
        System.out.println("=== Data Pegawai Kontrak ===");
        PegawaiKontrak pegawaikontrak1 = new PegawaiKontrak("Santos", 2500000, 4);
        pegawaikontrak1.tampilkanInfo();
    }
}
