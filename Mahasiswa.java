public class Mahasiswa {
    // Atribut (field)
    private String nim;
    private String nama;
    private double nilaiTugas;

    // Konstruktor default
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.nilaiTugas = 0.0;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, double nilaiTugas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
    }

    // Setter dan Getter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    // Method untuk menampilkan info mahasiswa
    public void tampilkanInfo() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai : " + nilaiTugas);
    }

    // Method cek nilai
    public String cekNilai() {
        if (nilaiTugas >= 75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}
