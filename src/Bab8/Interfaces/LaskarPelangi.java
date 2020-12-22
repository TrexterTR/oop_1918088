/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab8.Interfaces;

/**
 *
 * @author Windows 10
 */
public class LaskarPelangi implements Buku, Penerbit{
    @Override
    public void judul() {
    System.out.println("Laskar Pelangi");
    }
    @Override
    public void tahun() {
    System.out.println("2005");
    }
    @Override
    public void pengarang() {
    System.out.println("Andrea Hirata");
    }
    @Override
    public void nama_penerbit() {
    System.out.println("Bentang Pustaka");
    }
    @Override
    public void kota() {
    System.out.println("Yogyakarta");
    }
}

