/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class GioHang extends HangHoa {
    IThanhToan hinhthucTT;
    ArrayList<HangHoa> dsHangHoa = new ArrayList<>();

    public GioHang() {
    }

    public GioHang(IThanhToan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }

    public ArrayList<HangHoa> getDsHangHoa() {
        return dsHangHoa;
    }

    public void setDsHangHoa(ArrayList<HangHoa> dsHangHoa) {
        this.dsHangHoa = dsHangHoa;
    }
    

   
    
    public IThanhToan getHinhthucTT() {
        return hinhthucTT;
    }

    public void setHinhthucTT(IThanhToan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }
   public void themHangHoa(HangHoa hang)
   {
       dsHangHoa.add(hang);
   }
   
   public void InDs(){
         int i;
        for( i=0;i<dsHangHoa.size(); i++)
        {
           dsHangHoa.get(i).XuatTT();
        }
   }
   public double TongTienHang( )
   {
       int i , tong=0;
       for(i=0;i<dsHangHoa.size();i++)
       {
           tong = tong +dsHangHoa.get(i).getGia();
       }
       return tong;
   }
   public double KhachTra()
   {
       
      return hinhthucTT.thanhToan((int) TongTienHang());
              
   }
 
}
