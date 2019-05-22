package com.epam.marina_tsytsoeva.java.lesson2.task4;


import com.epam.marina_tsytsoeva.java.lesson2.task4.planes.*;

/**
 * @author  Marina Tsytsoeva
 * Lesson2.version4
 */

public class Main {
    public static void main(String[] args) {

        Airline airline = new Airline("Ryazan Airlines");
        airline.addAirPlane(new AirbusA320("VQ-BQH"));
        airline.addAirPlane(new Boeing777("G-YMMM"));
        airline.addAirPlane(new Boeing737("VQ-ZZZZ"));

//calculate total capacity
        airline.getTotalCapacity();
//sort Airplanes
        airline.sortPlanesByFlightRange();
//show sorted Airplanes
        airline.showAirplanes();

//find Planes By FlightRange
    airline.findPlanesByFlightRange(2500, 3000);
    }
}