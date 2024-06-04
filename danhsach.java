/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai50;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import luyen_tap.baitap1.Student;

/**
 *
 * @author Admin
 */
public class danhsach {
    private ArrayList<Canbo> danhsachcb;
    private File File;

    public danhsach(ArrayList<Canbo> danhsachcb) {
        this.danhsachcb = danhsachcb;
    }

    public danhsach() {
        this.danhsachcb = new ArrayList<Canbo>();
    }
    //them sinh vien vao danh sach
    public void addThongtin(Canbo cb){
        this.danhsachcb.add(cb);
    }
    //in danh sach sinh vien
    public void indanhsach(){
        for (Canbo canbo : danhsachcb) {
            System.out.println(canbo);
        }
    }
    //ghi file 
    public void ghidoituong(String fle){
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fle)))) {
          //  File f2 = new File("E:\\netbean\\JavaApplication1\\src\\bai50\\canbo.dat");
            for (Canbo object : danhsachcb) {
                bw.write(object.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
        }
    }
    
    //doc file
    public void docfile(File fle){
          //  File f2= new File("E:\\netbean\\JavaApplication1\\src\\bai50\\canbo.dat");
            try {
                BufferedReader br;
                br = Files.newBufferedReader(fle.toPath(), StandardCharsets.US_ASCII);
                String line;
                while (true) {                    
                    line = br.readLine();
                    if (line == null) {
                        break;
                    }
                    else{
                        System.out.println(line);
                    }
                }
        } catch (Exception e) {
        }
    }
}
