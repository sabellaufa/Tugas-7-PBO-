import model.*;
import service.*;
import util.DataWrapper;

public class Main {
    public static void main(String[] args) {
        //buat buku dan mahasiswa 
        Buku buku1 = new Buku("pemrograman java", "Michael");
        Buku buku2 = new Buku("Struktur Data", "Anne");

        Mahasiswa mhs = new Mahasiswa("siti", "20229870");
        Petugas petugas = new Petugas("Pak Doni", "P0043");

        //service perpustakaan 
        PerpustakaanService service = new PerpustakaanService();
        service.tambahBuku(buku1);
        service.tambahBuku(buku2);
        service.tampilkanBuku();

        // Antrian peminjam
        AntrianPeminjam antrian = new AntrianPeminjam();
        antrian.tambah(mhs);
        antrian.tambah(petugas);

        System.out.println("\nMemproses antrian peminjam:");
        antrian.prosesAntrian();

        // Generic Wrapper
        DataWrapper<Buku> data = new DataWrapper<>(buku1);
        System.out.println("\nData dalam wrapper: " + data.get());
    }
    
}
