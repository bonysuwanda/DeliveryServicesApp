/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.entity;

/**
 *
 * @author user
 */
public class Pengirim {

    private String namaPengirim;
    private String kota;
    private String alamatPengirim;
    private String kodePos;
    private String telefon;
    private String provinsi;

    /**
     * @return the nama
     */
    public String getNama() {
        return namaPengirim;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.namaPengirim = nama;
    }

    /**
     * @return the kotaAsal
     */
    public String getKotaAsal() {
        return kota;
    }

    /**
     * @param kotaAsal the kotaAsal to set
     */
    public void setKotaAsal(String kotaAsal) {
        this.kota = kotaAsal;
    }

    /**
     * @return the alamatPengirim
     */
    public String getAlamatPengirim() {
        return alamatPengirim;
    }

    /**
     * @param alamatPengirim the alamatPengirim to set
     */
    public void setAlamatPengirim(String alamatPengirim) {
        this.alamatPengirim = alamatPengirim;
    }

    /**
     * @return the kodePos
     */
    public String getKodePos() {
        return kodePos;
    }

    /**
     * @param kodePos the kodePos to set
     */
    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

}
