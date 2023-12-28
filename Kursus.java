// Kelas Kursus untuk menyimpan informasi tentang sebuah kursus
public class Kursus {
        // Deklarasi variabel
    String name;
    double cost;
    int duration;
    
  // Konstruktor kelas Kursus
    // Menginisialisasi nama, biaya, dan durasi kursus
    public Kursus(String name, double cost, int duration){
        this.name = name;
        this.cost = cost;
        this.duration = duration;
    }
    
    // Metode untuk menampilkan informasi kursus
    // Menampilkan nama, biaya, dan durasi kursus
    public void getInfo() {
        System.out.println("Informasi Kursus");
        System.out.println("Name: " + name);
        System.out.println("Cost: Rp." + cost);
        System.out.println("Duration: " + duration + " Minute");
    }
}
