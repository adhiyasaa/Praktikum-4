import java.sql.SQLOutput;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("CV Labkomdas present :");
        System.out.println("=========LABKOMDAS STORE==========");
        System.out.println("======Jaket A = Rp.100.000,- =====");
        System.out.println("======Jaket B = Rp.125.000,- =====");
        System.out.println("======Jaket C = Rp.175.000,- =====");
        System.out.print("Masukkan tipe jaket yang ingin anda pesan (A/B/C) = ");
        String tipe = in.nextLine();
        System.out.print("Masukkan jumlah jaket yang dipesan = ");
        int jumlah = in.nextInt();
        jaket pesan = new jaket(tipe, jumlah);
        pesan.show();
    }

}
