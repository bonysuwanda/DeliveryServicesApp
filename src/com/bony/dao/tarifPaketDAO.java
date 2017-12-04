/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.dao;

import com.bony.entity.DataPaket;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class tarifPaketDAO {
    
    public static List<DataPaket> getKotaTujuan(){
        List<DataPaket> penerimaList = new ArrayList<>();
        try{
            Scanner scan = new Scanner(new File("E:/DataPaket.txt"));
            
            while (scan.hasNextLine()){
                DataPaket penerima = new DataPaket();
                String line = scan.nextLine();
                String[] data = line.split(",");
                
                String tujuan = data[0];
                penerima.setTujuanPengiriman(tujuan);
                
                penerima.setRegulerServices(Double.parseDouble(data[1]));
                penerima.setKilatServices(Double.parseDouble(data[2]));
                penerima.setSameDayServices(Double.parseDouble(data[3]));
                penerima.setOneNightServices(Double.parseDouble(data[4]));
                penerima.setHolidayServices(Double.parseDouble(data[5]));
                
                penerimaList.add(penerima);               
            }
        }catch (FileNotFoundException Ex){
            System.out.println("Data Tidak Ada");
        }
        return penerimaList;
    } 
    
}
