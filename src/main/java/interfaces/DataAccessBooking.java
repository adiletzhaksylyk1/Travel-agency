package interfaces;
import models.Booking;

import java.util.List;

public interface DataAccessBooking {
    void insertBooking(Booking booking);
    Booking findBookingById(int bookingId);
    List<Booking> findAllBookings();
    boolean updateBooking(Booking booking);
    boolean deleteBooking(int bookingId);
    List<Booking> findBookingsByCustomerId(int customerId);
}
