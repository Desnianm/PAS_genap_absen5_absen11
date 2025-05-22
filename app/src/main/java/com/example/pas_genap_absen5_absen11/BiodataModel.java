package com.example.pas_genap_absen5_absen11;



public class BiodataModel {
    private String namaLengkap;
    private String namaPanggilan;
    private String absen;
    private String peran;
    private String email;
    private String noHp;

    public BiodataModel(String namaLengkap, String namaPanggilan, String absen, String peran, String email, String noHp) {
        this.namaLengkap = namaLengkap;
        this.namaPanggilan = namaPanggilan;
        this.absen = absen;
        this.peran = peran;
        this.email = email;
        this.noHp = noHp;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getNamaPanggilan() {
        return namaPanggilan;
    }

    public String getAbsen() {
        return absen;
    }

    public String getPeran() {
        return peran;
    }

    public String getEmail() {
        return email;
    }

    public String getNoHp() {
        return noHp;
    }
}

