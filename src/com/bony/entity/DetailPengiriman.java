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
public class DetailPengiriman {

    private String kotaTujuan;
    private String tipePaket;
    private String jasaPengiriman;
    private double beratPaket;
    private boolean asuransi;
    private double hargaPaket;
    
    /**
     * @return the kotaTujuan
     */
    public String getKotaTujuan() {
        return kotaTujuan;
    }

    /**
     * @param kotaTujuan the kotaTujuan to set
     */
    public void setKotaTujuan(String kotaTujuan) {
        this.kotaTujuan = kotaTujuan;
    }

    /**
     * @return the tipePaket
     */
    public String getTipePaket() {
        return tipePaket;
    }

    /**
     * @param tipePaket the tipePaket to set
     */
    public void setTipePaket(String tipePaket) {
        this.tipePaket = tipePaket;
    }

    /**
     * @return the beratPaket
     */
    public double getBeratPaket() {
        return beratPaket;
    }

    /**
     * @param beratPaket the beratPaket to set
     */
    public void setBeratPaket(double beratPaket) {
        this.beratPaket = beratPaket;
    }

    /**
     * @return the asuransi
     */
    public boolean isAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the hargaPaket
     */
    public double getHargaPaket() {
        return hargaPaket;
    }

    /**
     * @param hargaPaket the hargaPaket to set
     */
    public void setHargaPaket(double hargaPaket) {
        this.hargaPaket = hargaPaket;
    }

    /**
     * @return the jasaPengiriman
     */
    public String getJasaPengiriman() {
        return jasaPengiriman;
    }

    /**
     * @param jasaPengiriman the jasaPengiriman to set
     */
    public void setJasaPengiriman(String jasaPengiriman) {
        this.jasaPengiriman = jasaPengiriman;
    }
    
}
