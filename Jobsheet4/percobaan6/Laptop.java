package Jobsheet4.percobaan6;

public class Laptop {

    private String merk;
    private Printer printerDefault;

    public Laptop(String merk, Printer printerDefault) {
        this.merk = merk;
        this.printerDefault = printerDefault;
    }

    public void setPrinterDefault(Printer printerDefault) {
        this.printerDefault = printerDefault;
    }

    public  Printer getPrinterDefault() {
        return printerDefault;
    }

    public void cetakDokumen(String namaFile) {
        System.out.println(merk + " mengirim dokumen ke printer...");
        if (printerDefault != null) {
            printerDefault.cetak(namaFile);
        } else {
            System.out.println("Belum ada printer yang terhubung!");
        }
    }
    
}
