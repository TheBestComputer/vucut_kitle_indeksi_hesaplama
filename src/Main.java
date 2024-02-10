
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy, vucutKitleIndeksi;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz : ");
        boy = scanner.nextDouble();
        System.out.print("Lufen kilonuzu giriniz : ");
        kilo = scanner.nextInt();
        
        vucutKitleIndeksi = kilo / (boy * boy);
        
        System.out.println("Vucut kitle indeksiniz : " + vucutKitleIndeksi);
        
        
    }
}
