import java.util.*;

// Class untuk merepresentasikan node (Mahasiswa) dalam linked list
class Mahasiswa {
    String nim;
    String nama;
    String jurusan;
    Mahasiswa next;

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.next = null;
    }
}

public class DatabaseMahasiswa {
    private Mahasiswa head;
    private int size;
    private static final int MAX_SIZE = 5;

    public DatabaseMahasiswa() {
        this.head = null;
        this.size = 0;
    }

    // Method untuk menambahkan data mahasiswa ke stack (linked list)
    public void push(String nim, String nama, String jurusan) {
        // Validasi NIM: hanya angka dan maksimal 10 digit
        if (!nim.matches("\\d{1,10}")) {
            System.out.println("Error: NIM harus berupa maksimal 10 digit angka.");
            return;
        }
        // Validasi nama
        if (nama.length() > 30) {
            System.out.println("Error: Nama maksimal 30 karakter.");
            return;
        }
        // Validasi jurusan
        if (jurusan.length() > 50) {
            System.out.println("Error: Jurusan maksimal 50 karakter.");
            return;
        }
        // Validasi jumlah data
        if (size >= MAX_SIZE) {
            System.out.println("Error: Jumlah data maksimal " + MAX_SIZE + ".");
            return;
        }
        // Buat node baru dan tambahkan di posisi head (push)
        Mahasiswa newNode = new Mahasiswa(nim, nama, jurusan);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Data berhasil ditambahkan. Total data: " + size);
    }

    // Method untuk menampilkan semua data, diurutkan berdasarkan NIM
    public void displaySorted() {
        if (head == null) {
            System.out.println("Database kosong.");
            return;
        }
        // Salin node ke list untuk disort
        List<Mahasiswa> list = new ArrayList<>();
        Mahasiswa current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }
        // Urutkan berdasarkan NIM
        Collections.sort(list, Comparator.comparing(m -> m.nim));
        // Tampilkan
        System.out.println("\n-- Daftar Mahasiswa (Sorted by NIM) --");
        for (Mahasiswa m : list) {
            System.out.printf("NIM: %s | Nama: %s | Jurusan: %s%n", m.nim, m.nama, m.jurusan);
        }
    }

    // Method untuk menghapus semua data (pop all)
    public void popAll() {
        head = null;
        size = 0;
        System.out.println("Semua data berhasil dihapus.");
    }

    // Main program dengan menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DatabaseMahasiswa db = new DatabaseMahasiswa();
        while (true) {
            System.out.println("\n=== PROGRAM DATABASE MAHASISWA ===");
            System.out.println("1. Push data mahasiswa");
            System.out.println("2. Tampilkan semua data (sorted by NIM)");
            System.out.println("3. Pop semua data mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); // consume newline
  
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = sc.nextLine();
                    db.push(nim, nama, jurusan);
                    break;
                case 2:
                    db.displaySorted();
                    break;
                case 3:
                    db.popAll();
                    break;
                case 4:
                    System.out.println("Keluar program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}