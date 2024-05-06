import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Antrian {
    Deque<Pasien> queue;

    public Antrian() {
        queue = new LinkedList<>();
    }

    public void enqueue(Pasien pasien) {
        queue.addLast(pasien);
    }

    public void inputPasien() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama pasien:");
        String name = scanner.nextLine();
        System.out.println("Masukkan usia pasien:");
        int age = scanner.nextInt();
        scanner.nextLine();
        Pasien newPasien = new Pasien(name, age);
        enqueue(newPasien);
        System.out.println("Pasien ditambahkan dalam antrian");
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Antrian Rumah Sakit:");
        for (Pasien pasien : queue) {
            System.out.println(pasien);
        }
    }
}

