import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Nilai argumen ke-" + i + " : " + args[i]);
        }

        // deklarsi variabel
        float nilai_angka;// snake case
        String nilaiHuruf, keterangan;// camel case
        String nilaiHurufRef[] = {"A", "B+", "B", "C", "D", "E"}; // array
        int nilai_uts, nilai_uas, nilai_tugas;
        int nilai_mhs[] = new int[3]; // array
        Scanner input = new Scanner(System.in);

        // wellcome screen
        System.out.println("====================================");
        System.out.println("   PROGRAM HITUNG NILAI AKHIR");
        System.out.println("====================================");

        // input nilai
        System.out.print("Masukkan nilai UTS    : ");
        nilai_mhs[0] = input.nextInt();
        System.out.print("Masukkan nilai UAS    : ");
        nilai_mhs[1] = input.nextInt();
        System.out.print("Masukkan nilai Tugas  : ");
        nilai_mhs[2] = input.nextInt();



        // tampilkan input
        // System.out.println("Nilai UTS    : " + nilai_mhs[0]);
        // System.out.println("Nilai UAS    : " + nilai_mhs[1]);
        // System.out.println("Nilai Tugas  : " + nilai_mhs[2]);]

        // for(int nilai : nilai_mhs){
        //     System.out.println("Nilai : " + nilai);
        // }

        // for(int i = 0; i < nilai_mhs.length; i++){
        //     System.out.println("Nilai : " + nilai_mhs[i]);
        // }

        // proses hitung nilai akhir
        nilai_angka = (float) (0.30 * nilai_mhs[0] + 0.50 * nilai_mhs[1] + 0.20 * nilai_mhs[2]);
        // System.out.println("Nilai Akhir  : " + nilai_angka);

        // proses hitung nilai huruf
        if (nilai_angka >= 80) {
            nilaiHuruf = nilaiHurufRef[0];
        } else if (nilai_angka >= 77) {
            nilaiHuruf = nilaiHurufRef[1];
        } else if (nilai_angka >= 60) {
            nilaiHuruf = nilaiHurufRef[2];
        } else if (nilai_angka >= 50) {
            nilaiHuruf = nilaiHurufRef[3];
        } else if (nilai_angka >= 25) {
            nilaiHuruf = nilaiHurufRef[4];
        } else {
            nilaiHuruf = nilaiHurufRef[5];
        }
        // System.out.println("Nilai Huruf  : " + nilaiHuruf);

        // tambahkan keterangan
        if (nilaiHuruf.equals(nilaiHurufRef[0]) || nilaiHuruf.equals(nilaiHurufRef[1]) || nilaiHuruf.equals(nilaiHurufRef[2]) || nilaiHuruf.equals(nilaiHurufRef[3])) {
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
        System.out.printf("Nilai UTS    : %d%nNilai UAS    : %d%nNilai Tugas  : %d%nNilai Akhir  : %.2f%nNilai Huruf  : %s%nKeterangan   : %s%n", nilai_mhs[0], nilai_mhs[1], nilai_mhs[2], nilai_angka, nilaiHuruf, keterangan);
    }
}
