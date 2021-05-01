package com.example.mydeliciousrecipe;

public class Resep {
    private String id;
    private String nama;
    private String lama;
    private String orang;
    private String bahan;
    private String cara;
    private int gambar;

    public Resep(String id, String nama, String lama, String orang, String bahan, String cara, int gambar) {
        this.id = id;
        this.nama = nama;
        this.lama = lama;
        this.orang = orang;
        this.bahan = bahan;
        this.cara = cara;
        this.gambar = gambar;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getLama() {
        return lama;
    }

    public String getOrang() {
        return orang;
    }

    public String getBahan() {
        return bahan;
    }

    public String getCara() {
        return cara;
    }

    public int getGambar(){
        return gambar;
    }
}
