import java.util.Scanner;
public class Listrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double penggunaanListrik;
        int tarifListrikPerKwh = 1500;

        System.out.print("Masukkan total penggunaan listrik per-kWh: ");
        penggunaanListrik = input.nextDouble();
        System.out.println("apakah penggunaan listrik anda >500 kWh? " + (penggunaanListrik> 500));        
        double totalTagihanListrik = penggunaanListrik * tarifListrikPerKwh;
        System.out.println("Total tagihan listrik anda adalah: " + (int)totalTagihanListrik);
    }
}
