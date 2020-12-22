/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab5.Overide_Overload;

/**
 *
 * @author Maldi Ramadhan
 */
public class MainOverload_Override {
    public static void main(String[] args) {
    Method_Override n = new Method_Override();
    System.out.println("Luas Parameter Double : "+n.Luas(4.6));
    System.out.println("Luas Parameter Integer :"+n.Luas(6));
    System.out.println("Jumlah :"+ n.jumlah(6.5, 9));

    //override
    System.out.println("Volume Kubus : "+ n.volume());
    }
}
