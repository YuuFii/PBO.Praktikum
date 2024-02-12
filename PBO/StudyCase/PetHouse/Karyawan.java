package PBO.StudyCase.PetHouse;

public class Karyawan implements CetakInfo{
    private String nama;
    private String nomorTelepon;
    private String jenisKelamin;
    private String kategoriKaryawan;
    private String alamat;

    public Karyawan(){

    }

    // Setter dan Getter
    void setNama(String nama){
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setKategoriKaryawan(String kategoriKaryawan) {
        this.kategoriKaryawan = kategoriKaryawan;
    }
    public String getKategoriKaryawan() {
        return kategoriKaryawan;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setNomorTelepon(String noTelepon) {
        this.nomorTelepon = noTelepon;
    }
    public String getNomorTelepon() {
        return nomorTelepon;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }
    // Setter dan Getter End

    public void cetakInfo(){ // Method cetakInfo karyawan
        System.out.println("Nama: " + getNama());
        System.out.println("Nomor Telepon: " + getNomorTelepon());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Kategori Karyawan: " + getKategoriKaryawan());
    }
}