package latihanStatic;

public class Mahasiswa {
    public static String prodi = "TRPL";
    public String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public static String getProdi() {
        return prodi;
    }

    public static void setProdi(String prodi) {
        Mahasiswa.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "Nama = " + nama + 
                ", Prodi = " + prodi + '}';
    }
    
}
