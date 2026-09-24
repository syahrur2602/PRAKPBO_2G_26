
package Jobsheet4.TugasPraktikum;

public class Perpustakaan {
    private String nama;
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.daftarBuku = new Buku[5];
        this.jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Perpustakaan penuh!");
        }
    }

    public void tampilkanBuku() {
        System.out.println("Perpustakaan: " + nama);

        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].info();
            System.out.println();
        }
    }
}