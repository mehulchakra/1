import java.util.Scanner;

// Kelas utama PendaftaranKursusApp
public class PendaftaranKursusApp {
    public static void main(String[] args) {
                // Inisialisasi Scanner untuk input pengguna
        Scanner input = new Scanner(System.in);
                // Membuat objek SistemPendaftaranKursus
        SistemPendaftaranKursus pendaftaranKursus = new SistemPendaftaranKursus();
        
        // Membuat objek kursus dan menambahkannya ke sistem pendaftaran
        Kursus kursus1 = new Kursus("Fullstack", 1000000, 30);
        Kursus kursus2 = new Kursus("Automation", 800000, 60);
        
        // Menambahkan kursus ke sistem pendaftaran
        pendaftaranKursus.addKursus(kursus1);
        pendaftaranKursus.addKursus(kursus2);
        
        // Deklarasi variabel untuk pilihan menu
        int choise;
        do {
                        // Tampilkan menu utama
            System.out.println("\n|===================================|");
            System.out.println("|         Online Kursus Apps         |");
            System.out.println("|===================================|");
            // Opsi menu yang tersedia
            System.out.println("Avaliable Menu");
            System.out.println("1.Show Kursus List \n2.Register Kursus \n3.Show Register Information \n4.Exit Program");
            System.out.print("Select Menu:");
            choise = input.nextInt();
            
            // Pengolahan pilihan menu
            switch (choise) {
                case 1:
                                        // Menampilkan daftar kursus yang tersedia
                    System.out.println("\n|===================================|");
                    System.out.println("|             Kursus List           |");
                    System.out.println("|===================================|");
                    pendaftaranKursus.showKursus();
                    break;
                case 2:
                                        // Proses pendaftaran kursus
                    System.out.println("\n|===================================|");
                    System.out.println("|           Register Kursus         |");
                    System.out.println("|===================================|");
                    pendaftaranKursus.showKursus();

                    input.nextLine();
                    // Meminta pengguna memilih kursus
                    System.out.print("Select Kursus: ");
                    String name = input.nextLine();
                    System.out.print("Enter Kursus Duration: ");
                    int duration = input.nextInt();
                    // Melakukan pendaftaran kursus
                    pendaftaranKursus.daftarKursus(name, duration);

                    break;
                case 3:
                                        // Menampilkan informasi pendaftaran kursus
                    System.out.println("\n|===================================|");
                    System.out.println("|     Show Register Information     |");
                    System.out.println("|===================================|");
                    pendaftaranKursus.tampilkanInfoPendaftaran();
                    break;
                case 4:
                                        // Keluar dari program
                    System.out.println("\n|===================================|");
                    System.out.println("|      Thanks For Using Program     |");
                    System.out.println("|===================================|");
                    choise = 0;
                    break;
                default:
                                        // Tangani input tidak valid
                    System.out.println("Input Not Valid, Enter a Valid Option e.g 1,2,3,4");
                    break;
            }
        } while (choise != 0);
    }
}
