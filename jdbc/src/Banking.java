import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; // Importing ResultSet
import java.sql.SQLException;
import java.util.Scanner;

public class Banking {
    String url="jdbc:mysql://localhost:3306/banking";
    String username="root";
    String password="zeba123";
    Connection con=null;

    public void run(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            System.out.println("Connected to db");

            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println("\nBanking System");
                System.out.println("1.Create Account");
                System.out.println("2.View account details");
                System.out.println("3.Deposite money");
                System.out.println("4.Withdraw money");
                System.out.println("5.Delete account");
                System.out.println("0.Exit");
                System.out.println("Choose an option");
                int choice=sc.nextInt();

                switch (choice) {
                    case 1:
                        createAccount(con, sc);
                        break;
                    case 2:
                        viewAccountDetails(con, sc);
                        break;
                    case 3:
                        depositeMoney(con, sc);
                        break;
                    case 4:
                        withdrawMoney(con, sc);
                        break;
                    case 5:
                        deleteAccount(con, sc);
                        break;
                    case 0:
                        System.out.println("exiting...");
                        sc.close();
                        con.close();
                        return;
                    default:
                        System.out.println("Invalid choice try again");
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createAccount(Connection con, Scanner sc) {
        try {
            System.out.println("Enter account holder name:");
            String accountHolder = sc.nextLine();

            System.out.println("Enter initial balance:");
            double initialBal = sc.nextDouble();

            System.out.println("Enter contact number:");
            String contactNumber = sc.next();

            String query = "INSERT INTO account (account_holder, balance, contact_number) VALUES(?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, accountHolder);
            pst.setDouble(2, initialBal);
            pst.setString(3, contactNumber);

            int rowInserted = pst.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("Account created successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewAccountDetails(Connection con, Scanner sc) {
        try {
            System.out.println("Enter account number:");
            int accountId = sc.nextInt();

            String query = "SELECT * FROM account WHERE account_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, accountId);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String accountHolder = rs.getString("account_holder");
                double balance = rs.getDouble("balance");
                String contactNumber = rs.getString("contact_number");

                System.out.println("Account ID: " + accountId);
                System.out.println("Account Holder: " + accountHolder);
                System.out.println("Balance: " + balance);
                System.out.println("Contact Number: " + contactNumber);
                System.out.println("============");
            } else {
                System.out.println("Account not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to deposit money
    public void depositeMoney(Connection con, Scanner sc) {
        try {
            System.out.println("Enter account id:");
            int accountId = sc.nextInt();

            System.out.println("Enter deposit amount:");
            double depositAmount = sc.nextDouble();

            String query = "UPDATE account SET balance = balance + ? WHERE account_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setDouble(1, depositAmount);
            pst.setInt(2, accountId);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Deposited successfully");
            } else {
                System.out.println("Account not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void withdrawMoney(Connection con, Scanner sc) {
        try {
            System.out.println("Enter account id:");
            int accountId = sc.nextInt();
            System.out.println("Enter withdrawal amount:");
            double withdrawalAmount = sc.nextDouble();

            String query = "UPDATE account SET balance = balance - ? WHERE account_id = ? AND balance >= ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setDouble(1, withdrawalAmount);
            pst.setInt(2, accountId);
            pst.setDouble(3, withdrawalAmount);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Withdrawal successful");
            } else {
                System.out.println("Insufficient balance or account not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAccount(Connection con, Scanner sc) {
        try {
            System.out.println("Enter Account id to delete:");
            int accountId = sc.nextInt();
            String query = "DELETE FROM account WHERE account_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, accountId);
            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Account deleted successfully");
            } else {
                System.out.println("Account not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Banking bs = new Banking();
        bs.run();
    }
}
