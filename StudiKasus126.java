import java.util.Scanner;

/**
 * StudiKasus126
 */
public class StudiKasus126 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("masukkan jumlah cup");
        jumlahCup =sc.nextInt();
        System.out.println("masukkan uang yang anda bayar");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup*hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000){
            diskon = totalHarga * (10/100);
            totalBayar = totalHarga - diskon;
            System.out.println("Harga yang harus di bayar Rp: "+ totalBayar);
        } else {
            totalBayar = totalHarga - diskon;
            System.out.println("Harga yang harus di bayar Rp: "+ totalBayar);
        }

        System.out.println("total harga Rp: "+totalHarga);
        System.out.println("diskon yang didapat "+ diskon);
        System.out.println("total yang harus di bayar Rp: "+totalBayar);

        if (uangBayar >= totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian yang di terima Rp: " +kembalian);
        } else {
            kurang = totalBayar-uangBayar;
            System.out.println("uang tidak cukup, kurang Rp:  "+kurang);
        }

    }
}
