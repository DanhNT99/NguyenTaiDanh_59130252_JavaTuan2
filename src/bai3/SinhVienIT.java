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
public class SinhVienIT extends SinhVienPoLy{
    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT() {
    }

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }
    public double getDiemJava() {
        return diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemJava(float diemJava) {
        this.diemJava = diemJava;
    }

    public void setDiemCss(float diemCss) {
        this.diemCss = diemCss;
    }

    public void setDiemHtml(float diemHtml) {
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss)/4;
    }
    
}
