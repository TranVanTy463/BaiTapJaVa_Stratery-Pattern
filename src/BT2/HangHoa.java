/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Administrator
 */
public class HangHoa {
    public String tenHH , moTa;
    public int gia ;

    
    public HangHoa() {
    }

    public HangHoa(String tenHH, String moTa, int gia) {
        this.tenHH = tenHH;
        this.moTa = moTa;
        this.gia = gia;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    public void XuatTT()
    {
       System.out.println(tenHH); 
        System.out.println(moTa); 
        System.out.println("Giá : "+gia);
       
    }
    
}
