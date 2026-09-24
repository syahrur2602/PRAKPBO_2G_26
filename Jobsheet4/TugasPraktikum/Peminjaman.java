
package Jobsheet4.TugasPraktikum;

public class Peminjaman {
    private String namaPeminjam;
    private Buku buku;

    private BuktiPeminjaman bukti;

    public Peminjaman(String namaPeminjam, Buku buku, String nomorBukti) {
        this.namaPeminjam = namaPeminjam;
        this.buku = buku;

        this.bukti = new BuktiPeminjaman(nomorBukti);
    }

    public void prosesPinjam() {
        System.out.println("Peminjam: " + namaPeminjam);
        System.out.println("Buku: " + buku.getJudul());
        bukti.info();
    }

    public void kirimNotifikasi(Notifikasi notif) {
        notif.kirimPesan(
            namaPeminjam + " berhasil meminjam buku."
        );
    }
}