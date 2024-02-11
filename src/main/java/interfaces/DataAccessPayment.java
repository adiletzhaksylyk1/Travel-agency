package interfaces;
import java.util.List;
import models.Payment;
public interface DataAccessPayment {
    public interface PaymentDAO {
        void insertPayment(Payment payment);
        Payment findPaymentById(int paymentId);
        List<Payment> findAllPayments();
        boolean updatePayment(Payment payment);
        boolean deletePayment(int paymentId);
        List<Payment> findPaymentsForBooking(int bookingId); // Example of an additional method
    }

}
