/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Msi_Thin
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Fortuner", 2022, "Putih");
        System.out.println("Mobil 1");
        mobil1.displayInfo();
        mobil1.startEngine();
        System.out.println("");
        
        Mobil mobil2 = new Mobil("Wuling", "Almaz", 2021, "Hitam");
        System.out.println("Mobil 2");
        mobil2.displayInfo();
        mobil2.startEngine();
        System.out.println("");
        
        mobil1.ubahWarna("Silver");
        mobil2.ubahWarna("Merah");
        
        System.out.println("Mobil 1 Ganti Warna");
        mobil1.displayInfo();
        System.out.println("");
        
        System.out.println("Mobil 2 Ganti Warna");
        mobil2.displayInfo();
        System.out.println("");
    }
}
