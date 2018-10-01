
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nama : Firman Ardhiansyah 
 *         Kelas : IF-2 (PB02) 
 *         NIM : 10117056
 */
public class PB0210117056Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalNilai = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Banyaknya Mahasiswa : ");
        int nSiswa = input.nextInt();

        for (int i = 1; i <= nSiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");

            int nilai = input.nextInt();
            totalNilai += nilai;
        }
        double nilaiRataRata = (double) totalNilai / nSiswa;
        System.out.println("\n" + "Maka, Rata-rata Nilainya adalah "
                + nilaiRataRata);
        System.out.println("Developed by    : Firman Ardhiansyah");

    }

}
