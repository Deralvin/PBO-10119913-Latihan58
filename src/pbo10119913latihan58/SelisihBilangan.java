/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan58;

/**
 * Nama :Muhammad Alvin Rizqi Ramdahn
 * Kelas : IF10K
 * NIM : 10119913
 * @author Lenovo
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih(){
        int hitungSelisih = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - " + getY() + " = " + hitungSelisih);
    }
}
