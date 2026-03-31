class Mahasiswa {
    String nama;
    int umur;
    String jurusan;
}

public class Pretest {
    public static void main(String[] args) {
        Mahasiswa mhsBaru = new Mahasiswa();

        mhsBaru.nama = "Billy";
        mhsBaru.umur = 20;
        mhsBaru.jurusan = "Computer Science";

        System.out.println("Nama: " + mhsBaru.nama);
        System.out.println("Umur: " + mhsBaru.umur);
        System.out.println("Jurusan: " + mhsBaru.jurusan);
    }
}