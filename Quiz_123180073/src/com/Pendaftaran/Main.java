package com.Pendaftaran;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlah;
        String nama, nim;
        char kembali;
        double nilaiTesTulis, nilaiTesPraktekCoding, nilaiTesWawancara, nilaiMicroteaching, nilaiTesPraktekJaringan;

        try {
            do {
                System.out.println("PILIH MENU");
                System.out.println("1.Asisten Laboratorium");
                System.out.println("2.Admin Laboratorium");
                System.out.print("Pilih : ");
                int pilih = 0;
                pilih = scanner.nextInt();
                switch (pilih) {
                    case 1:
                        scanner = new Scanner(System.in);
                        System.out.println("Pendaftaran Asisten Laboratorium");
                        System.out.print("Berapa banyak jumlah pendaftar : ");
                        jumlah = scanner.nextInt();
                        Pendaftar[] pendaftarAsisten = new Pendaftar[jumlah];
                        for (int i = 0; i <= jumlah; i++) {
                            scanner = new Scanner(System.in);
                            System.out.println("Mahasiswa ke-" +( i+1));
                            System.out.print("Nama : ");
                            nama = scanner.nextLine();
                            System.out.print("Nim : ");
                            nim = scanner.nextLine();
                            try {
                                System.out.print("Nilai Tes Tulis :");
                                nilaiTesTulis = scanner.nextInt();
                                if (nilaiTesTulis < 0)
                                    throw new Exception();

                                System.out.print("Nilai Tes Praktik Coding :");
                                nilaiTesPraktekCoding = scanner.nextInt();
                                if (nilaiTesPraktekCoding < 0)
                                    throw new Exception();

                                System.out.print("Nilai Tes Wawancara :");
                                nilaiTesWawancara = scanner.nextInt();
                                if (nilaiTesWawancara < 0)
                                    throw new Exception();

                                System.out.print("Nilai Microteaching :");
                                nilaiMicroteaching = scanner.nextInt();
                                if (nilaiMicroteaching < 0)
                                    throw new Exception();
                                pendaftarAsisten[i] = new Pendaftar(nama, nim, nilaiTesTulis, nilaiTesPraktekCoding, nilaiTesWawancara, nilaiMicroteaching, "Asisten lab");
                                pendaftarAsisten[i].hitung();
                                pendaftarAsisten[i].cetak();
                            } catch (Exception e) {
                                System.out.println("Input Harus Bilangan Bulat dan Positif");
                            }
                        }
                        break;

                    case 2:
                        scanner = new Scanner(System.in);
                        System.out.println("Pendaftaran Asisten Laboratorium");
                        System.out.print("Berapa banyak jumlah pendaftar : ");
                        jumlah = scanner.nextInt();
                        Pendaftar[] pendaftarAdmin = new Pendaftar[jumlah];
                        for (int i = 0; i < jumlah; i++) {
                            scanner = new Scanner(System.in);
                            System.out.println("Mahasiswa ke-" + (i+1));
                            System.out.print("Nama : ");
                            nama = scanner.nextLine();
                            System.out.print("Nim : ");
                            nim = scanner.nextLine();
                            try {
                                System.out.print("Nilai Tes Tulis :");
                                nilaiTesTulis = scanner.nextInt();
                                if (nilaiTesTulis < 0)
                                    throw new Exception();

                                System.out.print("Nilai Tes Praktik Coding :");
                                nilaiTesPraktekCoding = scanner.nextInt();
                                if (nilaiTesPraktekCoding < 0)
                                    throw new Exception();

                                System.out.print("Nilai Tes Wawancara :");
                                nilaiTesWawancara = scanner.nextInt();
                                if (nilaiTesWawancara < 0)
                                    throw new Exception();

                                System.out.print("Nilai Tes Praktek Jaringan :");
                                nilaiTesPraktekJaringan = scanner.nextInt();
                                if (nilaiTesPraktekJaringan < 0)
                                    throw new Exception();
                                pendaftarAdmin[i] = new Pendaftar(nama, nim, nilaiTesTulis, nilaiTesPraktekCoding, nilaiTesWawancara, nilaiTesPraktekJaringan, "Admin Lab");
                                pendaftarAdmin[i].hitung();
                                pendaftarAdmin[i].cetak();
                            } catch (Exception e) {
                                System.out.println("Input Harus Bilangan Positif");
                            }
                        }
                        break;
                    default:
                        System.out.println("Menu Tidak Tersedia");
                        return;
                }
                System.out.print("Kembali ke menu (y/n) ? ");
                scanner=new Scanner(System.in);
                kembali=scanner.next().charAt(0);
                System.out.println("");
            }while (kembali=='y'||kembali=='Y');
        }
            catch (InputMismatchException e)
            {
                System.out.println("Silahkan Input Berupa Bilangan Bulat dan Positif");
            }
    }
}
