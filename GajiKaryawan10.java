import java.util.Scanner;
public class GajiKaryawan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahJamKerja;
        double upahPerJam, bonus = 0.1, pajak = 0.05, totalGaji, totalGajiBonus, totalGajiPajak, totalBonus, totalPajak;

        System.out.print("masukkan jumlah jam kerja: ");
        jumlahJamKerja = input.nextInt();
        System.out.print("masukkan upah kerja per jam nya: ");
        upahPerJam = input.nextDouble();

        totalGaji = jumlahJamKerja * upahPerJam;
        System.out.println("Total gaji anda sebelum mendapat bonus & sebelum dipotong pajak adalah: " + totalGaji);

        totalBonus = totalGaji * bonus;
        totalGajiBonus = totalGaji + totalBonus;
        System.out.println("Total gaji anda setelah mendapat bonus & sebelum dipotong pajak adalah: " + totalGajiBonus);

        totalPajak = totalGajiBonus * pajak;
        totalGajiPajak = totalGajiBonus - totalPajak;
        System.out.println("Total gaji anda setelah mendapat bonus & setelah dipotong pajak adalah: " + totalGajiPajak);
    }
}
