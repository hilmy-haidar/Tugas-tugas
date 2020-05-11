package com.Pendaftaran;

public class Pendaftar extends Mahasiswa implements IPendaftar {
    private double nilaiTesTulis;
    private double nilaiTesPraktekCoding;
    private double nilaiTesWawancara;
    private double nilaiTesGabungan;
    private double nilaiAkhir;
    private String bagian;

    public Pendaftar(String nama, String nim, double nilaiTesTulis, double nilaiTesPraktekCoding, double nilaiTesWawancara, double nilaiTesGabungan, String bagian) {
        super(nama, nim);
        this.nilaiTesTulis = nilaiTesTulis;
        this.nilaiTesPraktekCoding = nilaiTesPraktekCoding;
        this.nilaiTesWawancara = nilaiTesWawancara;
        this.nilaiTesGabungan = nilaiTesGabungan;
        this.bagian = bagian;
    }

    @Override
    public void hitung() {
        nilaiAkhir = (nilaiTesTulis+nilaiTesPraktekCoding+nilaiTesWawancara+ nilaiTesGabungan)/4;
    }

    @Override
    public void cetak() {
        System.out.printf("Nilai Akhir : %.0f \n", nilaiAkhir);
        if (nilaiAkhir > 85){
            System.out.println("KETERANGAN : DITERIMA");
            System.out.println("Selamat kepada " + super.getNama() + " telah diterima sebagai " + bagian);
        } else {
            System.out.println("KETERANGAN : GAGAL");
            System.out.println("Mohon maaf kepada " + super.getNama() + " telah ditolak sebagai " + bagian);
        }
    }
}