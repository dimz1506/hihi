/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai50;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Canbo extends person{
    private String phongban;
    private double hesoluong;
    private double luongcoban;
    private double thuong;
    private double phat;

    public Canbo() {
    }
     private static final List<String> PHONGBANCHOICES = Arrays.asList("Dao tao", "To chuc can bo", "Van phong khoa CNTT");

    public Canbo(String phongban, double hesoluong, double luongcoban, double thuong, double phat, String name, String date, String address, String gioitinh) {
        super(name, date, address, gioitinh);
        if(!PHONGBANCHOICES.contains(phongban)){
            throw new IllegalArgumentException("Phong ban khong hop le");
        }
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.luongcoban = luongcoban;
        this.thuong = thuong;
        this.phat = phat;
    }
// public Canbo(String phongBan) {
//        if (phongBan == null || phongBan.isEmpty()) {
//            throw new IllegalArgumentException("Phong ban khong hop le");
//        }
//        this.phongban = phongban;
//    }
//  
    public double luongthuclinh(){
        return luongcoban*hesoluong+thuong-phat;
    }
    public void Thongtin(){
        super.hienthithongtin();
        System.out.println("Phong ban:"+phongban);
        System.out.println("He so luong:"+hesoluong);
        System.out.println("Luong co ban:"+luongcoban);
        System.out.println("Thuong :"+thuong);
        System.out.println("Phat :"+phat);
        System.out.println("luong thuc linh:"+luongthuclinh());
    }

    @Override
    public String toString() {
        return "Canbo{ " + "name=" + getName() + ", date=" + getDate() + ", address=" + getAddress() + ", gioitinh=" + getGioitinh() + ", phongban=" + phongban + ", hesoluong=" + hesoluong + ", luongcoban=" + luongcoban + ", thuong=" + thuong + ", phat=" + phat + '}';
    }
    
}
