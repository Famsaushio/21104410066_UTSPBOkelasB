/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package penyanyi;

/**
 *
 * @author Muhammad Fahmi Mijib
 * TI-B
 * 21104410066
 */
class Dangdut {
    
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    Dangdut(){
    }
    
    void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu, String kopi_Dangdut){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi=" <=> "+this.lagu);
    }
    
    

}
