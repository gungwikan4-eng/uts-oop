import java.util.ArrayList;

public class Toko {

    ArrayList<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(String nama, int harga, int stok) {

        Barang barang = new Barang(nama, harga, stok);
        daftarBarang.add(barang);

        System.out.println("Barang berhasil ditambahkan!");
    }

    public void tampilBarang() {

        System.out.println("===== DAFTAR BARANG =====");

        for (int i = 0; i < daftarBarang.size(); i++) {

            System.out.println("ID : " + i);
            daftarBarang.get(i).tampilBarang();
        }
    }

    public Barang ambilBarang(int id) {

        if (id < daftarBarang.size()) {
            return daftarBarang.get(id);
        }

        return null;
    }
}