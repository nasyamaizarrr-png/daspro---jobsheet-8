import java.util.Scanner;
 
public class Triangle23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
 
        // Segitiga bertingkat
        int i = 1;                       // perbaikan 1: mulai dari 1, bukan 0
        while (i <= n) {
            int j = 0;                   // j di-reset setiap baris baru
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();        // perbaikan 2: pindah baris
            i++;
        }
 
        // Segitiga terbalik
        i = n;                           // tanpa "int", i sudah dideklarasikan
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;                         // dikurangi, bukan ditambah
        }
        sc.close();
    }
}
 