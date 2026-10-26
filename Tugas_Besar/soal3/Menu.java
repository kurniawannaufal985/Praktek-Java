
package soal3;

public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    // Constructor tanpa parameter
    public Menu() {
        this.kodeMenu = "";
        this.namaMenu = "";
        this.harga = 0.0;
        this.kategori = "";
    }

    // Constructor dengan parameter
    public Menu(String kodeMenu, String namaMenu,
                double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public void tampilMenu() {
        System.out.println("Kode   : " + kodeMenu);
        System.out.println("Nama   : " + namaMenu);
        System.out.println("Harga  : " + harga);
        System.out.println("Kategori: " + kategori);
    }

    public double hitungHarga(int jml) {
        return harga * jml;
    }
}
