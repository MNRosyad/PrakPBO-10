package bangun3D;

import bangun2D.*;

public class PrismaSegitiga {

    private Segitiga alas;
    private double tinggi;

    public PrismaSegitiga(Segitiga alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga getAlas() {
        return alas;
    }

    public void setAlas(Segitiga alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return alas.getLuas() * tinggi;
    }

    public double getLuas() {
        return 2 * alas.getLuas() + alas.getKeliling() * tinggi;
    }

    public String getDetailAlas() {
        if (alas instanceof SegitigaSiku) {
            return "Segitiga Siku";
        } else if (alas instanceof SegitigaSamaSisi) {
            return "Segitiga Sama Sisi";
        } else if (alas instanceof SegitigaSamaKaki) {
            return "Segitiga Sama Kaki";
        } else {
            return "Segitiga";
        }
    }

    @Override
    public String toString() {
        return "PrismaSegitiga(" + "alas = " + alas + 
                ", tinggi = " + tinggi + ")";
    }
}
