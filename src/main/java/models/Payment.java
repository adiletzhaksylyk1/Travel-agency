package models;

import java.math.BigDecimal;

public class Payment {
    private int paymentId;
    private int bookingId;
    private BigDecimal amount;
    private java.sql.Date paymentDate;
    private String paymentMethod;

    public Payment() {
    }

    public Payment(int paymentId, int bookingId, BigDecimal amount, java.sql.Date paymentDate, String paymentMethod) {
        setPaymentId(paymentId);
        setBookingId(bookingId);
        setAmount(amount);
        setPaymentDate(paymentDate);
        setPaymentMethod(paymentMethod);
    }

    // Getters and setters
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public java.sql.Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(java.sql.Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", bookingId=" + bookingId +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}

