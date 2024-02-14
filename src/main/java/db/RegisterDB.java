package db;

import models.Booking;
import models.Agent;
import models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegisterDB {
    public boolean addBookingToDatabase(Booking obj) {
        try {


            Connection conn = DatabaseConnection.connect();
            String sql = "INSERT INTO bookings VALUES (?,?,?,?)";
            PreparedStatement prepSt = conn.prepareStatement(sql);


            prepSt.setInt(1, obj.getBookingId());
            prepSt.setInt(2, obj.getCustomerId());
            prepSt.setInt(3, obj.getTripId());
            prepSt.setDate(4, obj.getBookingDate());


            int result = prepSt.executeUpdate();

            if (result > 0) {
                return true;

            } else {
                return false;
            }


        } catch (Exception E) {
            System.out.println(E.getMessage());
            return false;
        }
    }


    public List<Booking> getBookingList() {
        try {
            Connection conn = DatabaseConnection.connect();
            String sql = "SELECT * FROM bookings";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            List<Booking> bookingList = new ArrayList<Booking>();
            while (rs.next()) {
                Booking booking = new Booking();

                booking.setBookingId(rs.getInt("booking_id"));
                booking.setCustomerId(rs.getInt("customer_id"));
                booking.setTripId(rs.getInt("trip_id"));
                booking.setBookingDate((rs.getDate("booking_date")));

                bookingList.add(booking);

            }
            return bookingList;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean addAgentToDatabase(Agent obj) {
        try {


            Connection conn = DatabaseConnection.connect();
            String sql = "INSERT INTO agents VALUES (?,?,?)";
            PreparedStatement prepSt = conn.prepareStatement(sql);

            prepSt.setInt(1, obj.getAgentId());
            prepSt.setString(2, obj.getName());
            prepSt.setString(3, obj.getEmail());


            int result = prepSt.executeUpdate();

            if (result > 0) {
                return true;

            } else {
                return false;
            }


        } catch (Exception E) {
            E.printStackTrace();
            return false;
        }
    }


    public List<Agent> getAgentList() {
        try {
            Connection conn = DatabaseConnection.connect();
            String sql = "SELECT * FROM agents";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            List<Agent> agentList = new ArrayList<Agent>();
            while (rs.next()) {
                Agent agent = new Agent();

                agent.setAgentId(rs.getInt("agent_id"));

                agent.setName(rs.getString("name"));
                agent.setEmail(rs.getString("email"));
                agentList.add(agent);

            }
            return agentList;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public boolean addCustomersToDatabase(Customer obj) {
        try {


            Connection conn = DatabaseConnection.connect();
            String sql = "INSERT INTO customers VALUES (?,?,?,?)";
            PreparedStatement prepSt = conn.prepareStatement(sql);

            prepSt.setInt(1, obj.getCustomerId());
            prepSt.setString(2, obj.getFirstName());
            prepSt.setString(3, obj.getLastName());
            prepSt.setString(4, obj.getEmail());


            int result = prepSt.executeUpdate();

            if (result > 0) {
                return true;

            } else {
                return false;
            }


        } catch (Exception E) {
            System.out.println(E.getMessage());
            return false;
        }
    }


    public List<Customer> getCustomersList() {
        try {
            Connection conn = DatabaseConnection.connect();
            String sql = "SELECT * FROM customers";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            List<Customer> customerList = new ArrayList<Customer>();
            while (rs.next()) {
                Customer customer = new Customer() {
                };


                customer.setCustomerId(rs.getInt("customer_id"));
                customer.setFirstName(rs.getString("first_name"));
                customer.setLastName(rs.getString("last_name"));
                customer.setEmail(rs.getString("email"));

                customerList.add(customer);

            }
            return customerList;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
