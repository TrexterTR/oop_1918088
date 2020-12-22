/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8.Interfaces;

/**
 *
 * @author Maldi Ramadhan
 */
public class Main {
    public static void main(String[] args) {
    LaskarPelangi book = new LaskarPelangi();
    System.out.print("Judul : ");book.judul();
    System.out.print("Tahun Rilis : ");book.tahun();
    System.out.print("Penerbit : ");book.nama_penerbit();
    System.out.print("Kota Penerbit : ");book.kota();
    System.out.println("Jmlh Hal. : "+Integer.toString(Buku.halaman)+" lembar");
    System.out.println("Negara : "+Penerbit.negara);
    }
}

