package PBO.StudyCase.PetHouse;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Random;

public class Hewan {
    public String jenisHewan;
    public String namaHewan;
    public int tahunKelahiran;
    public int usiaHewan;
    public int IDMember;
    String answer;
    float tagihan;

    Scanner in = new Scanner(System.in);
    Groomer bill = new Groomer(); // Instansiasi Objek Groomer
    DokterHewan Tagihan = new DokterHewan(new JenisPerawatan[]{JenisPerawatan.SUNTIK_VAKSIN, JenisPerawatan.SUNTIK_ANTI_KUTU, JenisPerawatan.SUNTIK_SCABIES, JenisPerawatan.SUNTIK_ANTI_JAMUR_KULIT, JenisPerawatan.PEMERIKSAAN_RAWAT_INAP, JenisPerawatan.PEMERIKSAAN_RAWAT_JALAN}); // Instansiasi Objek Dokter Hewan

    public Hewan(String namaHewan, String jenisHewan, int tahunKelahiran) {
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.tahunKelahiran = tahunKelahiran;
    }

    // Random Nomor Unik untuk ID Member
    public int getIDMember(){
        int minimum = 100000;
        int maximum = 999999;
        int range = maximum - minimum + 1;
        Random random = new Random ();
        this.IDMember = random.nextInt(range) + minimum;
        return IDMember;
    }
    // Random Nomor Unik untuk ID Member End

    // Setter dan Getter
    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }
    public String getNamaHewan(){
        return namaHewan;
    }
    public int getUsiaHewan(){
        LocalDateTime sekarang = LocalDateTime.now();
        int tahun = sekarang.getYear();
        usiaHewan = tahun - tahunKelahiran;
        return usiaHewan;
    }
    public String getJenisHewan(){
        return jenisHewan;
    }
    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }
    public void setTahunKelahiran(int tahunKelahiran) {
        this.tahunKelahiran = tahunKelahiran;
    }
    // Setter dan Getter End

    // Output Data Hewan
    public void printDataHewan(){
        System.out.println("\n");
        System.out.println("================PET-SHOP================");
        System.out.printf( "%-17s : %s\n", "ID Member", getIDMember());
        System.out.printf("%-17s : %s\n", "Jenis Hewan", getJenisHewan());
        System.out.printf( "%-17s : %s\n", "Nama Hewan", getNamaHewan());
        System.out.printf("%-17s : %s\n", "Usia Hewan", getUsiaHewan());
        System.out.println("========================================");
        System.out.printf("%-17s : Rp %s\n", "Tagihan Grooming", bill.getTagihanPerawatan());
        System.out.println("========================================");
        System.out.printf("%-17s : Rp %s\n", "Total Tagihan", tagihan);
        System.out.println("========================================");
        System.out.println("              TERIMA KASIH              ");
        System.out.println("      TELAH MENGGUNAKAN JASA KAMI       ");
        System.out.println("========================================");
        System.out.println();
    }
}