package LATIHANUKL;

import java.util.Scanner;


public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] golongan = {1,2,3,4};
        String [] nama = {"Galuh","Indro","Jedi","Kanu"};
        String [] alamat ={"Sawojajari","Blimbing","LowokWaru","Klojen"};
        double [] harga = {1000.00,1500.00,2000.00};

        System.out.println("Mau Input berapa id: ");
        int inputID = input.nextInt();

        for (int i = 0; i < inputID; i++) {
            System.out.println("Masukkan id ke-" + i + ": ");
            int jumlahid = input.nextInt();
            System.out.println("Masukkan jumlah kmh id ke-" + i + ": ");
            int jumlahkmh = input.nextInt();

            if (jumlahid ==1) {
                System.out.println();
                System.out.println("------------------------------------");
                System.out.println("Golongan : " + golongan[0]);
                System.out.println("Nama : " + nama[0]);
                System.out.println("Alamat : " + alamat[0]);
                System.out.println("Harga : " + harga[0]);
                System.out.println("Total Bayar : " + (harga[0] * jumlahkmh));
                System.out.println("------------------------------------");
                System.out.println();
                
            }
            if (jumlahid ==2) {
                System.out.println();
                System.out.println("------------------------------------");
                System.out.println("Golongan : " + golongan[1]);
                System.out.println("Nama : " + nama[2]);
                System.out.println("Alamat : " + alamat[1]);
                System.out.println("Harga : " + harga[2]);
                System.out.println("Total Bayar : " + (harga[2] * jumlahkmh));
                System.out.println("------------------------------------");
                System.out.println();

            }
            if (jumlahid ==3) {
                System.out.println();
                System.out.println("------------------------------------");
                System.out.println("Golongan : " + golongan[2]);
                System.out.println("Nama : " + nama[1]);
                System.out.println("Alamat : " + alamat[2]);
                System.out.println("Harga : " + harga[1]);
                System.out.println("Total Bayar : " + (harga[1] * jumlahkmh));
                System.out.println("------------------------------------");
                System.out.println();
                
            }
    
            if (jumlahid ==4) {
                System.out.println();
                System.out.println("------------------------------------");
                System.out.println("Golongan : " + golongan[4]);
                System.out.println("Nama : " + nama[2]);
                System.out.println("Alamat : " + alamat[3]);
                System.out.println("Harga : " + harga[2]);
                System.out.println("Total Bayar : " + (harga[2] * jumlahkmh));
                System.out.println("------------------------------------");
                System.out.println();
            }
        }
    }
}
