package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private int timeFly;
    //    аэропорт вылета
    private String departureAirport;
    //    аэропорт прилета
    private String arrivalAirport;

    public Ticket(int id, int price, int timeFly, String departureAirport, String arrivalAirport) {
        this.id = id;
        this.price = price;
        this.timeFly = timeFly;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Ticket() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTimeFly() {
        return timeFly;
    }

    public void setTimeFly(int timeFly) {
        this.timeFly = timeFly;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public int compareTo(Ticket o) {
        return price - o.price;
    }
}
