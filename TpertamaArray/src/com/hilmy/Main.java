package com.hilmy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String orang;
        float mean,jumlah=0;
        int max,min;
        int angka[]=new int[5];

        Scanner userName=new Scanner(System.in);
        Scanner nilaiUser=new Scanner(System.in);
        System.out.print("Nama : ");
        orang=userName.nextLine();
        for (int i=0; i<5; i++)
        {
            System.out.print("Nilai ke-"+ (i+1)+ " : ");
            angka[i]=nilaiUser.nextInt();
            jumlah=jumlah+angka[i];
        }
        max=angka[0];
        min=angka[0];
        for (int i=0; i<5; i++)
        {
            if(angka[i] > max){
                max = angka[i];
            }
            else if(angka[i] < min){
                min = angka[i];
            }
        }
        mean=jumlah/5;
        System.out.println("Nama:"+orang);
        System.out.println("Nilai Tertinggi: "+max);
        System.out.println("Nilai Terendah: "+min);
        System.out.println("Rata+rata Nilai: "+mean);

    }
}
