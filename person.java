/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai50;

/**
 *
 * @author Admin
 */
public class person {
   String name;
   private String date;
   private String address;
   private String gioitinh;

    public person(String name, String date, String address, String gioitinh) {
        this.name = name;
        this.date = date;
        this.address = address;
        this.gioitinh = gioitinh;
    }

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
   public void hienthithongtin(){
       System.out.println("Hien thi thong tin");
       System.out.println("Ho va ten:"+name);
       System.out.println("Ngay sinh:"+date);
       System.out.println("Dia chi:"+address);
       System.out.println("Gioi tinh:"+gioitinh);
   }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", date=" + date + ", address=" + address + ", gioitinh=" + gioitinh + '}';
    }

    
   
}
