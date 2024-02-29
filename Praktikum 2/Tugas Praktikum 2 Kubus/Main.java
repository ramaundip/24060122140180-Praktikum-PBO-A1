/* NAMA & NIM : MUHAMMAD ANUGERAH RAMADHAN & 24060122140180*/
public class Main {
    public static void main(String[] args) {
        // Membuat objek kubus dengan sisi tertentu
        Kubus kubus1 = new Kubus(4.0);

        // a. Hitung dan cetak volume dari kubus1
        System.out.println("Volume kubus1: " + kubus1.hitungVolume());

        // b. Hitung dan cetak luas permukaan dari kubus1
        System.out.println("Luas permukaan kubus1: " + kubus1.hitungLuasPermukaan());
    }
}