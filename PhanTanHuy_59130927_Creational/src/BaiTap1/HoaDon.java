/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;


import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon {
    HoaDonHeader HDheader ;
     ArrayList<CTHD> ds = new ArrayList<>();
     
     public HoaDon(){
         
     }
     protected HoaDon(Builder builder){
         this.HDheader = builder.HDheader;
         this.ds = builder.ds ;
     }
     public static class Builder{
         ArrayList<CTHD> ds;
         HoaDonHeader HDheader;
         public Builder(){
             
         }
         public Builder(HoaDonHeader hoadonHeader){
             this.HDheader = this.HDheader ;
         }
         public Builder addHoaDonHeader(HoaDonHeader hoadonheader){
             this.HDheader = this.HDheader ;
             return this ;
         }
         public Builder addCTHD(CTHD cthd){
             this.ds.add(cthd);
             return this;
         }
         public  HoaDon build(){
             return new HoaDon(this);
         }
         @Override
         public String toString(){
             String s = HDheader.toString();
        
         return s; }
     }
     
}
