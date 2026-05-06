public class Barang {
    String nama;
    int harga;
    int stok;

    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilBarang() {
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Stok  : " + stok);
        System.out.println("---------------------");
    }
}