/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab4.Inheritance;

/**
 *
 * @author Windows 10
 */
public class Main {
    public static void main(String[] args) {
 Hewan hewan = new Hewan(); // memanggil constructor
 System.out.println("Apakah hewan adalah Objek -> " + (hewan instanceof Object));
 System.out.println("Apakah hewan adalah Hewan -> " + (hewan instanceof Hewan));
 System.out.println("Apakah hewan adalah Kucing -> " + (hewan instanceof Kucing));
 System.out.println("------------------------");
 Kucing kucing = new Kucing(); // memanggil constructor
 System.out.println("Apakah hewan adalah Objek -> " + (kucing instanceof Object));
 System.out.println("Apakah kucing adalah Hewan -> " + (kucing instanceof Hewan));
 System.out.println("Apakah kucing adalah Kucing -> " + (kucing instanceof Kucing));
 } 
}

