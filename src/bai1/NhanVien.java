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
   public String getThongTin(){
       System.out.println("Tên: " + ten);
       System.out.println("Tuổi: " + tuoi);
       System.out.println("Địa chỉ: " + diaChi);
       System.out.println("Tiền lương: " + diaChi);
       System.out.println("Tổng giờ: " + tongGio);
        return null;
   }
    @SuppressWarnings("empty-statement")
   public double tinhThuong(){
        if(tongGio >= 200){
            System.out.println("Tien thuong: " + tienLuong * 20/100);
        }
        if(tongGio < 200 && tongGio >= 100){
           System.out.println("Tien thuong: " + tienLuong * 10/100);
        }
        if(tongGio < 100){
                System.out.println("Tien thuong: " + 0 * tienLuong);
        }
}
