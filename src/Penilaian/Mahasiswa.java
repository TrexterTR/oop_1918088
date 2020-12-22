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
public class Mahasiswa {
    String nim, nama, prodi, angktn;
 void dataNIM(String Nim){
    this.nim = Nim;
 }
 void dataNama(String Nama){
    this.nama = Nama;
 }
 void dataProdi(String Prodi){
    this.prodi = Prodi;
 }
 void dataAngkatan(String Angktn){
    this.angktn = Angktn;
 }

 String cetakNIM(){
    return nim;
 }
 String cetakNama(){
    return nama;
 }
 String cetakProdi(){
    return prodi;
 }
 String cetakAngkatan(){
    return angktn;
 }

 public static void main(String[] args) {
 // membuat object dengan nama “mhs” dari class Mahasiswa
 Mahasiswa mhs = new Mahasiswa();
 //ketika akan menggunakan method dari class Mahasiswa maka harus menyertakan nama object
 mhs.dataNIM("1918088");
 mhs.dataNama("Maldi Ramadhan");
 mhs.dataProdi("Teknik Informatika");
 mhs.dataAngkatan("2019");
 System.out.println("Kartu Tanda Mahasiswa ITN Malang");
 System.out.println("------------------------------------");
 System.out.println("NIM : "+ mhs.cetakNIM());
 System.out.println("Nama : "+ mhs.cetakNama());
 System.out.println("Prodi : "+ mhs.cetakProdi());
 System.out.println("Angkatan : "+ mhs.cetakAngkatan());
 }
}
