/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author ASUS TUF A15
 */
public class New {
    int sisi;
    int hasil;
    
    void New (int sisi){
        this.sisi=sisi;
    }
    int sisi(){
        
        return sisi;
    }
    
    int Hitung(){
        hasil=4*sisi;
        System.out.println("Keliling Persegi adalah : "+hasil);
    return hasil;
    }
    
}
