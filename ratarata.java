package LATIHANUKL;
import java.util.Scanner;
public class ratarata {
    public static void main(String[] args) {
        int i=1, jumlahSiswa, nilai, totalNilai=0;
        double rataRata;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa: ");
        jumlahSiswa = input.nextInt();

        while (i <= jumlahSiswa) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            nilai = input.nextInt();
            totalNilai += nilai;
            i++;
        }
        rataRata = totalNilai / jumlahSiswa;
        System.out.println("==========Rata-rata Nilai==========");
        System.out.println("Total nilai dari"+ jumlahSiswa +":"+totalNilai);
        System.out.println("Rata-rata nilai siswa adalah: " + rataRata);
    }
}
