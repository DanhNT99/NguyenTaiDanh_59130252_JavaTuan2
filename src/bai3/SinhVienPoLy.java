/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Nguyen Tai Danh
 */
public class SinhVienPoLy {
    public String hoTen;
    public String nganh;

    public SinhVienPoLy() {
    }

    public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc(){
        String hocLuc = "";
        if(getDiem() < 5)
             hocLuc  = "Yếu";
        else
            if(getDiem() >= 5 && getDiem() <= 6.5)
                hocLuc = "Trung bình";
        else
            if(getDiem() >= 6.5 && getDiem() <= 7.5)
                hocLuc = "Trung bình";
         else
           if(getDiem() >= 7.5 && getDiem() <= 9)
              hocLuc = "Giỏi";
        else
           if(getDiem() >= 9 )
               hocLuc = "Xuất sắc";
       return hocLuc;
    }
    public String xuat(){
        return "Tên sinh viên: " + hoTen +"\n"
             + "Ngành: " + nganh + "\n"
             + "Điểm trung bình: " + getDiem() + "\n"
             + "Học lực: " + getHocLuc() + "\n";
    }
    
}
