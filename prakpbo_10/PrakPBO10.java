package prakpbo_10;

import bangun2D.*;
import bangun3D.*;

public class PrakPBO10 {

    public static void main(String[] args) {
        Segitiga segi3 = new SegitigaSiku(3, 4);
        PrismaSegitiga prisma1 = new PrismaSegitiga(segi3, 10);

        System.out.println(prisma1);
        System.out.println(prisma1.getVolume());
        System.out.println(prisma1.getDetailAlas());
        System.out.println("-----------------------------------------------");

        SegitigaSamaKaki kaki = new SegitigaSamaKaki(10, 7);
        PrismaSegitiga prisma2 = new PrismaSegitiga(kaki, 10);

        System.out.println(prisma2);
        System.out.println(prisma2.getVolume());
        System.out.println(prisma2.getDetailAlas());
        System.out.println("-----------------------------------------------");
        
        Tabung barrel = new Tabung(7, 21);
        
        System.out.println(barrel);
        System.out.println(barrel.getVolume());
        System.out.println("-----------------------------------------------");
        
        Tabung topi = new Kerucut(5, 15);
        
        System.out.println(topi);
        System.out.println(topi.getVolume());
        System.out.println("-----------------------------------------------");
    }

}
