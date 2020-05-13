/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class BaiTap1_Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        
        // TODO code application logic here
        
        
        HoaDonHeader HDheader = new HoaDonHeader("HD001", new SimpleDateFormat("HH:mm:ss dd-MM-yyyy ")
                .parse("8:10:30 01-01-2020 "), "Phan Tấn Huy");
        CTHD cthd1 = new CTHD("ML001", "Máy giặc",1 ,5000000,0.1f);
        CTHD ctdh2 = new CTHD("TV001", "Ti Vi", 1, 4000000, 0.05f);
        CTHD cthd3 = new CTHD("ML333", "Máy lạnh", 1, 3000000, 0.4f);
        CTHD cthd4 = new CTHD("MT004", "Máy Tính", 1, 20000000, 0.7f);

       
               HoaDon HD = new HoaDon.Builder()
                .addHoaDonHeader(HDheader)
                .addCTHD(cthd1)
                .addCTHD(ctdh2)
                .addCTHD(cthd3)
                .addCTHD(cthd4)
                .build();
        System.out.println(HD.toString());       
    }
    
}
