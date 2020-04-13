/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author Nguyen Tai Danh
 */
public class Bai4 {
    public static void main(String[] args) {
        ChuyenNgoaiThanh cnt1 = new ChuyenNgoaiThanh("Tuy An - Phú Yên",32, "199901", "Nguyễn Tài Danh", "01", 300000);
        ChuyenNgoaiThanh cnt2 = new ChuyenNgoaiThanh("An Dân - Phú Yên",28, "199902", "Nguyễn Tuấn Tài", "02", 450000);
        ChuyenNgoaiThanh cnt3 = new ChuyenNgoaiThanh("Tuy Hòa - Phú Yên",26, "199903", "Nguyễn Trung Dương", "03", 200000);
        ChuyenNoiThanh cNT1 = new ChuyenNoiThanh(13 ,300, "199904", "Nguyễn Trung Dương", "04", 250000);
        ChuyenNoiThanh cNT2 = new ChuyenNoiThanh(14 ,310, "199905", "Nguyễn Hải", "05", 350000);
        ChuyenNoiThanh cNT3 = new ChuyenNoiThanh(15 ,320, "199906", "Nguyễn Trường", "06", 100000);

        QuanLyChuyenXe Qlcx = new QuanLyChuyenXe();
        Qlcx.themChuyenXe(cnt1);
        Qlcx.themChuyenXe(cnt2);
        Qlcx.themChuyenXe(cnt3);
        Qlcx.themChuyenXe(cNT1);
        Qlcx.themChuyenXe(cNT2);
        Qlcx.themChuyenXe(cNT3);
        Qlcx.inDanhSach();
        System.out.println("Tổng doanh thu xe ngoại thành: " + Qlcx.doanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: " + Qlcx.doanhThuNoiThanh());
        System.out.println("Tổng doanh thu của 2 loại xe: " + Qlcx.tongDoanhthu());
    }
}
