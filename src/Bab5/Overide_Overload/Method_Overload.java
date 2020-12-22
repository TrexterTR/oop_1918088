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
public class Method_Overload {
    
    int Luas(int p){
    return p;
    }

    //contoh overloading
    int Luas(double p){
    return (int) (p); //mengubah double ke integer
    }

    double jumlah (double n, int m){
    return m+n;
    }

    //method untuk overriding
    int volume(){
    int p=2,l=3,t=4;
    return p*l*t;
    }
}
