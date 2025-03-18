class Mahasiswa {
    // Atribut private
    private String nama;
    private String nim;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk NIM
    public String getNim() {
        return nim;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter dan Setter untuk IPK
    public double getIpk() {
        return ipk;
    }
    
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method untuk menampilkan data mahasiswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("Putra", "22461809", 3.6);
        
        // Menampilkan informasi mahasiswa sebelum diubah
        System.out.println("Sebelum diubah:");
        mhs.displayInfo();

        // Mengubah atribut menggunakan setter
        mhs.setNama("Farras");
        mhs.setNim("22461176");
        mhs.setIpk(3.8);

        // Menampilkan informasi mahasiswa setelah diubah
        System.out.println("\nSetelah diubah:");
        mhs.display
