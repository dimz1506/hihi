/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai50;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class tst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        danhsach ds = new danhsach();
        int luachon = 0;
        do {
                System.out.println("menu---");
                System.out.println("vui long lua chon chuc nang:");
                System.out.println("1. them sinh vien vao danh sach"+
                        "\n2. in danh sach sinh vien ra man hinh"+
                        "\n3.luu danh sach sinh vien xuong tap tin"+
                        "\n0. thoat khoi chuong trinh");
                luachon = sc.nextInt();
                sc.nextLine();//dung de xoa khoang trang (khi bi mat dong)
                if (luachon == 1) {
                    System.out.println("Ho va ten:");
                    String hoTen ;
                    hoTen = sc.nextLine();
                    System.out.println("Ngay sinh:");
                    String ngaySinh;
                    ngaySinh = sc.nextLine();
                    System.out.println("Dia chi:");
                    String diaChi;
                    diaChi = sc.nextLine();
                    System.out.println("gioi tinh:");
                    String gioiTinh;
                    gioiTinh = sc. nextLine();
                    System.out.println("Phong ban:");
                    String phongBan;
                    phongBan =sc.nextLine();
                    System.out.println("He so luong:");
                    double heSoLuong;
                    heSoLuong = sc.nextDouble();
                    System.out.println("Luong co ban:");
                    double luongCoBan;
                    luongCoBan = sc.nextDouble();
                    System.out.println("thuong:");
                    double thuong;
                    thuong = sc.nextDouble();
                    System.out.println("Phat:");
                    double phat;
                    phat = sc.nextDouble();
                    Canbo cb= new Canbo(phongBan, heSoLuong, luongCoBan, thuong, phat, hoTen, hoTen, diaChi, gioiTinh);
                    ds.addThongtin(cb);
                }
                else if(luachon == 2){
                    ds.indanhsach();
                }
                else if(luachon == 3){
                    System.out.println("Nhap ten file");
                    String tenFile = sc.nextLine();
                    ds.ghidoituong(tenFile);
                }
        }
        while(luachon !=0);
    }
}
