/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ryanbrilianfatsena
 */
public abstract class BangunRuang {   
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
    public void showResults(){
        System.out.println("The Volume is        : " + this.calculateVolume());
        System.out.println("The Surface Area is  : " + this.calculateSurfaceArea());
    }
}
