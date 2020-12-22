/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab6.Abstract;

/**
 *
 * @author Windows 10
 */
public class LayangLayang extends Bentuk{
    double d1 = 5, d2 = 6,a = 9 ,b = 2,c = 3,d = 7;

    @Override
    double luas() {
    return (0.5* d1*d2);
    }
    @Override
    double keliling() {
    return (a+b+c+d);
    }
}
