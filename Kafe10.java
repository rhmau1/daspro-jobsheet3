import java.util.Scanner;;

public class Kafe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga, nominalBayar;
        float diskon =  10 / 100f;

        System.out.print("masukkan keanggotaan (true/false) : "); 
        keanggotaan = input.nextBoolean();
        System.out.print("masukkan jumlah pembelian kopi : ");
        jmlKopi = input.nextInt();
        System.out.print("masukkan jumlah pembelian teh : ");
        jmlTeh = input.nextInt();
        System.out.print("masukkan jumlah pembelian roti : ");
        jmlRoti = input.nextInt();

        totalHarga = ((jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti));
        System.out.println("total harga double : " +totalHarga);
        byte totalByte = (byte)totalHarga;
        System.out.println("total harga byte : " + totalByte);
        nominalBayar = totalHarga - (diskon * totalHarga);
        int nominalInt = (int)nominalBayar;
        System.out.println("keanggotaan pelanggan : " + keanggotaan);
        System.out.println("item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
        System.out.println("nominal bayar Rp." + nominalBayar);
        System.out.println("nominal int : " + nominalInt);
    }
}
