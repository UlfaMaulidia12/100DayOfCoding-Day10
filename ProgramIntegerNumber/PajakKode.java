package ProgramIntegerNumber;

import java.util.Scanner;

public class PajakKode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Tax Code Calculator ===");

            int kodePajak1 = getInput("Masukkan Kode Pajak 1: ");
            int persentasePajak1 = getInput("Masukkan Persentase Pajak 1 (%): ");
            int kodePajak2 = getInput("Masukkan Kode Pajak 2: ");
            int persentasePajak2 = getInput("Masukkan Persentase Pajak 2 (%): ");

            System.out.println("\n=== Hasil Perhitungan Pajak ===");

            displayResult("Kode Pajak 1", kodePajak1);
            displayResult("Persentase Pajak 1", persentasePajak1 + "%");
            displayResult("Kode Pajak 2", kodePajak2);
            displayResult("Persentase Pajak 2", persentasePajak2 + "%");

            calculateAndDisplayTax(kodePajak1, persentasePajak1);
            calculateAndDisplayTax(kodePajak2, persentasePajak2);

            System.out.print("\nHitung pajak lagi? (Y/N): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }

    private static int getInput(String message) {
        Scanner input = new Scanner(System.in);
        int value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(message);
                value = input.nextInt();
                if (value >= 0) {
                    valid = true;
                } else {
                    System.out.println("Masukkan angka positif.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka yang benar.");
                input.nextLine(); // Bersihkan buffer input
            }
        }
        return value;
    }

    private static void displayResult(String label, Object value) {
        System.out.println(label + ": " + value);
    }

    private static void calculateAndDisplayTax(int kodePajak, int persentasePajak) {
        double pajak = (double) kodePajak * persentasePajak / 100;
        displayResult("Pajak Kode " + kodePajak, "$" + String.format("%.2f", pajak));
    }
}
