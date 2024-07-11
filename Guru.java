public class Guru {
    private String nama;
    private String mataPelajaran;
    private int tahunPengalaman;

    // Constructor
    public Guru(String nama, String mataPelajaran, int tahunPengalaman) {
        this.nama = nama;
        this.mataPelajaran = mataPelajaran;
        this.tahunPengalaman = tahunPengalaman;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public int getTahunPengalaman() {
        return tahunPengalaman;
    }

    public void setTahunPengalaman(int tahunPengalaman) {
        this.tahunPengalaman = tahunPengalaman;
    }

    // Method tambahan
    public void mengajar() {
        System.out.println(nama + " sedang mengajar " + mataPelajaran);
    }
    public void mengajar(String mataPelajaran) {
        System.out.println(nama + " sedang memberikan tugas " + mataPelajaran);
    }
}
