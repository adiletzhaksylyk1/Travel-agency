package models;

public class Booking {
    private int bookingId;
    private int customerId;
    private int tripId;
    private java.sql.Date bookingDate;
    private String status;

    public Booking() {
    }

    public Booking(int bookingId, int customerId, int tripId, java.sql.Date bookingDate, String status) {
        setBookingId(bookingId);
        setCustomerId(customerId);
        setTripId(tripId);
        setBookingDate(bookingDate);
        setStatus(status);
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setTripId(int tripId) {
        this.tripId = tripId;
    }
    public void setBookingDate(java.sql.Date bookingDate) {
        this.bookingDate = bookingDate;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public int getBookingId() {
        return bookingId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public int getTripId() {
        return tripId;
    }
    public java.sql.Date getBookingDate() {
        return bookingDate;
    }
    public String getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "Booking: " + bookingId +
                " customerId " + customerId +
                " tripId " + tripId +
                " bookingDate " + bookingDate +
                " status " + status;
    }
}
