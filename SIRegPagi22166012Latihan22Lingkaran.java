/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program ini berisi program untuk
perhitungan lingkaran
 */

import java.util.Scanner;
        
public class SIRegPagi22166012Latihan22Lingkaran {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input variabel
        double diameter;
        double jarijari;
        double luas;
        double keliling;
        double phi = 3.14;
        
        //menampilkan judul program
        System.out.println("===== Perhitungan Lingkaran =====");
        
        //Proses perhitungan program dengan menggunakan perintah if-else
            while(true) {
                System.out.print("Masukkan diameter lingkaran: ");
            if (input.hasNextDouble()) {
                diameter = input.nextDouble();                
                jarijari = diameter / 2;
                luas =  Math.PI * jarijari * jarijari ;
                keliling = Math.PI * 2 * jarijari ;
                
            //Hasil output perhitungan lingkaran
                System.out.println("===== Hasil Perhitungan Lingkaran =====");
                System.out.println("Jari-jari lingkaran = "+jarijari + "cm");
                System.out.println("Luas lingkaran: " + luas +"cm");
                System.out.println("Keliling lingkaran: " + keliling + "cm");
                break;
            } else {
            System.out.println("Nilai Diameter Tidak Sesuai");
            input.next();
        }
    }
    }
}
