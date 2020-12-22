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
public class Prisma_Segitiga extends Segitiga{
    double t, vol;
    double volumePrisma(){
    vol = (Luas()*t);
    return vol;
    }
}

