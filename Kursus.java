public class Kursus {
    String name;
    double cost;
    int duration;

    public Kursus(String name, double cost, int duration){
        this.name = name;
        this.cost = cost;
        this.duration = duration;
    }

    public void getInfo() {
        System.out.println("Informasi Kursus");
        System.out.println("Name: " + name);
        System.out.println("Cost: Rp." + cost);
        System.out.println("Duration: " + duration + " Minute");
    }
}
