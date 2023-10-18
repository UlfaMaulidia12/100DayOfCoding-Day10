package ProgramTipeDataBoolean;

import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Kalkulator Pajak ===");

            double pendapatanTahunan = getInputDouble("Masukkan Pendapatan Tahunan\t: $");
            double batasPendapatan = getInputDouble("Masukkan Batas Pendapatan untuk Pajak: $");

            System.out.println("=======================================");

            if (isValidInput(pendapatanTahunan, batasPendapatan)) {
                boolean harusBayarPajak = pendapatanTahunan > batasPendapatan;

                System.out.println("Pendapatan Tahunan \t\t: $" + pendapatanTahunan);
                System.out.println("Batas Pendapatan untuk Pajak \t: $" + batasPendapatan);
                System.out.println("=======================================");

                if (harusBayarPajak) {
                    System.out.println("Anda harus membayar pajak.");
                } else {
                    System.out.println("Anda tidak harus membayar pajak.");
                }
            }

            ulangi = getYesNoInput("Hitung pajak lagi? (Y/N): ");
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }

    private static double getInputDouble(String message) {
        Scanner input = new Scanner(System.in);
        double value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(message);
                value = input.nextDouble();
                if (value < 0) {
                    System.out.println("Input tidak valid. Harus lebih dari atau sama dengan nol.");
                } else {
                    valid = true;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka desimal yang benar.");
                input.nextLine(); // Bersihkan buffer input
            }
        }
        return value;
    }

    private static boolean isValidInput(double pendapatanTahunan, double batasPendapatan) {
        if (pendapatanTahunan < 0 || batasPendapatan < 0) {
            System.out.println("Input tidak valid. Pendapatan dan batas pendapatan harus lebih dari atau sama dengan nol.");
            return false;
        }
        return true;
    }

    private static char getYesNoInput(String message) {
        Scanner input = new Scanner(System.in);
        char response;
        while (true) {
            System.out.print(message);
            response = input.next().charAt(0);
            if (response == 'Y' || response == 'y' || response == 'N' || response == 'n') {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Masukkan 'Y' atau 'N'.");
            }
        }
        return response;
    }
}
