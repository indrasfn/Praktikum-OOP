/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author Msi_Thin
 */
public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // getter namaPegawai
    public String getNamaPegawai() {
        return namaPegawai;
    }
    // setter namaPegawai
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    // getter gaji
    public int getGaji() {
        return gaji;
    }
    // setter gaji
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    // metod tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji Pegawai: Rp" + gaji);
    }
}
