/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDonHeader {
    String MaHD;
    Date ngayban;
    String TenKH;
    
    
    public HoaDonHeader(){
    }
    public HoaDonHeader(String MaHD, Date ngayban, String TenKH){
        this.MaHD = MaHD;
        this.ngayban = ngayban;
        this.TenKH = TenKH;
    }
    public  String getMaHD(){
        return MaHD;
    }
    public Date getngayban(){
        return ngayban;
    }
    public String getTenKH(){
        return TenKH;
    }
    public  void setTenKH(String TenKH){
        this.TenKH = TenKH;
    }
    public  void setMaHD(String MaKH){
        this.MaHD = MaHD;
    }
    public void setngayban(Date ngayban){
        this.ngayban=ngayban;
    }
    @Override
    public String toString(){
        return "HoaDonHeader{" + "MaHD=" + MaHD + ", ngayBan=" + ngayban + ", tenKH=" + TenKH + '}';
    }    
    
}

    
    
    

