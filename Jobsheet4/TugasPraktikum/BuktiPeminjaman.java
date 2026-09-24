
package Jobsheet4.TugasPraktikum;

public class BuktiPeminjaman {
    private String nomor;

    public BuktiPeminjaman(String nomor) {
        this.nomor = nomor;
    }

    public void info() {
        System.out.println("Nomor bukti: " + nomor);
    }
}