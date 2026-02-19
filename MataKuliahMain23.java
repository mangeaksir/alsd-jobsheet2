package jobsheet2;

public class MataKuliahMain23 {
    public static void main(String[] args) {
        MataKuliah23 matkul1 = new MataKuliah23();
        matkul1.kodeMK = "RTI252001";
        matkul1.nama = "Agama";
        matkul1.sks = 2;
        matkul1.jumlahJam = 2;
        matkul1.tampilkanInformasi();

        MataKuliah23 matkul2 = new MataKuliah23("RTI252002", "Aljabar Linier", 2, 4);
        matkul2.ubahSKS(3);
        matkul2.tambahJam(1);
        matkul2.tampilkanInformasi();
        matkul2.kurangiJam(6);
    }
}
