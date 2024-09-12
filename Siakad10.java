import java.util.Scanner;

public class Siakad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        // char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;        

        System.out.print("masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("masukkan nim : ");
        nim = sc.nextLine();
        System.out.print("masukkan kelas : ");
        kelas = sc.nextLine();
        // kelas = sc.nextLine().charAt(0);
        System.out.print("masukkan nomor absen : ");
        absen = sc.nextByte();
        System.out.print("masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("masukkan nilai ujian : ");
        nilaiUjian = sc.nextDouble();
    
        // nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        double uts = nilaiUjian*0.3;
        double uas = nilaiUjian*0.35;
        nilaiAkhir = ((nilaiKuis*0.2) + (nilaiTugas*0.15) + uts + uas);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("nilai akhir : " +nilaiAkhir);
    }
}
