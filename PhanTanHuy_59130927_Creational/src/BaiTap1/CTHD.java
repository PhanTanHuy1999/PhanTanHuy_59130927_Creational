/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Admin
 */
public class CTHD {
    String MaSP;
    String TenSP;
    int SL;
    double dongia;
    float chietkhau;
    
    public CTHD(){
        
    }
    public CTHD(String MaSP, String TenSP, int SL,double dongia,float chietkhau){
        this.MaSP=MaSP;
        this.TenSP=TenSP;
        this.SL=SL;
        this.dongia=dongia;
        this.chietkhau=chietkhau;
        
    }
    public String getTenSP(){
        return TenSP;
    }
    public int getSL(){
        return SL;
    }
    public double getdongia(){
        return dongia;
    }
    public float getchietkhau(){
        return chietkhau;
    }
    public  void setMaSP(String MaSP){
        this.MaSP = MaSP;
    }
    public void setTenSP(String TenSP){
        this.TenSP=TenSP;
    }
    public void setdongia(double dongia){
        this.dongia=dongia;
    }
    public  void setSL(int SL){
        this.SL=SL;
        
    }
    public void setchietkhau(float chietkhau){
        this.chietkhau=chietkhau;
    }
    @Override
    public String toString(){
        return "CTHD{" + "MaSP=" + MaSP + ", TenSP=" + TenSP + ", SL=" + SL + ", dongia=" + dongia + " VND" +", chietkhau=" + chietkhau * 100 + "%" + '}';
    }
     
}

   
