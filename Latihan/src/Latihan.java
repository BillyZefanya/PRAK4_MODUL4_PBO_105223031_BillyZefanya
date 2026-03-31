class MesinKopi {

    int bijiKopi;
    int air;
    int susu;

    public MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    }

    public void isiUlangBahan(int tambahKopi, int tambahAir, int tambahSusu) {
        this.bijiKopi = this.bijiKopi + tambahKopi;
        this.air = this.air + tambahAir;
        this.susu = this.susu + tambahSusu;

        System.out.println("Bahan berhasil diisi ulang!");
        System.out.println("Kopi: " + this.bijiKopi + " gram");
        System.out.println("Air: " + this.air + " ml");
        System.out.println("Susu: " + this.susu + " ml");
    }

    public boolean cekKetersediaanCappuccino() {
        if (this.bijiKopi >= 15 && this.air >= 50 && this.susu >= 100) {
            return true;
        } else {
            return false;
        }
    }
}

public class Latihan {
    public static void main(String[] args) {
        MesinKopi mesinLobby = new MesinKopi();

        mesinLobby.isiUlangBahan(100, 200, 300);

        boolean bisaBuat = mesinLobby.cekKetersediaanCappuccino();

        if (bisaBuat) {
            System.out.println("Bisa membuat Cappuccino!");
        } else {
            System.out.println("Bahan tidak cukup!");
        }
    }
}