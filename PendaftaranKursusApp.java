import java.util.Scanner;

public class PendaftaranKursusApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemPendaftaranKursus pendaftaranKursus = new SistemPendaftaranKursus();

        Kursus kursus1 = new Kursus("Fullstack", 1000000, 30);
        Kursus kursus2 = new Kursus("Automation", 800000, 60);

        pendaftaranKursus.addKursus(kursus1);
        pendaftaranKursus.addKursus(kursus2);

        int choise;
        do {
            System.out.println("\n|===================================|");
            System.out.println("|         Online Kursus Apps         |");
            System.out.println("|===================================|");

            System.out.println("Avaliable Menu");
            System.out.println("1.Show Kursus List \n2.Register Kursus \n3.Show Register Information \n4.Exit Program");
            System.out.print("Select Menu:");
            choise = input.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("\n|===================================|");
                    System.out.println("|             Kursus List           |");
                    System.out.println("|===================================|");
                    pendaftaranKursus.showKursus();
                    break;
                case 2:
                    System.out.println("\n|===================================|");
                    System.out.println("|           Register Kursus         |");
                    System.out.println("|===================================|");
                    pendaftaranKursus.showKursus();

                    input.nextLine();

                    System.out.print("Select Kursus: ");
                    String name = input.nextLine();
                    System.out.print("Enter Kursus Duration: ");
                    int duration = input.nextInt();

                    pendaftaranKursus.daftarKursus(name, duration);

                    break;
                case 3:
                    System.out.println("\n|===================================|");
                    System.out.println("|     Show Register Information     |");
                    System.out.println("|===================================|");
                    pendaftaranKursus.tampilkanInfoPendaftaran();
                    break;
                case 4:
                    System.out.println("\n|===================================|");
                    System.out.println("|      Thanks For Using Program     |");
                    System.out.println("|===================================|");
                    choise = 0;
                    break;
                default:
                    System.out.println("Input Not Valid, Enter a Valid Option e.g 1,2,3,4");
                    break;
            }
        } while (choise != 0);
    }
}
