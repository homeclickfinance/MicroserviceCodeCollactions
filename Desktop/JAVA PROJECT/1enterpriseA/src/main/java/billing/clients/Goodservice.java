/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billing.clients;

import entity.enterprise.Goods;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jbdc.databasetest.DatabaseConnectionTest;
import java.sql.SQLException;

/**
 *
 * @author homec
 */
public class Goodservice {
    
Connection connection = null;          // iF THE DATABASE IS NULL THEN START GETTING CONNECTION 
    


    
    public void  getGoodsDetails(Goods goods) {
      
    //List<Restruante> restlists = new ArrayList<>();
     
     try {      
    // open the DB connection to do stuff like getting data or updating data here we are inserting data 
      connection = DatabaseConnectionTest.getConnection();
      System.out.println("[[Your DATABASE is now connected and you can start your goods list details statements Query ]]>>" + connection);
      
      if (connection != null) {
          
     
      PreparedStatement stmt = connection.prepareStatement("SELECT idgoods, rice, flour, water, fish, pork " + " FROM goods");
			//stmt.setString(50, goods.getIdgoods());	
			stmt.setString(10, goods.getRice());
                        stmt.setString(10, goods.getFlour());
                        stmt.setString(10, goods.getWater());
                        stmt.setString(10, goods.getFish());
                        stmt.setString(10, goods.getPork());
			stmt.executeUpdate();
			stmt.close(); 
                        
                        
                        ResultSet rs = stmt.executeQuery();
                        goods = new Goods();
                        
			if (rs.next()) {
                            
			//goods.setIdgoods(rs.getString("too"));
			goods.setRice(rs.getString("bade"));
                        goods.setFlour(rs.getString("fifteen"));
                        goods.setWater(rs.getString("large"));
                        goods.setFish(rs.getString("gigge"));
                        goods.setPork(rs.getString("gigge"));  
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
    
    
    public void  getGoodsDetailsBYid(String idgoods) {
    
      
    Goods goods = null;
     
     try {      
    // open the DB connection to do stuff like getting data or updating data here we are inserting data 
      connection = DatabaseConnectionTest.getConnection();
      System.out.println("[[Your DATABASE is now connected and you can start your goods find by Id statements Query ]]>>" + connection);
      
      if (connection != null) {
          
     
      PreparedStatement stmt = connection.prepareStatement("SELECT idgoods, rice, flour, water, fish, pork " + " FROM goods WHERE idgoods = 2");
			stmt.setString(1, idgoods);
                        stmt.executeUpdate();
                        stmt.close();
                        /*
                        stmt.setInt(2, goods.getIdgoods());
                        stmt.executeUpdate();
			stmt.close(); 
                        */
                        
                        ResultSet rs = stmt.executeQuery();
                        goods = new Goods();
			if (rs.next()) {
                            
                        //goods.setIdgoods(idgoods);    
			//goods.setIdgoods(rs.getString("idgoods"));
			goods.setRice(rs.getString("rice"));
                        goods.setFlour(rs.getString("flour"));
                        goods.setWater(rs.getString("water"));
                        goods.setFish(rs.getString("fish"));
                        goods.setPork(rs.getString("pork")); 
                        
                        //goods.setPork(pork);
			}
			rs.close();                        
			stmt.close();
                        
                        /*
                        List<Goods> goodss = new ArrayList<Goods>();
			stmt = connection.prepareStatement("SELECT * FROM CHAPTER WHERE BOOK_ISBN = ?");
			stmt.setString(1, isbn);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				Goods chapter = new Goods();
				goodss.setTitle(rs.getString("TITLE"));
				goodss.setChapterNumber(rs.getInt("CHAPTER_NUM"));		
				goodss.add(chapter);
			}
			goodss.setChapters(chapters);
                        
                        rs.close();                        
			stmt.close();
                        */
       //This part is to use as example to get object by ID                     
                        
                                               
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
               //return 0;
	} 
    
    
    
    
    
    public void  perisitGoods(Goods goods) {
    
      
    //List<Restruante> restlists = new ArrayList<>();
     
     try {      
    // open the DB connection to do stuff like getting data or updating data here we are inserting data 
      connection = DatabaseConnectionTest.getConnection();
      System.out.println("[[Your DATABASE is now connected and you can start your goods perisit statements Query ]]>>" + connection);
      
      if (connection != null) {
          
     
      PreparedStatement stmt = connection.prepareStatement("INSERT INTO goods(rice, flour, water, fish, pork) " + " VALUES(?, ?, ?, ?, ?)");
			//stmt.setString(50, goods.getIdgoods());	
			stmt.setString(1, goods.getRice());
                        stmt.setString(2, goods.getFlour());
                        stmt.setString(3, goods.getWater());
                        stmt.setString(4, goods.getFish());
                        stmt.setString(5, goods.getPork());
			stmt.executeUpdate();
			stmt.close(); 
                        
                        
                        ResultSet rs = stmt.executeQuery();
                        goods = new Goods();
                        
			if (rs.next()) {
                        //This part is not very important in the insert part of the code
                        goods.setRice(rs.getString("rice"));
                        goods.setFlour(rs.getString("flour"));
                        goods.setWater(rs.getString("water"));
                        goods.setFish(rs.getString("fish"));
                        goods.setPork(rs.getString("pork"));     
  
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
    
    
    public void  upgradeGoodsDetails(Goods goods) {
    
      
    //List<Restruante> restlists = new ArrayList<>();
     
     try {      
    // open the DB connection to do stuff like getting data or updating data here we are inserting data 
      connection = DatabaseConnectionTest.getConnection();
      System.out.println("[[Your DATABASE is now connected and you can start your goods upgrade statements Query ]]>>" + connection);
      
      if (connection != null) {
          
     
      PreparedStatement stmt = connection.prepareStatement("UPDATE goods " + " SET rice=?, flour=?, water=?, fish=?, pork=? WHERE idgoods=?");
			//stmt.setString(50, goods.getIdgoods());	
			stmt.setString(1, goods.getRice());
                        stmt.setString(2, goods.getFlour());
                        stmt.setString(3, goods.getWater());
                        stmt.setString(4, goods.getFish());
                        stmt.setString(5, goods.getPork());
			stmt.executeUpdate();
			stmt.close(); 
                        
                        
                        ResultSet rs = stmt.executeQuery();
                        goods = new Goods();
                        
			if (rs.next()) {
                            
			//goods.setIdgoods(rs.getString("too"));
                        
                        //This part is not very important in the insert part of the code
                        goods.setRice(rs.getString("rice"));
                        goods.setFlour(rs.getString("flour"));
                        goods.setWater(rs.getString("water"));
                        goods.setFish(rs.getString("fish"));
                        goods.setPork(rs.getString("pork"));
                        
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
    
    
    
    
    public void  deleteGoodsDetails(Goods goods) {
    
   
     try {      
    // open the DB connection to do stuff like getting data or updating data here we are inserting data 
      connection = DatabaseConnectionTest.getConnection();
      System.out.println("[[Your DATABASE is now connected and you can start your goods delete statements Query ]]>>" + connection);
      
      if (connection != null) {
          
     
      PreparedStatement stmt = connection.prepareStatement("DELETE FROM goods WHERE idgoods= ?");
                        stmt.setInt(2, goods.getIdgoods());
			stmt.executeUpdate();
			//stmt.close(); 
                                                                                       
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
              // return Goods;
	}
    
    
    
    
    
    

}


