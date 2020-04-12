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
public class QuanLyNhanVien implements IQuanLy{
    NhanVien[] nv = new NhanVien[100];
    int count = 0;
    @Override
    public void themNhanVien(NhanVien ds) {
        nv[count] = new NhanVien();
        nv[count] = ds;
        count ++;
    }
    @Override
    public Void inDanhSach() {
        for(int i = 0; i <  count; i++){
            System.out.println(nv[i].getThongTin());
        }
        return null;
    }   
}
