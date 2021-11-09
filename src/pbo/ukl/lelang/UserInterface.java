/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ukl.lelang;

/**
 *
 * @author erisa
 */
public interface UserInterface {
    //ini class interface, class interface ini diimplementasikan ke dalam class petugas dan masyarakat (Polimorfisme)
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
    
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
    
    
}
