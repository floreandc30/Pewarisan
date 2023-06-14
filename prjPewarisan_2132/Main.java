package com.Florean_Desvita_Cindirahayu.pbo.prjPewarisan_2132;

public class Main
{
    public static void main(String[] args)
    {
        Nelayan_2132[] nelayan = new Nelayan_2132[2];
        Dokter_2132[] dokter = new Dokter_2132[2];

        for (int i = 0; i < nelayan.length; i++)
        {
            nelayan[i] = new Nelayan_2132();
            System.out.println("=== " + " Masukkan Data Nelayan " + + (i + 1) + " ===");
            nelayan[i].inputDataNelayan_2132();
            System.out.println();


        }

        for (int i = 0; i < dokter.length; i++)
        {
            dokter[i] = new Dokter_2132();
            System.out.println("=== " + " Masukkan Data Dokter " + + (i + 1) + " ===");
            dokter[i].inputDataDokter_2132();
            System.out.println();
        }

        System.out.println("=== Data Nelayan ===");
        nelayan[0].tampilkanDataNelayan_2132();
        System.out.println();
        nelayan[1].tampilkanDataNelayan_2132();
        System.out.println();

        System.out.println("=== Data Dokter ===");
        dokter[0].tampilkanDataDokter_2132();
        System.out.println();
        dokter[1].tampilkanDataDokter_2132();
        System.out.println();

    }
}