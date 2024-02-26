// MUHAMMAD ANUGERAH RAMADHAN , 24060122140180

public class Main {
    public static void main(String[] args) {
        Titik TitikAwal = new Titik(7, 9);
        Titik TitikRefleksiX = TitikAwal.PublicRefleksiX();
        Titik TitikRefleksiY = TitikAwal.PublicRefleksiY();

        System.out.println("Titik Awal: (" + TitikAwal.getX() + ", " + TitikAwal.getY() + ")");
        System.out.println("Refleksi terhadap sumbu X: (" + TitikRefleksiX.getX() + ", " + TitikRefleksiX.getY() + ")");
        System.out.println("Refleksi terhadap sumbu Y: (" + TitikRefleksiY.getX() + ", " + TitikRefleksiY.getY() + ")");
    }
}