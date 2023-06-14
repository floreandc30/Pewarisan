package com.Florean_Desvita_Cindirahayu.pbo.prjPewarisan_2132;

public class Dokter_2132 extends Penduduk_2132
{
    private int jmlPasien2132;
    private int jmlObat2132;
    private double totalPendapatan2132;

    public Dokter_2132()
    {
        this.jmlPasien2132 = jmlPasien2132;
        this.jmlObat2132 = jmlObat2132;
        this.totalPendapatan2132 = totalPendapatan2132;
    }


    public void inputDataDokter_2132()
    {
        super.inputDataPenduduk_2132();
        System.out.println("Masukkan Jumlah Pasien : ");
        jmlPasien2132 = input.nextInt();
        System.out.println("Masukkan Jumlah Obat : ");
        jmlObat2132 = input.nextInt();
    }

    public void tampilkanDataDokter_2132()
    {
        super.tampilkanDataPenduduk_2132();
        System.out.println("Jumlah Pasien : " + jmlPasien2132 + " Orang");
        System.out.println("Jumlah Obat : " + jmlObat2132 + " Bungkus");
        totalPendapatan2132 = (jmlPasien2132 * 50000) + (jmlObat2132 * 10000);
        System.out.println("Total Pendapatan : Rp." + totalPendapatan2132);
    }

    public void setJmlPasien2132(int jmlPasien2132)
    {
        this.jmlPasien2132 = jmlPasien2132;
    }

    public int getJmlPasien2132()
    {
        return jmlPasien2132;
    }

    public void setJmlObat2132(int jmlObat2132)
    {
        this.jmlObat2132 = jmlObat2132;
    }

    public int getJmlObat2132()
    {
        return jmlObat2132;
    }

    public void setTotalPendapatan2132(double totalPendapatan2132)
    {
        this.totalPendapatan2132 = totalPendapatan2132;
    }

    public double getTotalPendapatan2132()
    {
        return totalPendapatan2132;
    }
}