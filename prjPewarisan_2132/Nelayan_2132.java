package com.Florean_Desvita_Cindirahayu.pbo.prjPewarisan_2132;

public class Nelayan_2132 extends Penduduk_2132
{
    private int jmlBeratIkan2132;
    private int jmlSolar2132;
    private double totalPendapatan2132;

    public Nelayan_2132()
    {
        this.jmlBeratIkan2132 = jmlBeratIkan2132;
        this.jmlSolar2132 = jmlSolar2132;
        this.totalPendapatan2132 = totalPendapatan2132;
    }

    public void inputDataNelayan_2132()
    {
        super.inputDataPenduduk_2132();
        System.out.println("Masukkan Jumlah Berat Ikan : ");
        jmlBeratIkan2132 = input.nextInt();
        System.out.println("Masukkan Jumlah Solar : ");
        jmlSolar2132 = input.nextInt();
    }

    public void tampilkanDataNelayan_2132()
    {
        super.tampilkanDataPenduduk_2132();
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan2132 + " Kg");
        System.out.println("Jumlah Solar : " + jmlSolar2132 + " Liter");
        totalPendapatan2132 = (jmlBeratIkan2132 * 8000) - (jmlSolar2132 * 10000);
        System.out.println("Total Pendapatan : Rp." + totalPendapatan2132);
    }

    public void setJmlBeratIkan2132(int jmlBeratIkan2132)
    {
        this.jmlBeratIkan2132 = jmlBeratIkan2132;
    }

    public int getJmlBeratIkan2132()
    {
        return jmlBeratIkan2132;
    }

    public void setJmlSolar2132(int jmlSolar2132)
    {
        this.jmlSolar2132 = jmlSolar2132;
    }

    public int getJmlSolar2132()
    {
        return jmlSolar2132;
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
