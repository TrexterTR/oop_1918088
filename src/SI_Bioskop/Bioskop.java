/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SI_Bioskop;

/**
 *
 * @author Windows 10
 */
public abstract class Bioskop {
    String nama,film, tanggal;
    int harga,total,tiket;
    
    public int dataFilm(){
        return tiket * harga;
    }
    public abstract int harga(); 
}