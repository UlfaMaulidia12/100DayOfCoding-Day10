package ProgramMenampilkanIdentitasdanMenghitungBangunDatar;

import java.util.Scanner;

public class NilaiMinMax2Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama (a): ");
        double a = input.nextDouble();

        System.out.print("Masukkan bilangan kedua (b): ");
        double b = input.nextDouble();

        double min = Math.min(a, b);
        double max = Math.max(a, b);

        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);

        input.close();
    }
    
}
