/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author Msi_Thin
 */

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public void tampilkanTotal() {
        double total = 0;

        for (Produk produk : produkList) {
            double diskon = produk.hitungDiskon();
            double hargaAkhir = produk.harga - diskon;

            System.out.println("Produk       : " + produk.nama);
            System.out.println("Harga Awal   : Rp" + produk.harga);
            System.out.println("Diskon       : Rp" + diskon);
            System.out.println("Harga Akhir  : Rp" + hargaAkhir);
            System.out.println("====================================");

            total += hargaAkhir;
        }

        System.out.println("Total Harga Setelah Diskon: Rp" + total);
    }
}
