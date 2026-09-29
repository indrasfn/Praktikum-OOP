/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author Msi_Thin
 */

// kelas turunan elektronik
public class Elektronik extends Produk {
    int garansi;
    
    // constructor Elektronik
    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    // polimorfisme override Elektronik
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " Tahun");
    }
    
    // overloading
    public void tampilkanInfo(String keterangan) {
        tampilkanInfo();
        System.out.println("Keterangan: " + keterangan);
    }
}
