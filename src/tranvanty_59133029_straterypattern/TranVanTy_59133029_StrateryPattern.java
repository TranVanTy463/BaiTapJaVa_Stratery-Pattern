/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranvanty_59133029_straterypattern;
import BT1.Cong;
import BT1.Tru;
import BT1.context;
import BT2.GioHang;
import BT2.HangHoa;
import BT2.ThanhToanCOD;
import BT2.ThanhToanOnline;

/**
 *
 * @author Administrator
 */
public class TranVanTy_59133029_StrateryPattern {

    /**
     * @param args the command line arguments
     */
    static void BT1Main()
    {
        
         context con = new context();
           Cong cong = new Cong();
           Tru tru = new Tru();
//           Nhan nhan= new Nhan();
//           Chia chia= new Chia();
           // Phép cộng
           con.setTinhToan(cong);
           System.out.println("Phép Cộng");
           System.out.println("75 + 12 = " + con.tinh(75, 12));
           // Phép Trừ
           con.setTinhToan(tru);
           System.out.println("Phép Trừ");
           System.out.println("54 - 78 = " + con.tinh(54, 78));
           
    }
    static void BT2Main()
    {
         GioHang GH1 = new GioHang();
         GioHang GH2 = new GioHang();
        ThanhToanOnline TT1 = new ThanhToanOnline();
        ThanhToanCOD TT2 = new ThanhToanCOD();
        GH1.setHinhthucTT(TT1);
        GH2.setHinhthucTT(TT2);
        HangHoa HH1 = new HangHoa("- Bột Giặc Omo","Trắng sáng, thơm mát",1000000);
        HangHoa HH2 = new HangHoa("- Máy Giặc ToShiBa","Chất lượng cao",6000000);
        HangHoa HH3 = new HangHoa("- Tủ Lạnh Sharp","Sản phẩm của Nhật Bản",8000000);
        HangHoa HH4 = new HangHoa("- TiVi SamSung","Thông minh thế hệ mới",15000000);
        GH1.themHangHoa(HH1);
        GH1.themHangHoa(HH2);
        GH2.themHangHoa(HH3);
        GH2.themHangHoa(HH4);
        
        System.out.println("Giỏ Hàng 1 : ");
        GH1.InDs();
        System.out.println("Tổng tiền hàng là : "+ GH1.TongTienHang()+"\n");
        
        System.out.println("Giỏ Hàng 2 : ");
        GH2.InDs();
        System.out.println("Tổng tiền hàng là : "+ GH2.TongTienHang());
                
        
        
        
        
        
          
        
    }
    public static void main(String[] args) {
           //  BT1Main();
             BT2Main();
        // TODO code application logic here
    }
    
}
