import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // deklarsi variabel
        float nilai_angka;// snake case
        String nilaiHuruf, keterangan;// camel case
        int nilai_uts, nilai_uas, nilai_tugas;
        Scanner input = new Scanner(System.in);

        // wellcome screen
        System.out.println("====================================");
        System.out.println("   PROGRAM HITUNG NILAI AKHIR");
        System.out.println("====================================");

        // input nilai
        System.out.print("Masukkan nilai UTS    : ");
        nilai_uts = input.nextInt();
        System.out.print("Masukkan nilai UAS    : ");
        nilai_uas = input.nextInt();
        System.out.print("Masukkan nilai Tugas  : ");
        nilai_tugas = input.nextInt();

        // tampilkan input
        // System.out.println("Nilai UTS    : " + nilai_uts);
        // System.out.println("Nilai UAS    : " + nilai_uas);
        // System.out.println("Nilai Tugas  : " + nilai_tugas);

        // proses hitung nilai akhir
        nilai_angka = (float) (0.30 * nilai_uts + 0.50 * nilai_uas + 0.20 * nilai_tugas);
        // System.out.println("Nilai Akhir  : " + nilai_angka);

        // proses hitung nilai huruf
        if (nilai_angka >= 80) {
            nilaiHuruf = "A";
        } else if (nilai_angka >= 77) {
            nilaiHuruf = "B+";
        } else if (nilai_angka >= 60) {
            nilaiHuruf = "B";
        } else if (nilai_angka >= 50) {
            nilaiHuruf = "C";
        } else if (nilai_angka >= 25) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        // System.out.println("Nilai Huruf  : " + nilaiHuruf);

        // tambahkan keterangan
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C")) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }
        // System.out.println("Keterangan  : " + keterangan);

        // tampilkan rekapitulasi nilai
        System.out.println();
        System.out.println("====================================");
        System.out.println("   REKAPITULASI NILAI AKHIR");
        System.out.println("====================================");
        System.out.printf("Nilai UTS    : %d%nNilai UAS    : %d%nNilai Tugas  : %d%nNilai Akhir  : %.2f%nNilai Huruf  : %s%nKeterangan   : %s%n", nilai_uts, nilai_uas, nilai_tugas, nilai_angka, nilaiHuruf, keterangan);
    }
}
