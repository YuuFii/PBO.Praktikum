package PBO.StudyCase.PetHouse;

import java.util.ArrayList;
import java.util.Collections;

public class DokterHewan extends Karyawan{
    private ArrayList<JenisPerawatan> jenisPerawatan;

    public DokterHewan(JenisPerawatan[] jenisPerawatan){
        this.jenisPerawatan = new ArrayList <JenisPerawatan> ();
        Collections.addAll(this.jenisPerawatan, jenisPerawatan);
    }

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
    public void setJenisPerawatan(JenisPerawatan[] jenisPerawatan){
        Collections.addAll(this.jenisPerawatan, jenisPerawatan);
    }
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Jenis Perawatan : ");
        for (JenisPerawatan perawatan : jenisPerawatan) {
            System.out.println(" - " + perawatan);
        }
    }
}

