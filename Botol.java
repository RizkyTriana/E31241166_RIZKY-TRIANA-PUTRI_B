public class Botol {
    private String merk;

    // Constructor
    public Botol(String merk) {
        this.merk = merk;
        System.out.println("Botol merk " + merk + " dibuat.");
    }

    // Menampilkan merk botol
    public void tampilkanMerk() {
        System.out.println("Merk botol: " + merk);
    }

    // Destructor tiruan menggunakan finalize()
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Botol merk " + merk + " dibersihkan dari memori.");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        Botol botol1 = new Botol("Aqua");
        botol1.tampilkanMerk();

        Botol botol2 = new Botol("Fanta");
        botol2.tampilkanMerk();

        botol1 = null;
        botol2 = null;

        // Meminta Garbage Collector untuk menjalankan finalize() (tidak pasti langsung terjadi)
        System.gc();

        System.out.println("Program selesai.");
    }
}
