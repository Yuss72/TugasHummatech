/*
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 4 - September - 2024
 * Kode program : Percabangan if dan else
 */

package Percabangan;

import java.util.Scanner;

public class Tugas2V {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.println("Inputkan total belanja anda: ");
        belanja = input.nextInt();

        if (belanja >= 500000) {
            System.out.println("Selamat Anda mendapatkan hadiah gantungan kunci");
        } else {
            System.out.println("Belanja anda kurang dari Rp. 500.000. Silahkan tambah lagi belanjanya senilai Rp. " + (500000 - belanja) + (". Agar mendapatkan bonus gantungan kunci"));
        }
    }
}
