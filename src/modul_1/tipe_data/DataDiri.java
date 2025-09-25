package modul_1.tipe_data;

public class DataDiri {
    public static void main(String[] args) {
        // String: Tipe data untuk teks (kumpulan karakter)
        String nama, alamat;

        // int: Tipe data bilangan bulat
        int usia;

        // double: Tipe data bilangan desimal
        double tinggi;

        // boolean: Tipe data yang hanya bernilai true (benar) atau false (salah)
        boolean StatusMahasiswa;

        // char: Tipe data untuk 1 karakter (huruf, angka, simbol)
        char JenisKelamin;

        // Mengisi nilai variabel
        nama = "Muhammad Fauzan";
        alamat = "Aceh, Kota Langsa, Paya Bujok Seulemak, Komplek Meuligo Indah";
        tinggi = 170.5; // contoh pakai desimal
        usia = 19;
        JenisKelamin = 'L'; // 'L' = Laki-laki, 'P' = Perempuan
        StatusMahasiswa = true;

        // Penjelasan tipe data
        System.out.println("=== Penjelasan Tipe Data ===");
        System.out.println("String  : digunakan untuk menyimpan teks (kumpulan karakter).");
        System.out.println("int     : digunakan untuk menyimpan bilangan bulat.");
        System.out.println("double  : digunakan untuk menyimpan bilangan desimal.");
        System.out.println("boolean : digunakan untuk menyimpan nilai true atau false.");
        System.out.println("char    : digunakan untuk menyimpan satu karakter saja.\n");

        // Menampilkan data
        System.out.println("Nama           : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Tinggi Badan   : " + tinggi + " cm");
        System.out.println("Usia           : " + usia + " tahun");
        System.out.println("Jenis Kelamin  : " + JenisKelamin);
        System.out.println("Status Mahasiswa: " + StatusMahasiswa);
    }
}
