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
class Pop {
    
    String penyanyi = "Raisa";
    String lagu = "Kali Kedua";
    
    Pop(){
        
    }
    
    Pop(String penyanyi,String lagu){
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi=" <=> "+this.lagu);
    }
    
    public void singer(String penyanyi){
        this.penyanyi = this.penyanyi;
    }
    
    protected void song(String lagu){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi=" <=> "+this.lagu);
    }


}
    
