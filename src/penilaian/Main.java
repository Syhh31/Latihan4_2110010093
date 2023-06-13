package penilaian;
public class Main {
    public static void main(String[] args) {
        NilaiAkhir nilaiAkhir = new NilaiAkhir("Syahbana Noor", "2110010093", 80, 90, 95);
        
        System.out.println("Nama: " + nilaiAkhir.getNama());
        System.out.println("NPM: " + nilaiAkhir.getNpm());
        System.out.println("Nilai Akhir: " + nilaiAkhir.hitungNilaiAkhir());
    }
}