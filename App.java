public class App {
    public static void main(String[] args) {
        // Objek mahasiswa1 (menggunakan setter)
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNim("2403020");
        mahasiswa1.setNama("Hanif");
        mahasiswa1.setNilaiTugas(80);

        mahasiswa1.tampilkanInfo();
        System.out.println("Status: " + mahasiswa1.cekNilai());

        System.out.println("--------------------");

        // Objek mahasiswa2 (menggunakan konstruktor)
        Mahasiswa mahasiswa2 = new Mahasiswa("2403058", "Mustofa", 65);
        mahasiswa2.tampilkanInfo();
        System.out.println("Status: " + mahasiswa2.cekNilai());
    }
}
