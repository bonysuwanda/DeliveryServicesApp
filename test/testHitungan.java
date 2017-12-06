/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bony.dao.hitungPaketDAO;
import com.bony.entity.DetailPengiriman;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class testHitungan {
    
    public testHitungan() {
    }
    
    @Test
    public void cekHargaPaket(){
        DetailPengiriman detail = new DetailPengiriman();
        detail.setAsuransi(true);
        detail.setBeratPaket(4);
        detail.setJasaPengiriman("reguler");
        detail.setKotaTujuan("Timika");
        detail.setHargaPaket(5000000.0);
        
        hitungPaketDAO dao = new hitungPaketDAO();
        double total = dao.hitungBiaya(detail);
        double expected = 180000.0;
        assertEquals(expected, total,100);
        
        
    }
  
}
