/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.dao;

import com.bony.entity.DataPaket;
import com.bony.entity.DetailPengiriman;
import java.util.List;

/**
 *
 * @author user
 */
public class hitungPaketDAO {

    final double asuransi = 0.003;

    public double hitungBiaya(DetailPengiriman detail) {
        double total = 0.0;

        double hargaPengiriman;
        double berat = detail.getBeratPaket();
        double harga = detail.getHargaPaket();

        List<DataPaket> hargaPaket = tarifPaketDAO.getKotaTujuan();

        for (DataPaket dataPaket : hargaPaket) {

            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("Reguler")) {
                    hargaPengiriman = dataPaket.getRegulerServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);
                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }

            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("Kilat")) {
                    hargaPengiriman = dataPaket.getKilatServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);
                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }

            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("SDS")) {
                    hargaPengiriman = dataPaket.getSameDayServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);
                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }

            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("ONS")) {
                    hargaPengiriman = dataPaket.getOneNightServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);
                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }
            if (dataPaket.getTujuanPengiriman().equalsIgnoreCase(detail.getKotaTujuan())) {
                if (detail.getJasaPengiriman().equalsIgnoreCase("HDS")) {
                    hargaPengiriman = dataPaket.getHolidayServices();
                    if (detail.isAsuransi()) {
                        total = (hargaPengiriman * berat) + (harga * asuransi);
                    } else {
                        total = hargaPengiriman * berat;
                    }
                }
            }

        }

        return total;
    }

}
