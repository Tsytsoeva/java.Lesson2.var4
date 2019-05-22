package com.epam.marina_tsytsoeva.java.lesson2.task4;

import com.epam.marina_tsytsoeva.java.lesson2.task4.planes.Airplane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Airline {
    private String companyName;
    private List<Airplane> airplanes = new ArrayList<Airplane>();

    public Airline(String airlineName) {
        this.companyName = airlineName;
    }

    public void addAirPlane(Airplane airplane) {
        airplanes.add(airplane);
    }


    public void getTotalCapacity() {
        int totalPassengerCapacity = 0;
        int totalAirliftCapacity = 0;
        for (int i = 0; i < airplanes.size(); ++i) {
            totalPassengerCapacity += airplanes.get(i).getPassengerСapacity();
            totalAirliftCapacity += airplanes.get(i).getAirliftСapability();
        }

        System.out.println("Total passenger capacity " + totalPassengerCapacity);
        System.out.println("Total airlift capacity " + totalAirliftCapacity);
    }

    public void sortPlanesByFlightRange() {
        Collections.sort(airplanes);
        System.out.println("Sorting by flightRange is done!");
    }


    public void findPlanesByFlightRange(int min, int max) {
        List<Airplane> result = new ArrayList<>();
        for (Airplane r : airplanes) {
            if (r.getFlightRange() >= min && r.getFlightRange() < max)
                result.add(r);
        }
        if (result.size()==0){
            System.out.println("Airplane not found.");
        }
        else {
            System.out.println("Found Planes By FlightRange (min="+min+") " + "(max="+max+"):");
            System.out.println(result);
        }
    }


    public void showAirplanes() {
        for (Airplane allplanes : this.airplanes) {
            System.out.println(allplanes);
        }
    }

}