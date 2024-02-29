/* NAMA & NIM : MUHAMMAD ANUGERAH RAMADHAN & 24060122140180*/
public class Main {
    public static void main(String[] args) {
        // Membuat objek Penjual
        Penjual penjual = new Penjual("Amarudin", "Jalan Ngesrep No.8", "081290502745");

        // Membuat objek Produk dengan Penjual terkait
        Produk produk = new Produk("Sepatu Running", 1350000, 15, "Sepatu Running dengan desain casual", penjual);

        // Mengakses informasi produk
        System.out.println("Informasi Produk:");
        System.out.println(produk.getInfoProduk());

        // Mengakses informasi penjual
        System.out.println("\nInformasi Penjual:");
        System.out.println(produk.getPenjual().getInfoPenjual());
    }
}