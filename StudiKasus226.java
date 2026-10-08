import java.util.Scanner;
/**
 * StudiKasus226
 */
public class StudiKasus226 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dokumen, juara, lolos;

        System.out.println("Nama Mahasiswa      :");
        String nama = sc.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA,BAKORMA,MANDIRI,PKM,LAINNYA)");
        String jenis = sc.nextLine();

       if (jenis.equalsIgnoreCase("belmawa")|| jenis.equalsIgnoreCase("bakorma")|| jenis.equalsIgnoreCase("mandiri")){
            System.out.println("jumlah dokumen:");
            dokumen = sc.nextInt();
            System.out.println("peringkat juara:");
            juara= sc.nextInt();

            if (juara >= 1 && juara <=3){
                if(dokumen == 4){
                    System.out.println("Status: memperoleh dana penghargaan");
                } else {
                    System.out.println("Status: Dokumen tidak lenkap (kurang"+(4-dokumen)+"dokumen). dana penghargaan tidak dapat di berikan");
                }
            } else {
                System.out.println("Status : tidak memperoleh dana penghargaan (hanya untuk juara 1,2,3)");
            }
        }else if(jenis.equalsIgnoreCase("pkm")){
            System.out.println(" jumlah dokumen : ");
            dokumen = sc.nextInt();
            System.out.println("Status pendanaan PKM (1 = lolos, 0= tidak lolos): ");
            lolos =sc.nextInt();

            if(lolos == 1){
                if(dokumen == 4){
                    System.out.println("Status: memperoleh dana penghargaan (PKM lolos pendanaan) ");
                } else {
                    System.out.println("Status: dokumen tidak lengkap(kurang"+(4-dokumen)+"dokumen). dana penghargaan tidak dapat di berikan");
                }
            }else{
                System.out.println("Status: tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan)");
            }
        } else {
            System.out.println("Status: tidak memperoleh dana penghargaan(jenis kegiatan tidak termasuk ketentuan)");
        }
    }
}