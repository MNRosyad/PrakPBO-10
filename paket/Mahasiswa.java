package paket;

public class Mahasiswa extends Manusia {

    private String nama;

    public Mahasiswa(String nama) {
        super(nama);
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama + nama);
    }

    @Override
    public String toString() {
        return "nama = " + super.getNama();
    }

}
