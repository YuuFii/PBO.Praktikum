package PBO.StudyCase.PetHouse;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input Data Karyawan
        System.out.print("Masukkan Jumlah Karyawan: ");
        int jumlahKaryawan = in.nextInt(); in.nextLine();
        ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
        for (int i = 0; i < jumlahKaryawan; i++) {
            dataKaryawan.add(new Admin());
        }
        // Input Data Karyawan End

        // Output Data Karyawan
        System.out.println("========DATA KARYAWAN PET SHOP==========");
        for (int i = 0; i < jumlahKaryawan; i++) {
            dataKaryawan.get(i).cetakInfo();
        }
        // Output Data Karyawan End

        //input pelanggan/hewan
        System.out.print("Masukkan Jumlah Hewan yang Ingin dirawat : ");
        int jumlahHewan = in.nextInt(); in.nextLine();
        for (int i = 0; i < jumlahHewan; i++) {

        }
//        Hewan[] dataPelanggan  = new Hewan[jumlahHewan];
//        for (int i = 0; i < dataPelanggan.length; i++) {
//            dataPelanggan[i] = new Hewan();
//            if (dataPelanggan[i].getNamaHewan().equalsIgnoreCase("kelinci")){
//                dataPelanggan[i] = new Hewan();
//            }
//        }
        //output data pelanggan/hewan
        System.out.println("\n\n\n");
//        for (int i = 0; i < dataPelanggan.length; i++) {
//            dataPelanggan[i].printDataHewan();
//        }
    }
}
