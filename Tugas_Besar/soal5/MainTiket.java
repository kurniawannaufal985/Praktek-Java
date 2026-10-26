
package soal5;

import java.util.ArrayList;

public class MainTiket {
    public static void main(String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Tiket(
            "T001", "Avengers", "Reguler", 40000, 2
        ));

        daftarTiket.add(new Tiket(
            "T002", "Jumbo", "VIP", 75000, 1
        ));

        daftarTiket.add(new Tiket(
            "T003", "Dilan", "Reguler", 35000, 3
        ));

        for (Tiket tiket : daftarTiket) {
            tiket.tampilData();
        }
    }
}
