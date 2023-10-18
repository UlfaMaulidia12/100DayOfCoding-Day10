package ProgramMenampilkanIdentitasdanMenghitungBangunDatar;

import java.util.Scanner;

public class MenghitungLuasdanKelilingBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih bentuk bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Layang-layang");
        System.out.println("7. Belah Ketupat");
        System.out.println("8. Lingkaran");
        System.out.print("Masukkan nomor pilihan: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                calculateSquare(input);
                break;
            case 2:
                calculateRectangle(input);
                break;
            case 3:
                calculateTriangle(input);
                break;
            case 4:
                calculateParallelogram(input);
                break;
            case 5:
                calculateTrapezoid(input);
                break;
            case 6:
                calculateRhombus(input);
                break;
            case 7:
                calculateKite(input);
                break;
            case 8:
                calculateCircle(input);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }

    private static void calculateSquare(Scanner input) {
        System.out.print("Masukkan panjang sisi: ");
        double side = input.nextDouble();

        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("Luas: " + area);
        System.out.println("Keliling: " + perimeter);
    }

    private static void calculateRectangle(Scanner input) {
        System.out.print("Masukkan panjang: ");
        double length = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Luas: " + area);
        System.out.println("Keliling: " + perimeter);
    }

    private static void calculateTriangle(Scanner input) {
        System.out.print("Masukkan alas: ");
        double base = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();

        System.out.print("Masukkan sisi pertama: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan sisi kedua: ");
        double side2 = input.nextDouble();

        System.out.print("Masukkan sisi ketiga: ");
        double side3 = input.nextDouble();

        double area = 0.5 * base * height;
        double perimeter = side1 + side2 + side3;

        System.out.println("Luas: " + area);
        System.out.println("Keliling: " + perimeter);
    }

    private static void calculateParallelogram(Scanner input) {
        System.out.print("Masukkan alas: ");
        double base = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();

        System.out.print("Masukkan sisi: ");
        double side = input.nextDouble();

        double area = base * height;
        double perimeter = 2 * (base + side);

        System.out.println("Luas: " + area);
        System.out.println("Keliling: " + perimeter);
    }

    private static void calculateTrapezoid(Scanner input) {
        System.out.print("Masukkan panjang sisi atas: ");
        double top = input.nextDouble();

        System.out.print("Masukkan panjang sisi bawah: ");
        double bottom = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();

        System.out.print("Masukkan sisi kiri: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan sisi kanan: ");
        double side2 = input.nextDouble();

        double area = 0.5 * (top + bottom) * height;
        double perimeter = top + bottom + side1 + side2;

        System.out.println("Luas: " + area);
        System.out.println("Keliling: " + perimeter);
    }

    private static void calculateRhombus(Scanner input) {
        System.out.print("Masukkan panjang diagonal 1: ");
        double diagonal1 = input.nextDouble();

        System.out.print("Masukkan panjang diagonal 2: ");
        double diagonal2 = input.nextDouble();

        System.out.print("Masukkan panjang sisi: ");
        double side = input.nextDouble();

        double area = 0.5 * diagonal1 * diagonal2;
        double perimeter = 4 * side;

        System.out.println("Luas: " + area);
        System.out.println("Keliling: " + perimeter);
    }

    private static void calculateKite(Scanner input) {
        System.out.print("Masukkan panjang diagonal 1: ");
        double diagonal1 = input.nextDouble();

        System.out.print("Masukkan panjang diagonal 2: ");
        double diagonal2 = input.nextDouble();

        System.out.print("Masukkan panjang sisi 1: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan panjang sisi 2: ");
        double side2 = input.nextDouble();

        double area = 0.5 * diagonal1 * diagonal2;
        double perimeter = 2 * (side1 + side2);

        System.out.println("Luas: " + area);
        System.out.println("Keliling: " + perimeter);
    }

    private static void calculateCircle(Scanner input) {
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Luas: " + area);
        System.out.println("Keliling: " + circumference);
    }
}

