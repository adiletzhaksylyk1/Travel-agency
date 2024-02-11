package interfaces;
import java.util.List;
import models.Trip;

public interface DataAccessTrip {

    void insertTrip(Trip trip);

    Trip findTripById(int tripId);

    List<Trip> findAllTrips();

    boolean updateTrip(Trip trip);

    boolean deleteTrip(int tripId);
}
