package PharmacyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCManager {
	private Connection c = null;

    public JDBCManager() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:db/tests.db");


            Statement stmt = c.createStatement();
            stmt.executeUpdate("PRAGMA foreign_keys=ON");
            createTables(); 
            System.out.println("Database connection opened");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Libraries not loaded");
        }
    }
    public void closeConnection() {
        try {
            if (c != null && !c.isClosed()) {
                c.close();
                System.out.println("Database connection closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void createTables() {
    	
    	try {
    		
    		Statement stmt= c.createStatement();
    		
    		String sql = "CREATE TABLE Pharmacist ("
    				+ "pharmacist_id INTEGER PRIMARY KEY,"
    				+ "name	TEXT,"
    				+ "shift TEXT)";
    
    		
    		
    		stmt.executeUpdate(sql);	
    				
    				
    				
    		
    		} catch(SQLException e) {
    			System.out.print("Error ocurrido\n");
    			if(!e.getMessage().contains("already exists"))
    				e.printStackTrace();
    			
    		}
    }
}
