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
        NhanVien nhanvien = new NhanVien("Nguyễn Tài Danh",22,"Vĩnh Phước - Nha Trang",2000000,190);
        NhanVien nhanvien1 = new NhanVien("Nguyễn Hải",26,"Tuy an - Phú yên",2000000,300);
        
        System.out.println(nhanvien.getThongTin() + "Tiền thưởng: " + nhanvien.tinhTienThuong() +"\n");
        System.out.println(nhanvien1.getThongTin() + "Tiền thưởng: " + nhanvien1.tinhTienThuong());
    }
}