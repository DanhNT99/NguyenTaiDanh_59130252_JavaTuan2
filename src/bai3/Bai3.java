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
public class Bai3 {
    public static void main(String[] args) {
        SinhVienIT Svit = new SinhVienIT(5,8,7,"Nguyễn Tài Danh","Sinh viênIT");
        System.out.println(Svit.xuat());
        SinhVienBiz Svb = new SinhVienBiz(9,8,"Nguyễn Chí Tài","Sinh viên Biz");
        System.out.println(Svb.xuat());
    }
}
