/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Msi_Thin
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        kucing.berlari();
        
        Hewan anjing = new Hewan("Bob", 4);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
