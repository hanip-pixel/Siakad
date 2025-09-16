// Kelas MataKuliah merepresentasikan data dan perilaku mata kuliah
public class MataKuliah {
    // ===== Properti (Atribut) =====
    private String kode;      // kode mata kuliah, misal: "IF101"
    private String nama;      // nama mata kuliah, misal: "Pemrograman Java"
    private int sks;          // jumlah SKS
    private String dosenPengampu; // nama dosen pengampu

    // ===== Constructor =====
    public MataKuliah(String kode, String nama, int sks, String dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    // ===== Method Getter (Akses Data) =====
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public String getDosenPengampu() {
        return dosenPengampu;
    }

    // ===== Method Setter (Ubah Data) =====
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void setDosenPengampu(String dosenPengampu) {
        this.dosenPengampu = dosenPengampu;
    }

    // ===== Method Tambahan (Perilaku) =====
    public void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Dosen Pengampu: " + dosenPengampu);
    }
}