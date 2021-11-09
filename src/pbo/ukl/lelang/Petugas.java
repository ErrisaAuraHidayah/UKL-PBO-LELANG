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
public class Petugas implements UserInterface{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("Errisa Aura");
        this.alamat.add("Jember");
        this.telepon.add("8757574362");
    }
    
    public int getJmlPetugas(){
        return this.namaPetugas.size();
    }
    //ini ovveride merupakan implementasi dari polimorfisme statis
    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
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
        return this.namaPetugas.get(id);
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
