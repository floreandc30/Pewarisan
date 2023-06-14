package com.Florean_Desvita_Cindirahayu.pbo.prjPewarisan_2132;

import java.util.Scanner;
public class Penduduk_2132
{
    Scanner input = new Scanner(System.in);
    private String nik2132;
    private String nama2132;
    private int umur2132;
    private String alamat2132;

    private String pekerjaan2132;

    public Penduduk_2132()
    {
        this.nik2132 = nik2132;
        this.nama2132 = nama2132;
        this.umur2132 = umur2132;
        this.alamat2132 = alamat2132;
        this.pekerjaan2132 = pekerjaan2132;
    }

    public void inputDataPenduduk_2132()
    {
        System.out.println("Masukkan NIK : ");
        nik2132 = input.nextLine();
        System.out.println("Masukkan Nama : ");
        nama2132 = input.nextLine();
        System.out.println("Masukkan Umur : ");
        umur2132 = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Pekerjaan : ");
        pekerjaan2132 = input.nextLine();
        System.out.println("Masukkan Alamat : ");
        alamat2132 = input.nextLine();
    }

    public void tampilkanDataPenduduk_2132()
    {
        System.out.println("NIK : " + nik2132);
        System.out.println("Nama : " + nama2132);
        System.out.println("Umur : " + umur2132);
        System.out.println("Pekerjaan : " + pekerjaan2132);
        System.out.println("Alamat : " + alamat2132);
    }

    public void setNik2132(String nik2132)
    {
        this.nik2132 = nik2132;
    }

    public String getNik2132()
    {
        return nik2132;
    }

    public void setNama2132(String nama2132)
    {
        this.nama2132 = nama2132;
    }

    public String getNama2132()
    {
        return nama2132;
    }

    public void setUmur2132(int umur2132)
    {
        this.umur2132 = umur2132;
    }

    public int getUmur2132()
    {
        return umur2132;
    }

    public void setAlamat2132(String alamat2132)
    {
        this.alamat2132 = alamat2132;
    }

    public String getAlamat2132()
    {
        return alamat2132;
    }

    public void setPeran2132(String peran2132)
    {
        this.pekerjaan2132 = pekerjaan2132;
    }

    public String getPeran2132()
    {
        return pekerjaan2132;
    }

}
