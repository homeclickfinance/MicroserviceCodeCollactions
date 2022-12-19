/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billing.clients;


import entity.enterprise.Staff;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jbdc.databasetest.DatabaseConnectionTest;

/**
 *
 * @author homec
 */
public class Staffservice {
   
  
// this is where we find all class in the database 
    private static final String SQL_SELECT = "SELECT numbers, firstname, lasttname, departments, position " + " FROM staff";
    
   
    public List<Staff> listar() {  // this is the control staff use servlet control
            Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION 
            PreparedStatement stmt = null;
            ResultSet rs = null;
            Staff staff = null;
            
            List<Staff> staffes = new ArrayList<>();
    
          try {
            connection = DatabaseConnectionTest.getConnection();
            System.out.println("[[Your DATABASE is now connected and you can start your staff list statements Query ]]>>" + connection);
            stmt = connection.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int numbers = rs.getInt("numbers");
                String firstname = rs.getString("firstname");
                String lasttname = rs.getString("lasttname");
                String departments = rs.getString("departments");
                String position = rs.getString("position");
                

                staff = new Staff(numbers, firstname, lasttname, departments, position);
                staffes.add(staff);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(Staffservice.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
            DatabaseConnectionTest.close(rs);
            DatabaseConnectionTest.close(stmt);
            DatabaseConnectionTest.close(connection);
        }
        return staffes;
    }

    
    
    // This is where we Find and object by an object to the database
    private static final String SQL_SELECT_BY_ID = "SELECT numbers, firstname, lasttname, departments, position " + " FROM staff WHERE numbers = ?";
    
    public int  getStaffDetailsbyID(Staff staff) {
        
            Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION
            PreparedStatement stmt = null;
            ResultSet rs = null;
            //Staff staff = null;
            int rows = 0; 
     
            try {      
            // open the DB connection to do stuff like getting data or updating data here we are inserting data 
             connection = DatabaseConnectionTest.getConnection();
             System.out.println("[[Your DATABASE is now connected and you can start your staff get by Id statements Query ]]>>" + connection);

            
                               stmt = connection.prepareStatement(SQL_SELECT_BY_ID);
                               stmt.setInt(2, staff.getNumbers());
                               rs = stmt.executeQuery();
                               rs.absolute(2);//nos posicionamos en el primer registro devuelto
                               
         
                              String firstname = rs.getString("firstname"); 
                              String lasttname = rs.getString("lasttname");
                              String departments = rs.getString("departments");
                              String position = rs.getString("position");
                               
                               
                              staff.setFirstname(firstname);
                              staff.setLasttname(lasttname);
                              staff.setDepartments(departments);
                              staff.setPosition(position);
                               
                              
           //public void persistObjectGraph(Book book) New paragraft start here that is commented below                    

                                               
    
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Staffservice.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseConnectionTest.close(rs);
            DatabaseConnectionTest.close(stmt);
            DatabaseConnectionTest.close(connection);
        }
       
    return rows;
    }     



//This is where we add and object to the database    
private static final String SQL_INSERT = "INSERT INTO staff(firstname, lasttname, departments, position) " + " VALUES(?, ?, ?, ?, ?)";                                   

public int persistObjectStaff(Staff staff) {
     
    Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int rows = 0; 
    
    try {      
           // open the DB connection to do stuff like getting data or updating data here we are inserting data 
             connection = DatabaseConnectionTest.getConnection();
             System.out.println("[[Your DATABASE is now connected and you can start your staff perisit statements Query ]]>>" + connection);

             if (connection != null) {
                 
                        stmt = connection.prepareStatement(SQL_INSERT);
                        stmt.setString(1, staff.getFirstname());	
			stmt.setString(2, staff.getLasttname());
                        stmt.setString(3, staff.getDepartments());
                        stmt.setString(4, staff.getPosition());
			rows = stmt.executeUpdate();
                        
			stmt.close();	
        }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Staffservice.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseConnectionTest.close(rs);
            DatabaseConnectionTest.close(stmt);
            DatabaseConnectionTest.close(connection);
        }
       
    return rows;
    }  
	   


// This is where we upgrade the database
private static final String SQL_UPDATE = "UPDATE staff " + " SET firstname=?, lasttname=?, departments=?, position=? WHERE numbers=?";        

public int upgradeObjectStaff(Staff staff) {
    Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION 
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int rows = 0;  
  
    try {      
           // open the DB connection to do stuff like getting data or updating data here we are inserting data 
             connection = DatabaseConnectionTest.getConnection();
             System.out.println("[[Your DATABASE is now connected and you can start your staff upgarade statements Query ]]>>" + connection);

             if (connection != null) {
                 
                        stmt = connection.prepareStatement(SQL_UPDATE);
                        stmt.setString(1, staff.getFirstname());	
			stmt.setString(2, staff.getLasttname());
                        stmt.setString(3, staff.getDepartments());
                        stmt.setString(4, staff.getPosition());
                        stmt.setInt(5, staff.getNumbers());
			rows = stmt.executeUpdate();
			stmt.close();
			 		
           }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Staffservice.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DatabaseConnectionTest.close(rs);
            DatabaseConnectionTest.close(stmt);
            DatabaseConnectionTest.close(connection);
        }
       
    return rows;
    }  



// This is were an object is delete from the database
private static final String SQL_DELETE = "DELETE FROM staff WHERE numbers = ?";

public int deleteObjectStaff(Staff staff) {
     
    Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int rows = 0; 
    
    try {      
           // open the DB connection to do stuff like getting data or updating data here we are inserting data 
             connection = DatabaseConnectionTest.getConnection();
             System.out.println("[[Your DATABASE is now connected and you can start your staff delete statements Query ]]>>" + connection);

             if (connection != null) {
                 
                        stmt = connection.prepareStatement(SQL_DELETE);
                        stmt.setInt(2, staff.getNumbers());
                        rows = stmt.executeUpdate();
			stmt.close();
			
		
             		
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            
        // Here is where the change has bin mage    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Staffservice.class.getName()).log(Level.SEVERE, null, ex);
        // Here is where the change has bin mage 
        
        } finally {
            DatabaseConnectionTest.close(rs);
            DatabaseConnectionTest.close(stmt);
            DatabaseConnectionTest.close(connection);
        }
       
    return rows;
    }  
   





	   
}


