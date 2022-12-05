/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainenergi;

import java.util.Scanner;

/**
 *
 * @author zeros
 */
public class MainEnergi {

    public static void main(String[] args) {
        
        double massa,kecepatanBenda = 0;
        
        Kinetic kinetic = new Kinetic();
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Program Energi Kinetic");
        System.out.println("Massa");
        massa = scanner.nextDouble();
        System.out.println("Kecepatan Benda");
        kecepatanBenda = scanner.nextDouble();
        
        kinetic.setKineticEnergy(massa,kecepatanBenda);
        
        System.out.print("Energi Kinetic : "+kinetic.getKineticEnergy()+"J");
        System.out.println("");
        
        
    }
    
}
