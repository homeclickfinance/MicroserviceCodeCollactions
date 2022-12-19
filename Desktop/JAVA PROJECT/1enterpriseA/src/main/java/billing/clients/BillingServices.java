/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billing.clients;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.enterprise.Billls;




import jbdc.databasetest.DatabaseConnectionTest;

/**
 *
 * @author homec
 */
public class BillingServices {

    
    
    public static List<Billls> getBilllsDetails() {
        
    List<Billls> listbills = new ArrayList<>(); 
    Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION
    
     try {
            // open the DB connection to do stuff like getting data or updating data here we are inserting data 
           connection = DatabaseConnectionTest.getConnection();
           System.out.println("[[Your DATABASE is now connected and you can start your BILLLS details statements Query ]]>>" + connection);

            if (connection != null) {
                
            String query = "SELECT idbillls,lightbill,waterbill,utilitiesbills " + "FROM Billls";    
                        System.out.println("query for Bills database > " +query);
             
            PreparedStatement stmt = connection.prepareStatement(query);
             
            ResultSet rs = stmt.executeQuery();
             
                     //loop the data from DB   
            while (rs.next()){
                
            int idbillls = rs.getInt("idbillls");
            String lightbill = rs.getString("lightbill");
            String waterbill = rs.getString("waterbill");
            String utilitiesbills = rs.getString("utilitiesbills");
            
            Billls billls = new Billls();
            billls.setIdbillls(idbillls);
            billls.setLightbill(lightbill);
            billls.setWaterbill(waterbill);
            billls.setUtilitiesbills(utilitiesbills);
            listbills.add(billls);
            
            }
             
            //For handling if any error occured in the  try block line 96 to 114
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
               return listbills; 
	}

}
