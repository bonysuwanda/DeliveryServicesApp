/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bony.dao;

/**
 *
 * @author user
 */

public class nomorPaket {
    public static String generateResiNumber(){
        String noResi = "";
        
        int code = (int) (Math.ceil(Math.random() * 1000000000) * 1);
        noResi += code;
        return noResi;
    }
}
