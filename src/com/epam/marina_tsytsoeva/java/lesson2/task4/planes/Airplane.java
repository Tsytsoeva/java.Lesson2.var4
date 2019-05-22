package com.epam.marina_tsytsoeva.java.lesson2.task4.planes;

public abstract class Airplane implements Comparable<Airplane> {
    private String bortName;
    private final String model;
    private final String manufacturer;
    private final int flightRange;
    private final int passengerСapacity;
    private final int airliftСapability;

    public Airplane(String bortName,String model, String manufacturer, int flightRange, int passengerСapacity, int airliftСapability) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.flightRange = flightRange;
        this.passengerСapacity = passengerСapacity;
        this.airliftСapability = airliftСapability;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getPassengerСapacity() {
        return passengerСapacity;
    }

    public int getAirliftСapability() {
        return airliftСapability;
    }

    @Override
    public int compareTo(Airplane o)
    {
        return this.getFlightRange() - o.getFlightRange();
    }

    @Override
    public String toString() {
        return "Airplane [" +    "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", flightRange=" + flightRange +
                ", passengerСapacity=" + passengerСapacity +
                ", airliftСapability=" + airliftСapability +
                ']';
    }
}

