/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perjalananantarkota;

/**
 *
 * @author ryanbrilianfatsena
 */
public class SUV extends Mobil {
    
    // this is attribute range and speed
    public double range, speed;
    
    // this method to calculate the fuel
    public double calculateFuel(){
        double fuel = range / 12 ;
        return fuel;
    }
    
    // this is method to calculate travel time
    public double calculateTravelTime(){
        double time = range / speed;
        return time;
    }
}
