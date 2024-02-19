import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Pilih bentuk yang ingin dihitung:");
            System.out.println("1. Kubus");
            System.out.println("2.Bola");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = input.nextInt();

            if(pilihan == 3){
                System.out.println("Terima kasih");
                break;
            }

            
            if(pilihan == 1){
                System.out.print("Masukkan panjang sisi: ");
                double sisi = input.nextDouble();
                Cube kubus = new Cube(sisi);
                System.out.println("Luas Volume kubus: " + kubus.calculateVolume());
                System.out.println("Luas permukaan kubus: " + kubus.calculateSurfaceArea());
            } else if(pilihan == 2){
                System.out.print("Masukkan Radius bola: ");
                double jari = input.nextDouble();
                Sphere bola = new Sphere(jari);
                System.out.println("Luas permukaan bola: " + bola.calculateVolume());
            } else {
                System.out.println("Pilihan tidak tersedia");
                continue;
            }

        }

        input.close();

    }
}
