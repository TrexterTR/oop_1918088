/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab7.Polimorfisme_Exception;

/**
 *
 * @author Windows 10
 */
public class Kubus extends Bentuk{
    int s = 8;

    @Override
    double volume() {
    return(s*s*s);
    }
    @Override
    double luasPermukaan() {
    return (6*(s*s));
    }
}

