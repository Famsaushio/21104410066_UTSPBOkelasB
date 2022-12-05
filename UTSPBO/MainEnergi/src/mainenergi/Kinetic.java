/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mainenergi;

/**
 *
 * @author Muhammad Fahmi Mijib
 * TI-B
 * 21104410066
 */
public class Kinetic {
    double kineticEnergy;
    final double C5 = 0.5;


    public double getKineticEnergy(){
    return kineticEnergy;

    }

    public void setKineticEnergy(double massa, double kecepatanBenda){
    this.kineticEnergy =  C5 * massa * (kecepatanBenda * kecepatanBenda);
    }
}
