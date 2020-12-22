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
public class Mobil implements Kendaraan {

    @Override
    public String nama() {
        return "Mesin";
    }

    @Override
    public int jumlah_roda() {
        return 4;
    }

    @Override
    public String lintasan() {
        return "Jalan Raya";
    }
    
}
