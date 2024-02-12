package PBO.TryWithResource;
import java.io.FileOutputStream;

public class TryWithResource {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/victus joe/OneDrive/Documents/FILKOM.txt")){
            String msg = "Selamat Datang di Filkom! ";
            byte byteArray[] = msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("Pesan sudah ditulis dengan sukses!");
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}
