package ProgramLiterals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PajakPendapatanTahunan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Kalkulator Pajak Pendapatan Tahunan ===");

            double pendapatanTahunanDecimal = getInputDouble("Masukkan Pendapatan Tahunan (Desimal)\t: $");
            double tarifPajak = getInputDoubleWithRange("Masukkan Tarif Pajak (Persentase)\t: ", 0, 100);

            System.out.println("======================================="); // Garis pemisah

            if (pendapatanTahunanDecimal >= 0) {
                double tarifPajakDecimal = tarifPajak / 100;
                double jumlahPajakDecimal = calculateTax(pendapatanTahunanDecimal, tarifPajakDecimal);

                DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

                // Menampilkan hasil perhitungan dengan dua angka desimal
                System.out.println("Pendapatan Tahunan (Desimal)\t: $" + decimalFormat.format(pendapatanTahunanDecimal));
                System.out.println("Tarif Pajak (Persentase)\t: " + tarifPajak + "%");
                System.out.println("Jumlah Pajak (Desimal)\t: $" + decimalFormat.format(jumlahPajakDecimal));
            }

            System.out.println("======================================="); // Garis pemisah

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
                valid = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka desimal yang benar.");
                input.nextLine(); // Bersihkan buffer input
            }
        }
        return value;
    }

    private static double getInputDoubleWithRange(String message, double minValue, double maxValue) {
        double value;
        do {
            value = getInputDouble(message);
            if (value < minValue || value > maxValue) {
                System.out.println("Input tidak valid. Masukkan angka dalam rentang " + minValue + " hingga " + maxValue + ".");
            }
        } while (value < minValue || value > maxValue);
        return value;
    }

    private static double calculateTax(double pendapatan, double tarif) {
        return pendapatan * tarif;
    }

    private static char getYesNoInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        char response = input.next().charAt(0);
        return response;
    }
}
