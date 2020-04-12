/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import bai1.NhanVien;
/**
 *
 * @author Nguyen Tai Danh
 */
public class Bai2 {
     public static void main(String[] args) {
          QuanLyNhanVien Qlnv = new QuanLyNhanVien();
        
        NhanVien nhanVien1 = new NhanVien("Nguyễn Tài Danh",22,"Vĩnh Phước - Nha trang",6000000,250);
        NhanVien nhanVien2 = new NhanVien("Nguyễn Trùng Dương",27,"Tuy An - Phú Yên",10000000,190);
        NhanVien nhanVien3 = new NhanVien("Huỳnh Công Khang", 21, "Tây Hòa - Phú Yên", 4200000, 80);
        NhanVien nhanVien4 = new NhanVien("Phan Công Chí", 29, "Đông Hòa - Phú Yên", 3700000, 270);
        NhanVien nhanVien5 = new NhanVien("Lê Chí Tông", 30, "An Cư - Phú yên", 5000000, 300);
        
        Qlnv.themNhanVien(nhanVien1);
        Qlnv.themNhanVien(nhanVien2);
        Qlnv.themNhanVien(nhanVien3);
        Qlnv.themNhanVien(nhanVien4);
        Qlnv.themNhanVien(nhanVien5);
        Qlnv.inDanhSach();
     }
}
