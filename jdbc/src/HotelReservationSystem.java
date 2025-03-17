import java.sql.*;
import java.util.Scanner;

public class HotelReservationSystem {
    String url = "jdbc:mysql://localhost:3306/hotel_db"; // Database URL
    String username = "root"; // Database username
    String password = "zeba123"; // Database password

    Connection con = null;
    Statement st = null;


    public void run() {
        try {
            // Register JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Open a connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database.");

            Scanner sc = new Scanner(System.in);
            while (true) {
                // Display menu options
                System.out.println("\nHotel Management System");
                System.out.println("1. Reserve a Room");
                System.out.println("2. View Reservation");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservation");
                System.out.println("5. Delete Reservation");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                // Handle user choice
                switch (choice) {
                    case 1:
                        reserveRoom(con, sc);
                        break;
                    case 2:
                        viewReservation(con);
                        break;
                    case 3:
                        getRoomNumber(con, sc);
                        break;
                    case 4:
                        updateReservation(con, sc);
                        break;
                    case 5:
                        deleteReservation(con, sc);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        sc.close();
                        con.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Method to reserve a room
    public void reserveRoom(Connection con, Scanner sc) {
        try {
            System.out.print("Enter Guest Name: ");
            sc.nextLine(); // Consume newline
            String guestName = sc.nextLine();

            System.out.print("Enter Room Number: ");
            int roomNumber = sc.nextInt();

            System.out.print("Enter Contact Number: ");
            String contactNumber = sc.next();

            String query = "INSERT INTO reservations (guest_name, room_number, contact_number) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, guestName);
            pst.setInt(2, roomNumber);
            pst.setString(3, contactNumber);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Room reserved successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to view all reservations
    public void viewReservation(Connection con) {
        try {
            String query = "SELECT * FROM reservations";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("r_id");
                String guestName = rs.getString("guest_name");
                int roomNumber = rs.getInt("room_number");
                String contactNumber = rs.getString("contact_number");
                String reservationDate = rs.getString("reservation_date");

                System.out.println("Reservation ID: " + id);
                System.out.println("Guest Name: " + guestName);
                System.out.println("Room Number: " + roomNumber);
                System.out.println("Contact Number: " + contactNumber);
                System.out.println("Reservation Date: " + reservationDate);
                System.out.println("----------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get the room number for a specific guest
    public void getRoomNumber(Connection con, Scanner sc) {
        try {
            System.out.print("Enter Guest Name: ");
            sc.nextLine(); // Consume newline
            String guestName = sc.nextLine();

            String query = "SELECT room_number FROM reservations WHERE guest_name = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, guestName);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int roomNumber = rs.getInt("room_number");
                System.out.println("Room Number: " + roomNumber);
            } else {
                System.out.println("No reservation found for the guest.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to update a reservation's room number
    public void updateReservation(Connection con, Scanner sc) {
        try {
            System.out.print("Enter Reservation ID to Update: ");
            int reservationId = sc.nextInt();

            System.out.print("Enter New Room Number: ");
            int newRoomNumber = sc.nextInt();

            String query = "UPDATE reservations SET room_number = ? WHERE r_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, newRoomNumber);
            pst.setInt(2, reservationId);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Reservation updated successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete a reservation
    public void deleteReservation(Connection con, Scanner sc) {
        try {
            System.out.print("Enter Reservation ID to Delete: ");
            int reservationId = sc.nextInt();

            String query = "DELETE FROM reservations WHERE r_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, reservationId);

            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Reservation deleted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        HotelReservationSystem hrs = new HotelReservationSystem();
        hrs.run();
    }
}
