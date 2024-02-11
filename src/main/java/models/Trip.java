package models;

public class Trip {
    private int tripId;
    private String destination;
    private java.sql.Date startDate;
    private java.sql.Date endDate;
    private double price;

    public Trip() {
    }

    public Trip(int tripId, String destination, java.sql.Date startDate, java.sql.Date endDate, double price) {
        setTripId(tripId);
        setDestination(destination);
        setStartDate(startDate);
        setEndDate(endDate);
        setPrice(price);
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void setStartDate(java.sql.Date startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(java.sql.Date endDate) {
        this.endDate = endDate;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getTripId() {
        return tripId;
    }
    public String getDestination() {
        return destination;
    }
    public java.sql.Date getStartDate() {
        return startDate;
    }
    public java.sql.Date getEndDate() {
        return endDate;
    }
    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Trip: " + tripId + " " + destination +
                "start - end: " + startDate + " " + endDate +
                ", price: " + price;
    }
}

