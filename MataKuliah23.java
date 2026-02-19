package jobsheet2;

public class MataKuliah23 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public  MataKuliah23() {
    }

    public MataKuliah23(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }
    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }
    
    void tambahJam(int jam) {
        jumlahJam += jam;
    }
    
    void kurangiJam (int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        }
    }
}


