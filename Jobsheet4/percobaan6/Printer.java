package Jobsheet4.percobaan6;

public class Printer {

    private String merk;

    public Printer(String merk) {
        this.merk = merk;
    }

    public void cetak(String namafile) {
        System.out.println("[" + merk + "] Mencetak " + namafile + "...");
        System.out.println("[" + merk + "] Selesai. ");
    }
    
}
