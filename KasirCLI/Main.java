import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Toko toko = new Toko();
        Transaksi transaksi = new Transaksi();

        int pilih;

        do {

            System.out.println("\n===== APLIKASI TOKO =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Barang");
            System.out.println("3. Beli Barang");
            System.out.println("4. Tampilkan Transaksi");
            System.out.println("5. Hitung Total");
            System.out.println("6. Bayar");
            System.out.println("7. Keluar");

            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Barang : ");
                    String nama = input.nextLine();

                    System.out.print("Harga : ");
                    int harga = input.nextInt();

                    System.out.print("Stok : ");
                    int stok = input.nextInt();

                    toko.tambahBarang(nama, harga, stok);
                    break;

                case 2:
                    toko.tampilBarang();
                    break;

                case 3:

                    toko.tampilBarang();

                    System.out.print("Pilih ID Barang : ");
                    int id = input.nextInt();

                    System.out.print("Jumlah : ");
                    int qty = input.nextInt();

                    Barang barang = toko.ambilBarang(id);

                    if (barang != null) {
                        transaksi.beliBarang(barang, qty);
                    }

                    break;

                case 4:
                    transaksi.tampilTransaksi();
                    break;

                case 5:
                    System.out.println("Total = " + transaksi.hitungTotal());
                    break;

                case 6:

                    int total = transaksi.hitungTotal();

                    System.out.println("Total Bayar : " + total);
                    System.out.print("Uang : ");
                    int uang = input.nextInt();

                    System.out.println("Kembalian : " + (uang - total));

                    break;

            }

        } while (pilih != 7);

        System.out.println("Program selesai");
    }
}