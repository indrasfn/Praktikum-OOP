/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author Msi_Thin
 */
public class PegawaiKontrak extends Pegawai {
    int lamaKontrak;
    
    // constructor PegawaiKontrak
    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    // polimorfisme PegawaiKontrak
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " Bulan");
    }
}
