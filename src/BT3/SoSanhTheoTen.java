/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Administrator
 */
public abstract class SoSanhTheoTen implements ISoSanh{

    public SoSanhTheoTen() {
    }

  
    public int soSanh(SinhVien o1, SinhVien o2) {
        if( o1 >  o2)
        {
            return 1;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
  
    
}
