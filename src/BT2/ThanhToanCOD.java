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
public class ThanhToanCOD implements IThanhToan{

    public ThanhToanCOD() {
    }

    @Override
    public double thanhToan(int tienHang) {
        if (tienHang > 2000000)
            return tienHang * (2/100);
        else
            return tienHang;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
