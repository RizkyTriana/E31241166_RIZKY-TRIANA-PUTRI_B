class Bunga {
    String nama;
    String warna;

    Bunga(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }
    void deskripsi() {
        System.out.println("Bunga: " + nama + ", Warna: " + warna);
    }
}
class Mawar extends Bunga {
    int jumlahKelopak;

    Mawar(String warna, int jumlahKelopak) {
        super("Mawar", warna);
        this.jumlahKelopak = jumlahKelopak;
    }
    @Override
    void deskripsi() {
        super.deskripsi();
        System.out.println("Jumlah Kelopak: " + jumlahKelopak);
    }
}
class Melati extends Bunga {
    boolean harum;

    Melati(String warna, boolean harum) {
        super("Melati", warna);
        this.harum = harum;
    }

    @Override
    void deskripsi() {
        super.deskripsi();
        System.out.println("Harum: " + (harum ? "Ya" : "Tidak"));
    }
}
public class MainBunga {
    public static void main(String[] args) {
        Mawar mawarMerah = new Mawar("Merah", 32);
        Melati melatiPutih = new Melati("Putih", true);

        mawarMerah.deskripsi();
        System.out.println();
        melatiPutih.deskripsi();
    }
}
