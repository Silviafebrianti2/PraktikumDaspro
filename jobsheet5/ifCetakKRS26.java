package PraktikumDaspro.jobsheet5;
import java.util.Scanner;

public class ifCetakKRS26 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        System.out.println(uktLunas ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        
    input.close();
}
    }

