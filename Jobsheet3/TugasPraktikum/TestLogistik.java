package Jobsheet3.TugasPraktikum;

public class TestLogistik {
    public static void main(String[] args) {

        Kontainer kontainerA1 =
                new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: "
                + kontainerA1.getNamaPemilik());

        System.out.println("Kapasitas Maksimal: "
                + kontainerA1.getKapasitasMaksimal() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        kontainerA1.tambahMuatan(6000);
        System.out.println("Berat muatan saat ini: "
                + kontainerA1.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        kontainerA1.tambahMuatan(4000);
        System.out.println("Berat muatan saat ini: "
                + kontainerA1.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMembongkar muatan sebesar 500 kg...");
        kontainerA1.turunkanMuatan(500);
        System.out.println("Berat muatan saat ini: "
                + kontainerA1.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMembongkar muatan sebesar 1.500 kg...");
        kontainerA1.turunkanMuatan(1500);
        System.out.println("Berat muatan saat ini: "
                + kontainerA1.getBeratMuatanSaatIni() + " kg");
    }
}