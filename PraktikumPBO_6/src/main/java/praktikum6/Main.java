/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Msi_Thin
 */
public class Main {
    public static void main(String[] args) {
        // Override Kucing
        System.out.println("Override Kucing");
        Hewan hewan = new Kucing();
        hewan.bersuara();   // Output: Meow
        System.out.println();
        
        // Overload Kucing
        System.out.println("Overload Kucing");
        Hewan kucing = new Kucing();
        kucing.bersuara();  // Output: Hewan bersuara
        kucing.makan("ikan");   // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2);    // Memanggil metode makan() yang overloaded
        System.out.println();
        
        // Override Anjing
        System.out.println("Override Anjing");
        Anjing anjing = new Anjing();
        anjing.bersuara();  // Output: Woof
        System.out.println();
        // Overload Anjing
        System.out.println("Overload Anjing");
        anjing.makan("daging", 3);  // Memangginl metode makan() yang overloaded pada kelas Hewan
    }
}
