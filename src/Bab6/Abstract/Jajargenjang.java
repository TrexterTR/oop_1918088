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
public class Jajargenjang extends Bentuk{
    double a = 8,t = 3,b = 9;

    @Override
    double luas() {
    return (a*t);
    }
    @Override
    double keliling() {
    return (2*(a+b));
    }
}
