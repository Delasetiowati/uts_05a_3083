/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author ASUS
 */
public class Employee {
    protected String Nama;
    protected String NIP;
    protected float GajiPokok;
    
    public void Tampil(){
        System.out.println("Nama: " + Nama);
        System.out.println("NIP: " + NIP);
        System.out.println("Gaji Pokok: " + GajiPokok);
    }
}
