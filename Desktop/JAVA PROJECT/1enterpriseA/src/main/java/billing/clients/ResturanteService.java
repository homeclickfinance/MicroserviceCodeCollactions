/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billing.clients;

import entily.jutil.JpaUtiles;
import entity.enterprise.Goods;
import entity.enterprise.Restruante;
import jakarta.persistence.EntityManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jbdc.databasetest.DatabaseConnectionTest;

/**
 *
 * @author homec
 */
public class ResturanteService {
    
    Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION 
    
   
    
    public void  getResturanteDetails(Restruante restruante) {
    
      
    //List<Restruante> restlists = new ArrayList<>();
     
     try {      
    // open the DB connection to do stuff like getting data or updating data here we are inserting data 
      connection = DatabaseConnectionTest.getConnection();
      System.out.println("[[Your DATABASE is now connected and you can start your RESTURANTE details statements Query ]]>>" + connection);
      
      if (connection != null) {
          
     
      PreparedStatement stmt = connection.prepareStatement("SELECT bookingNum,amount,type,total,tablesize,position" + "FROM Restruante");
			stmt.setString(50, restruante.getAmount());	
			stmt.setString(10, restruante.getType());
                        stmt.setString(10, restruante.getTotal());
                        stmt.setString(10, restruante.getTablesize());
                        stmt.setString(10, restruante.getPosition());
			stmt.executeUpdate();
			stmt.close(); 
                        
                        
                        ResultSet rs = stmt.executeQuery();
                        restruante = new Restruante();
                        
			if (rs.next()) {
                            
			restruante.setAmount(rs.getString("too"));
			restruante.setType(rs.getString("bade"));
                        restruante.setTotal(rs.getString("fifteen"));
                        restruante.setTablesize(rs.getString("large"));
                        restruante.setPosition(rs.getString("gigge"));
                          
			}
			rs.close();                        
			stmt.close();
    //public void persistObjectGraph(Book book) New paragraft start here that is commented below                    
                        
                                               
        }
} catch (ClassNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace(System.out);
			} 
		}
               //return restruante;
	}

}

       
     
