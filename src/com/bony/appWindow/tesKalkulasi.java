/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.appWindow;

import com.bony.dao.hitungPaketDAO;
import com.bony.entity.DetailPengiriman;

/**
 *
 * @author user
 */
public class tesKalkulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DetailPengiriman detail = new DetailPengiriman();
        detail.setAsuransi(true);
        detail.setBeratPaket(2.0);
        detail.setJasaPengiriman("Reguler");
        detail.setKotaTujuan("semarang");
        detail.setHargaPaket(200000.0);
        
        hitungPaketDAO hitung = new hitungPaketDAO();
        double total = hitung.hitungBiaya(detail);
        
        System.out.println("Biaya Pengiriman Ke : " +detail.getKotaTujuan() + " sebesar : " +total);
        
    }
    
}
