import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Antrian antrian = new Antrian();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Keluar");
    

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    antrian.inputPasien();
                    break;
                case 2:
                    antrian.displayQueue();
                    break;
                case 3:
                    System.out.println("Keluar...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
