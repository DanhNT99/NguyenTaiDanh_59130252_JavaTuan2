/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Nguyen Tai Danh
 */
public class NhanVien {
    public String ten;
    public int tuoi;
    public String diaChi;
   public double tienLuong;
   public int tongGio;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGio) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGio = tongGio;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public int getTongGio() {
        return tongGio;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setTongGio(int tongGio) {
        this.tongGio = tongGio;
    }
    
   public String getThongTin(){
      return "ten: " + ten +"\n"
             + "tuoi: " + tuoi + "\n"
             + "diaChi: " + diaChi + "\n"
             + "tienLuong: " + tienLuong + "\n"
             + "tongGioLam: " + tongGio + "\n";
   }
    public double tinhTienThuong(){
        double tienThuong;
        if(tongGio >= 200)
            tienThuong = tienLuong * 20 / 100;
        else if(tongGio < 200 || tongGio >= 100)
            tienThuong = tienLuong * 10 / 100;
        else 
            tienThuong = 0;
        return tienThuong;
    }  
}