import java.util.Scanner;

class User {
    int id;
    String username;
    String password;
    String email;

    void login() {
        System.out.println(username + " berhasil login");
    }

    void logout() {
        System.out.println(username + " berhasil logout");
    }
}

class Kasir {
    int idKasir;
    String namaKasir;

    void prosesTransaksi() {
        System.out.println("Kasir memproses transaksi...");
    }
}

class Produk {
    int idProduk;
    String namaProduk;
    double harga;
    int stok;

    void tambahStok(int jumlah) {
        stok += jumlah;
    }

    void kurangiStok(int jumlah) {
        stok -= jumlah;
    }
}

class Transaksi {
    int idTransaksi;
    String tanggal;
    double total;
    double diskon;
    double pajak;

    double hitungSubtotal(double harga, int jumlah) {
        return harga * jumlah;
    }

    double hitungTotal(double subtotal) {
        total = subtotal - diskon + pajak;
        return total;
    }

    void cetakStruk(String namaProduk, int jumlah) {
        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Produk  : " + namaProduk);
        System.out.println("Jumlah  : " + jumlah);
        System.out.println("Total   : " + total);
    }
}

class Pembayaran {
    String metode;
    double jumlahBayar;
    double kembalian;

    void prosesPembayaran(double total) {
        hitungKembalian(total);
    }

    void hitungKembalian(double total) {
        kembalian = jumlahBayar - total;
    }
}

public class KasirApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Produk produk = new Produk();
        Transaksi transaksi = new Transaksi();
        Pembayaran pembayaran = new Pembayaran();

        System.out.println("=== APLIKASI KASIR ===");

        System.out.print("Nama Produk : ");
        produk.namaProduk = input.nextLine();

        System.out.print("Harga Produk : ");
        produk.harga = input.nextDouble();

        System.out.print("Jumlah Beli : ");
        int jumlah = input.nextInt();

        double subtotal = transaksi.hitungSubtotal(produk.harga, jumlah);

        transaksi.diskon = 0;
        transaksi.pajak = subtotal * 0.1;

        double total = transaksi.hitungTotal(subtotal);

        System.out.println("Total Bayar : " + total);

        System.out.print("Metode Pembayaran : ");
        pembayaran.metode = input.next();

        System.out.print("Jumlah Bayar : ");
        pembayaran.jumlahBayar = input.nextDouble();

        pembayaran.prosesPembayaran(total);

        transaksi.cetakStruk(produk.namaProduk, jumlah);

        System.out.println("Bayar      : " + pembayaran.jumlahBayar);
        System.out.println("Kembalian  : " + pembayaran.kembalian);
    }
}