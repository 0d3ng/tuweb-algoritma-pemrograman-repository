import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Nilai argumen ke-" + i + " : " + args[i]);
        }

        // deklarsi variabel
        float nilai_angka[] = new float[3];// snake case
        String nilaiHuruf[] = new String[3];// camel case
        String keterangan[] = new String[3];// camel case
        String nilaiHurufRef[] = { "A", "B+", "B", "C", "D", "E" }; // array
        // int nilai_uts, nilai_uas, nilai_tugas;
        int nilai_mhs[][] = new int[3][3]; // array mahasiswa dalam 1 kelas
        Scanner input = new Scanner(System.in);

        // wellcome screen
        System.out.println("====================================");
        System.out.println("   PROGRAM HITUNG NILAI AKHIR");
        System.out.println("====================================");

        // input nilai
        for (int i = 0; i < nilai_mhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nilai UTS    : ");
            nilai_mhs[i][0] = input.nextInt();
            System.out.print("Masukkan nilai UAS    : ");
            nilai_mhs[i][1] = input.nextInt();
            System.out.print("Masukkan nilai Tugas  : ");
            nilai_mhs[i][2] = input.nextInt();
        }

        // tampilkan input
        // System.out.println("Nilai UTS : " + nilai_mhs[0]);
        // System.out.println("Nilai UAS : " + nilai_mhs[1]);
        // System.out.println("Nilai Tugas : " + nilai_mhs[2]);]

        // for(int nilai : nilai_mhs){
        // System.out.println("Nilai : " + nilai);
        // }

        // for(int i = 0; i < nilai_mhs.length; i++){
        // System.out.println("Nilai : " + nilai_mhs[i]);
        // }

        // proses hitung nilai akhir
        for (int i = 0; i < nilai_mhs.length; i++) {
            nilai_angka[i] = (float) (0.30 * nilai_mhs[i][0] + 0.50 * nilai_mhs[i][1] + 0.20 * nilai_mhs[i][2]);
            // System.out.println("Nilai Akhir : " + nilai_angka);

            // proses hitung nilai huruf
            if (nilai_angka[i] >= 80) {
                nilaiHuruf[i] = nilaiHurufRef[0];
            } else if (nilai_angka[i] >= 77) {
                nilaiHuruf[i] = nilaiHurufRef[1];
            } else if (nilai_angka[i] >= 60) {
                nilaiHuruf[i] = nilaiHurufRef[2];
            } else if (nilai_angka[i] >= 50) {
                nilaiHuruf[i] = nilaiHurufRef[3];
            } else if (nilai_angka[i] >= 25) {
                nilaiHuruf[i] = nilaiHurufRef[4];
            } else {
                nilaiHuruf[i] = nilaiHurufRef[5];
            }
        }
        // System.out.println("Nilai Huruf : " + nilaiHuruf);

        // tambahkan keterangan
        // if (nilaiHuruf.equals(nilaiHurufRef[0]) ||
        // nilaiHuruf.equals(nilaiHurufRef[1]) || nilaiHuruf.equals(nilaiHurufRef[2]) ||
        // nilaiHuruf.equals(nilaiHurufRef[3])) {
        // keterangan = "Lulus";
        // } else {
        // keterangan = "Tidak Lulus";
        // }

        for (int i = 0; i < keterangan.length; i++) {
            keterangan[i] = (nilaiHuruf[i].equals(nilaiHurufRef[0]) || nilaiHuruf[i].equals(nilaiHurufRef[1])
                    || nilaiHuruf[i].equals(nilaiHurufRef[2]) || nilaiHuruf[i].equals(nilaiHurufRef[3])) ? "Lulus"
                            : "Tidak Lulus";
        }
        // System.out.println("Keterangan : " + keterangan);

        // tampilkan rekapitulasi nilai
        System.out.println();
        System.out.println("====================================");
        System.out.println("   REKAPITULASI NILAI AKHIR");
        System.out.println("====================================");
        for (int i = 0; i < nilai_mhs.length; i++) {
            System.out.printf("Mahasiswa %d:%n", i + 1);
            System.out.printf(
                    "Nilai UTS    : %d%nNilai UAS    : %d%nNilai Tugas  : %d%nNilai Akhir  : %.2f%nNilai Huruf  : %s%nKeterangan   : %s%n",
                    nilai_mhs[i][0], nilai_mhs[i][1], nilai_mhs[i][2], nilai_angka[i], nilaiHuruf[i], keterangan[i]);
        }
    }
}
