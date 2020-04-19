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
public class ThanhToanOnline implements IThanhToan{

    public ThanhToanOnline() {
    }

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000 )
            return tienHang * (5/100);
        else
            return tienHang * (7/100);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
