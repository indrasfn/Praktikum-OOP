/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Msi_Thin
 */
public class Main {
    public static void main(String[] args) {
        //Membuat objek pekerja
        Pekerja pekerja1 = new Pekerja("Indra", 20, "Fullstack Developer", 25000000);
        
        // Menampilkan informasi pekerja
        System.out.println("Informasi Pekerja");
        System.out.println(pekerja1.toString());
        
        // Mengubah nama pekerja
        pekerja1.setNama("Indra Safani");
        
        // Menampilkan informasi pekerja setelah nama diubah
        System.out.println("\nInformasi Pekerja Setelah Nama Diubah");
        System.out.println(pekerja1.toString());
        
        // Percobaan akses langsung atribut
        // System.out.println(pekerja1.nama);
        // System.out.println(pekerja1.gaji);
        // System.out.println(pekerja1.usia);
    }
}
