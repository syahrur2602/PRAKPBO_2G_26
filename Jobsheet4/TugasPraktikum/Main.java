
package Jobsheet4.TugasPraktikum;

public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Belajar Java", "Andi");

        Buku buku2 = new Buku("Dasar OOP", "Budi");

        Perpustakaan perpus =
            new Perpustakaan("Perpustakaan Polinema");

        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);

        perpus.tampilkanBuku();

        Peminjaman pinjam = new Peminjaman("Syahrur", buku1, "P001");

        pinjam.prosesPinjam();

        Notifikasi notif = new Notifikasi();
        pinjam.kirimNotifikasi(notif);
    }
}