import java.util.ArrayList;

// Kelas SistemPendaftaranKursus mengimplementasikan interface Pendaftaran
public class SistemPendaftaranKursus implements Pendaftaran {
        // Daftar untuk menyimpan kursus online dan pendaftaran kursus
    private ArrayList<Kursus> daftarKursusOnline;
    private ArrayList<String> listKursusOnline;
    
    // Konstruktor untuk inisialisasi daftar kursus online dan pendaftaran kursus
    public SistemPendaftaranKursus() {
        this.daftarKursusOnline = new ArrayList<>();
        this.listKursusOnline = new ArrayList<>();
    }
    // Metode untuk menambah kursus ke daftar kursus online
    public void addKursus(Kursus kursus) {
        daftarKursusOnline.add(kursus);
    }
    // Metode untuk menampilkan semua kursus yang tersedia
    public void showKursus() {
        for (Kursus kursus : daftarKursusOnline) {
            kursus.getInfo();
            System.out.println("|===================================|");
        }
    }
    // Metode override untuk mendaftar ke kursus sesuai dengan interface Pendaftaran
    @Override
    public void daftarKursus(String name, int duration) {
        Kursus selectedKursus = null;
        for (Kursus kursusOnline : daftarKursusOnline) {
            if (kursusOnline.name.equals(name)) {
                selectedKursus = kursusOnline;
                break;
            }
        }
        // Proses pendaftaran jika kursus ditemukan
        if (selectedKursus != null) {
            if (duration > 0 && duration <= selectedKursus.duration) {
                String daftar = "Kursus: " + name + ", Duration: " + duration;
                listKursusOnline.add(daftar);

                // selectedKursus.duration -= duration; // Opsional: Mengurangi durasi kursus

                System.out.println("Daftar Successful!");
            } else {
                System.out.println("Kursus Duration To Long.");
            }
        } else {
            System.out.println("Kursus Not Found.");
        }
    }
    // Metode override untuk menampilkan informasi pendaftaran sesuai dengan interface Pendaftaran
    @Override
    public void tampilkanInfoPendaftaran() {
        for (String kursus : listKursusOnline) {
            System.out.println(kursus);
            System.out.println("|===================================|");
        }
    }
}
