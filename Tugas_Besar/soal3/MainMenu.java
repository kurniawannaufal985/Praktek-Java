
package soal3;

public class MainMenu {
    public static void main(String[] args) {
        new Menu();

        Menu menu1 = new Menu(
            "M01", "Nasi Goreng", 18000, "Makanan"
        );

        int jumlah = 2;

        menu1.tampilMenu();
        System.out.println("Jumlah : " + jumlah);
        System.out.println(
            "Total  : " + menu1.hitungHarga(jumlah)
        );
    }
}
