package Jobsheet4.percobaan5.modifikasi;

public class MainPercobaan5 {
    public static void main(String[] args) {
        Mesin m = new Mesin("V8 Turbo");

        Mobil mobil2 = new Mobil("Mustang", m);
        mobil2.tampilkanInfo();
    }
}