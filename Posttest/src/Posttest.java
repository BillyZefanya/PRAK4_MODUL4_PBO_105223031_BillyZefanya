class Pelanggan {

    String nama;
    String nomorHP;
    int saldo;

    public Pelanggan(String nama, String nomorHP) {
        this.nama = nama;
        this.nomorHP = nomorHP;
        this.saldo = 0;
    }

    public void topUp(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("Top up gagal! Minimal Rp 10.000");
        } else {
            this.saldo = this.saldo + jumlah;
            System.out.println("Top up berhasil sebesar Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + this.saldo);
        }
    }

    public void bayarTagihan(int jumlah) {
        if (this.saldo >= jumlah) {
            this.saldo = this.saldo - jumlah;
            System.out.println("Pembayaran berhasil sebesar Rp " + jumlah);
            System.out.println("Sisa saldo: Rp " + this.saldo);
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup");
        }
    }

    public void cekSaldo() {
        System.out.println("Saldo saat ini: Rp " + this.saldo);
    }
}

public class Posttest {
    public static void main(String[] args) {

        Pelanggan anton = new Pelanggan("Anton", "081234567");

        anton.topUp(50000);

        anton.bayarTagihan(60000);

        anton.topUp(20000);

        anton.bayarTagihan(60000);

        anton.cekSaldo();
    }
}