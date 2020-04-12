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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nhanvien = new NhanVien();
        nhanvien.ten = "Danh";
        nhanvien.tuoi = 22;
        nhanvien.diaChi = "Vĩnh Phước-Nha Trang";
        nhanvien.tienLuong = 2000;
        nhanvien.tongGio = 190;
        System.out.println(nhanvien.getThongTin());
        System.out.println("Tiền thưởng: "nhanvien.tinhTienThuong());
}