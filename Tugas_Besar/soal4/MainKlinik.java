
package soal4;

import java.util.ArrayList;

public class MainKlinik {
    public static void main(String[] args) {
        ArrayList<Pemeriksaan> daftarPemeriksaan =
                new ArrayList<>();

        daftarPemeriksaan.add(new Pemeriksaan(
            "P001", "Andi", "Dr. Budi", 100000
        ));

        daftarPemeriksaan.add(new Pemeriksaan(
            "P002", "Siti", "Dr. Rina", 150000
        ));

        daftarPemeriksaan.add(new Pemeriksaan(
            "P003", "Doni", "Dr. Budi", 125000
        ));

        double totalBiaya = 0;

        System.out.println("DATA PEMERIKSAAN KLINIK");
        System.out.println("=======================");

        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
            System.out.println("-----------------------");

            totalBiaya += p.hitungTotal();
        }

        System.out.println("Jumlah Pemeriksaan: "
                + daftarPemeriksaan.size());
        System.out.println("Total Seluruh Biaya: Rp"
                + totalBiaya);
    }
}
