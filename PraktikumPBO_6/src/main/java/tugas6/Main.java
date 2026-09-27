/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author Msi_Thin
 */
public class Main {
    public static void main(String[] args) {

        Produk buku = new Buku("Pemrograman Java Dasar", 100000);
        Produk elektronik = new Elektronik("Headphone Bluetooth", 500000);
        Produk pakaian = new Pakaian("Kemeja Batik", 150000);

        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanTotal();
    }
}
