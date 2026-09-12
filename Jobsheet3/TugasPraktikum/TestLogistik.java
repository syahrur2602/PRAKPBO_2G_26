package Jobsheet3.TugasPraktikum;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Kontainer kontainerA1 =
                new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: "
                + kontainerA1.getNamaPemilik());

        System.out.println("Kapasitas Maksimal: "
                + kontainerA1.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dimasukkan: ");
        double beratMasuk = sc.nextDouble();

        kontainerA1.tambahMuatan(beratMasuk);

        System.out.println("Berat muatan saat ini: "
                + kontainerA1.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dimasukkan: ");
        beratMasuk = sc.nextDouble();

        kontainerA1.tambahMuatan(beratMasuk);

        System.out.println("Berat muatan saat ini: "
                + kontainerA1.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dibongkar: ");
        double beratBongkar = sc.nextDouble();

        kontainerA1.turunkanMuatan(beratBongkar);

        System.out.println("Berat muatan saat ini: "
                + kontainerA1.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang akan dibongkar: ");
        beratBongkar = sc.nextDouble();

        kontainerA1.turunkanMuatan(beratBongkar);

        System.out.println("Berat muatan saat ini: "
                + kontainerA1.getBeratMuatanSaatIni() + " kg");

        sc.close();
    }
}