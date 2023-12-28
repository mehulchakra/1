import java.util.ArrayList;

public class SistemPendaftaranKursus implements Pendaftaran {
    private ArrayList<Kursus> daftarKursusOnline;
    private ArrayList<String> listKursusOnline;

    public SistemPendaftaranKursus() {
        this.daftarKursusOnline = new ArrayList<>();
        this.listKursusOnline = new ArrayList<>();
    }

    public void addKursus(Kursus kursus) {
        daftarKursusOnline.add(kursus);
    }

    public void showKursus() {
        for (Kursus kursus : daftarKursusOnline) {
            kursus.getInfo();
            System.out.println("|===================================|");
        }
    }

    @Override
    public void daftarKursus(String name, int duration) {
        Kursus selectedKursus = null;
        for (Kursus kursusOnline : daftarKursusOnline) {
            if (kursusOnline.name.equals(name)) {
                selectedKursus = kursusOnline;
                break;
            }
        }

        if (selectedKursus != null) {
            if (duration > 0 && duration <= selectedKursus.duration) {
                String daftar = "Kursus: " + name + ", Duration: " + duration;
                listKursusOnline.add(daftar);

                // selectedKursus.duration -= duration;

                System.out.println("Daftar Successful!");
            } else {
                System.out.println("Kursus Duration To Long.");
            }
        } else {
            System.out.println("Kursus Not Found.");
        }
    }

    @Override
    public void tampilkanInfoPendaftaran() {
        for (String kursus : listKursusOnline) {
            System.out.println(kursus);
            System.out.println("|===================================|");
        }
    }
}
