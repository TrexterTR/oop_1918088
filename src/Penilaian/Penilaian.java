/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;

/**
 *
 * @author Windows 10
 */
public abstract class Penilaian {
    String NIM, kode_mk;
    int nilaiTugas, nilaiPrak;

    private double nilaiAkhirPrak(){
        return ((nilaiTugas*0.6)+(nilaiPrak*0.4));
    }
    double tampilNA(){
        return nilaiAkhirPrak();
    }
    abstract double nilaiAkhir();
}

