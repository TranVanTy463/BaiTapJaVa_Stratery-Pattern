/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class QLSV extends SinhVien{
    ISoSanh<SinhVien> soSanh ;
    ArrayList<SinhVien> dsSV = new ArrayList<>();
    
    public void sapXep()
    {
        
    }
    public void inDS()
    {
       int i ;
       for(i =0 ; i<dsSV.size();i++)
       {
           dsSV.get(i).xuatTT();
       }
    }
    
    
}
