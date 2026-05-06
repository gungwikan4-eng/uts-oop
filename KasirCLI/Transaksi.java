import java.util.ArrayList;

public class Transaksi {

    ArrayList<Barang> barangBeli = new ArrayList<>();
    ArrayList<Integer> jumlah = new ArrayList<>();

    public void beliBarang(Barang barang, int qty) {

        if (barang.stok >= qty) {
            barangBeli.add(barang);
            jumlah.add(qty);
            barang.stok -= qty;
            System.out.println("Barang berhasil dibeli!");
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }

    public void tampilTransaksi() {

        System.out.println("===== TRANSAKSI =====");

        for (int i = 0; i < barangBeli.size(); i++) {

            Barang b = barangBeli.get(i);
            int qty = jumlah.get(i);

            System.out.println(b.nama + " x " + qty + 
            " = " + (b.harga * qty));
        }
    }

    public int hitungTotal() {

        int total = 0;

        for (int i = 0; i < barangBeli.size(); i++) {
            total += barangBeli.get(i).harga * jumlah.get(i);
        }

        return total;
    }
}