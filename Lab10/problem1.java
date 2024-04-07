package Lab10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class problem1 {
    public static void main(String[] args) {
        try (
            Connection con = DriverManager.getConnection("jdbc:sqlite:"+"world.db")) {
        } catch (SQLException e) {
           e.printStackTrace();
        }
        
        
    }
}
