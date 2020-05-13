/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Admin
 */
public class BaiTap2_Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        MyStringBuilder mystringbuilder = new MyStringBuilder.Builder()
            .addString("Tên: Phan Tấn Huy "
                    + "MSSV: 59130927 Điểm: ")
                
                
            .addFloat(0.7f)
            .addString("Giới tính: ")
            .addBool(true)
            .build();
        
        System.out.println(mystringbuilder.toString());
    }             
}
    

