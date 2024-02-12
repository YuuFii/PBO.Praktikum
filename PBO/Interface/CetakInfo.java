package PBO.Interface;

public class CetakInfo implements Interface3{
    @Override
    public String cetakStr1(String x) {
        return "Cetak String 1 : " + x;
    }

    @Override
    public String cetakStr2(String x) {
        return "Cetak String 2 : " + x;
    }

    @Override
    public String cetakInt1(int x) {
        return "Cetak Integer 1 : " + x;
    }

    public String cetakInt2(int x) {
        return "Cetak Integer 2 : " + x;
    }

    public void cetak(){
        System.out.println("Semua sudah tercetak.");
    }
}
