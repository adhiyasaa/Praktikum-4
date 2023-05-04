public class jaket {
    String tipe;
    int harga;
    int jumlah;
    final int a = 100000;
    final int b = 125000;
    final int c = 175000;

    public jaket(String tipe, int jumlah) {
        this.tipe = tipe;
        this.jumlah = jumlah;
    }

    void hargaA() {
        if (jumlah > 100) harga = a - 5000;
        else harga = a;
    }

    void hargaB() {
        if (jumlah > 100) harga = b - 5000;
        else harga = b;
    }

    void hargaC() {
        if (jumlah > 100) harga = c - 15000;
        else harga = c;
    }

    void setPesanan() {
        String tipeJaket = null;
        if (tipe.equalsIgnoreCase("A")) {
            tipeJaket = "jaket A";
        } else if (tipe.equalsIgnoreCase("B")) {
            tipeJaket = "jaket B";
        } else if (tipe.equalsIgnoreCase("C")) {
            tipeJaket = "jaket C";
        }

        System.out.println("Tipe jaket yang anda beli    = " + tipeJaket);
        System.out.println("Harga satuan                 = Rp." + harga);
        System.out.println("Jumlah                       = " + jumlah+" pcs");
        System.out.println("Total harga                  = Rp." + harga * jumlah);
    }

    void show() {
            if (tipe.equalsIgnoreCase("A")) {
                hargaA();
                setPesanan();
            } else if (tipe.equalsIgnoreCase("B")) {
                hargaB();
                setPesanan();
            } else if (tipe.equalsIgnoreCase("C")) {
                hargaC();
                setPesanan();
            } else System.out.println("Error mohon masukkan tipe A, B, atau C !!");
        }
    }

