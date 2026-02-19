package jobsheet2;

public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dosen1 = new Dosen23();
        dosen1.idDosen = "NDI";
        dosen1.nama = "Novta Dany'el Irawan";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2025;
        dosen1.bidangKeahlian = "Dasar Pemrograman";
        dosen1.tampilInformasi();
        int masaKerja = dosen1.hitungMasaKerja(2026);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");

        Dosen23 dosen2 = new Dosen23("ROW", "Anugrah Nur Rahmanto", true, 2024, "K3");
        dosen2.ubahKeahlian("CTPS");
        dosen2.setStatusAktif(false);
        dosen2.tampilInformasi();
        masaKerja = dosen2.hitungMasaKerja(2026);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
}
