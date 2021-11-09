/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ukl.lelang;
import java.util.ArrayList;

/**
 *
 * @author erisa
 */
public class Masyarakat implements UserInterface {
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Masyarakat(){
        //indeks 0
        this.namaMasyarakat.add("Avinka");
        this.alamat.add("Tuluanggung");
        this.telepon.add("1254561427");
        
        //indeks 1
        this.namaMasyarakat.add("Aisyah");
        this.alamat.add("Nganjuk");
        this.telepon.add("5429830");
        
    }
    
    public int getJmlMasyarakat(){
        return  this.namaMasyarakat.size();
    }
    
    @Override
    public void setNama(String namaMasyarakat){
        this.namaMasyarakat.add(namaMasyarakat);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    
    @Override
    public String getNama(int id){
        return this.namaMasyarakat.get(id);
    }
    @Override
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    @Override
    public String getTelepon(int id){
        return this.telepon.get(id);
    }
    
    
    
    
}
