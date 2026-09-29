/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author Msi_Thin
 */
public class Produk {
    private String namaProduk;
    private int harga;
    
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // getter namaProduk
    public String getNamaProduk() {
        return namaProduk;
    }
    // setter namaProduk
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    // getter harga
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    // metod tamnpilkanInfo()
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Produk: Rp" + harga);
    }
}
