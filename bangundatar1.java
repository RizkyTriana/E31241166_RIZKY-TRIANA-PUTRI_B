class bangundatar1:
    def luas(self):
        pass

    def keliling(self):
        pass

cclass bangundatar1 {
    double luas() {
        return 0;
    }

    double keliling() {
        return 0;
    }
}
class Persegi extends bangundatar1 {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }
    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }
}
class Lingkaran extends bangundatar1 {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double luas() {
        return Math.PI * r * r;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * r;
    }
}

class Segitiga extends bangundatar1 {
    double alas, tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 0.5 * alas * tinggi;
    }

    // Untuk keliling, kita butuh sisi miringnya:
    double sisiMiring() {
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }

    @Override
    double keliling() {
        return alas + tinggi + sisiMiring();
    }
}

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(3, 4);

        System.out.println("Persegi - Luas: " + persegi.luas() + ", Keliling: " + persegi.keliling());
        System.out.println("Lingkaran - Luas: " + lingkaran.luas() + ", Keliling: " + lingkaran.keliling());
        System.out.println("Segitiga - Luas: " + segitiga.luas() + ", Keliling: " + segitiga.keliling());
    }
}

