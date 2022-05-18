package bangun2D;

import master.Matematika;

public class SegitigaSamaKaki extends Segitiga {

    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double getKeliling() {
        return getAlas() + 2 * getSisiMiring();
    }

    public double getSisiMiring() {
        return Matematika.getMiring(getAlas() / 2, getTinggi());
    }

    @Override
    public String toString() {
        return "SegitigaSiku{" + "alas = " + getAlas() + ", tinggi = " + getTinggi() + '}';
    }
}
