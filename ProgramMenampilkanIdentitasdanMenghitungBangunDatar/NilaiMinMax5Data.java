package ProgramMenampilkanIdentitasdanMenghitungBangunDatar;

import java.util.Scanner;

public class NilaiMinMax5Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan a: ");
        double a = input.nextDouble();

        System.out.print("Masukkan bilangan b: ");
        double b = input.nextDouble();

        System.out.print("Masukkan bilangan c: ");
        double c = input.nextDouble();

        System.out.print("Masukkan bilangan d: ");
        double d = input.nextDouble();

        System.out.print("Masukkan bilangan e: ");
        double e = input.nextDouble();

        double min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        double max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);

        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);

        input.close();
    }
}
