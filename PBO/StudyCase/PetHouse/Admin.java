package PBO.StudyCase.PetHouse;

import java.util.Scanner;
import java.util.ArrayList;

public class Admin extends Karyawan{
    ArrayList<Hewan> daftarHewan; // List hewan yang ingin dirawat
    Scanner in = new Scanner(System.in);

    public Admin(){ // Constructor untuk input data karyawan
        System.out.print("Masukkan Kategori Karyawan: ");
        setKategoriKaryawan(in.nextLine());
        System.out.print("Masukkan Nama: ");
        setNama(in.nextLine());
        System.out.print("Masukkan No Telepon: ");
        setNomorTelepon(in.nextLine());
        System.out.print("Masukkan Jenis Kelamin: ");
        setJenisKelamin(in.nextLine());
        System.out.println("========================================");

        daftarHewan = new ArrayList<>();
    }

    // Setter dan Getter
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
    @Override
    public void setNomorTelepon(String noTelepon) {
        super.setNomorTelepon(noTelepon);
    }
    @Override
    public void setKategoriKaryawan(String kategoriKaryawan) {
        super.setKategoriKaryawan(kategoriKaryawan);
    }
    @Override
    public void setJenisKelamin(String jenisKelamin) {
        super.setJenisKelamin(jenisKelamin);
    }
    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }
    // Setter dan Getter End

    public void inputDataHewan(){ // Admin input data hewan yang ingin dirawat
        System.out.print("Masukkan nama hewan : ");
        String namaHewan = in.nextLine();
        System.out.print("Masukkan jenis hewan : ");
        String jenisHewan = in.nextLine();
        System.out.print("Masukkan tahun kelahiran hewan : ");
        int tahunKelahiran = in.nextInt();

        daftarHewan.add(new Hewan(namaHewan, jenisHewan, tahunKelahiran));
    }

    public void cetakDataHewan(){
        System.out.println("Daftar hewan yang telah didaftarkan:");
        for (Hewan hewan : daftarHewan) {
            int i = 0;
            System.out.println(i+1 + ". Jenis: " + hewan.getJenisHewan() +"\n\tNama: " + hewan.getNamaHewan() +  "\n\tUsia: " + hewan.getUsiaHewan() + "\n\tID Member: " + hewan.getIDMember());
        }
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
    }
}
