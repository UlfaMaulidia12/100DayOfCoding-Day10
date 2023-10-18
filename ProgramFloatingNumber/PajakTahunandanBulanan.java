package ProgramFloatingNumber;

import java.util.Scanner;

public class PajakTahunandanBulanan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char ulangi;
            do {
                System.out.println("=== Kalkulator Pajak ===");
                double pendapatanTahunan = getInput("Masukkan Pendapatan Tahunan: $");
                double tarifPajak = getInput("Masukkan Tarif Pajak Tahunan (%): ");
                double jumlahPajakTahunan = calculateTax(pendapatanTahunan, tarifPajak);
                double pendapatanBulanan = pendapatanTahunan / 12;
                double tarifPajakBulanan = tarifPajak / 12;
                double jumlahPajakBulanan = calculateTax(pendapatanBulanan, tarifPajakBulanan);
                
                System.out.println("\n=== Hasil Perhitungan Pajak ===");
                displayResult("Pendapatan Tahunan", String.format("$%.2f", pendapatanTahunan));
                displayResult("Tarif Pajak Tahunan", String.format("%.2f%%", tarifPajak));
                displayResult("Pajak Tahunan", String.format("$%.2f", jumlahPajakTahunan));
                displayResult("Pendapatan Bulanan", String.format("$%.2f", pendapatanBulanan));
                displayResult("Tarif Pajak Bulanan", String.format("%.2f%%", tarifPajakBulanan));
                displayResult("Pajak Bulanan", String.format("$%.2f", jumlahPajakBulanan));
                
                ulangi = getYesNoInput("Hitung pajak lagi? (Y/N): ");
            } while (ulangi == 'Y' || ulangi == 'y');
        }
    }

    private static double getInput(String message) {
        Scanner input = new Scanner(System.in);
        double value = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(message);
                if (input.hasNextDouble()) {
                    value = input.nextDouble();
                    if (value >= 0) {
                        validInput = true;
                    } else {
                        System.out.println("Masukkan angka positif.");
                    }
                } else {
                    System.out.println("Input tidak valid. Pastikan Anda memasukkan angka yang benar.");
                    input.next(); // Bersihkan input yang tidak valid
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Pastikan Anda memasukkan angka yang benar.");
                input.next(); // Bersihkan input yang tidak valid
            }
        }
        return value;
    }

    private static double calculateTax(double pendapatan, double tarif) {
        return pendapatan * tarif / 100;
    }

    private static void displayResult(String label, String value) {
        System.out.println(label + ": " + value);
    }

    private static char getYesNoInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        String response = input.nextLine().trim();
        if (response.length() > 0)
            return response.charAt(0);
        return 0;
    }
}
