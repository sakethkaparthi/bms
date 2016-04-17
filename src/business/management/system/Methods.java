/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.sql.DATE;
import oracle.sql.TIMESTAMP;

/**
 *
 * @author saketh
 */
public class Methods {
    static String USER = "saketh";
    static String PASS = "kaparthi";
    static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static Connection conn = null;
    static Statement stmt = null;
    
    
    public static void insertIntoEmloyee(String id,String name,String address,String email,String phone,String designation,long salary, int teamId){
        try{
      //STEP 2: Register JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      String sql = null;
      sql = "INSERT INTO employee " +
                   "VALUES('"+id+"','"+
                            name+"','"+
                            address+"','"+
                            email+"','"+
                            phone+"','"+
                            designation+"',"+
                            salary+","+
                            teamId+")";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
    }
    
    public static void insertIntoProject(int id,String name,int teamId,String status,String date){
         try{
      //STEP 2: Register JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      String sql = null;
      sql = "INSERT INTO project " +
                   "VALUES("+id+",'"+
                            name+"',"+
                            teamId+",'"+
                            status+"','"+
                            date+"')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }
    }
    
    public static void insertIntoInventory(int id,String name,int sp,int cp,int quantity){
        try{
      //STEP 2: Register JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      String sql = null;
      sql = "INSERT INTO inventory " +
                   "VALUES("+id+",'"+
                            name+"',"+
                            sp+","+
                            cp+","+
                            quantity+")";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }
    }
    
    public static void insertIntoRecords(String id, String activity, TIMESTAMP timestamp){
        try{
      //STEP 2: Register JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      String sql = null;
      sql = "INSERT INTO record " +
                   "VALUES("+id+",'"+
                            activity+"',"+
                            timestamp+"')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }
    }
    
    public static void insertIntoClient(int id, String name, String phone, int project_id,String email){
        try{
      //STEP 2: Register JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      String sql = null;
      sql = "INSERT INTO client " +
                   "VALUES("+id+",'"+
                            name+"','"+
                            phone+"',"+
                            project_id+",'"+
                            email+"')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }
    }
    
    public static void insertIntoSchedule(int teamId,String Schedule){
        try{
      //STEP 2: Register JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      String sql = null;
      sql = "INSERT INTO schedule " +
                   "VALUES("+teamId+",'"+
                            Schedule+"')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }
    }
    public static void insertIntoUserPass(String userName,String password){
        try{
      //STEP 2: Register JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      String sql = null;
      sql = "INSERT INTO userpass " +
                   "VALUES('"+userName+"','"+
                            password+"')";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }
    }

    public static ResultSet getEmployees() throws SQLException{
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "SELECT * FROM employee";
      ResultSet rs = stmt.executeQuery(sql);
      return rs;
    }
    
    public static ResultSet getProjects() throws SQLException{
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "SELECT * FROM project";
      ResultSet rs = stmt.executeQuery(sql);
      return rs;
    }
    
    public static ResultSet getInventory() throws SQLException{
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "SELECT * FROM inventory";
      ResultSet rs = stmt.executeQuery(sql);
      return rs;
    }
    
    public static ResultSet getRecords() throws SQLException{
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "SELECT * FROM record";
      ResultSet rs = stmt.executeQuery(sql);
      return rs;
    }
    
    public static ResultSet getClients() throws SQLException{
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "SELECT * FROM client";
      ResultSet rs = stmt.executeQuery(sql);
      return rs;
    }
    
    public static ResultSet getTeamProjectCount() throws SQLException{
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "select team_id,count(*) from project where status = 'complete' group by team_id";
      ResultSet rs = stmt.executeQuery(sql);
      return rs;
    }
    
    public static ResultSet getSchedules() throws SQLException{
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "select * from schedule";
      ResultSet rs = stmt.executeQuery(sql);
      return rs;
    }
    
    public static ResultSet getUserData() throws SQLException{
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "select * from userpass";
      ResultSet rs = stmt.executeQuery(sql);
      return rs;
    }
    
    public static void updatePassword(String username,String password) throws SQLException{
        try{
      //STEP 2: Register JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      String sql = null;
      sql = "update userpass set password='"+password+"'"
              + "where username ='"+username+"'";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }
    }

    static void updateSchedule(int parseInt, String toString) {
        try{
      //STEP 2: Register JDBC driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      stmt = conn.createStatement();
      String sql = null;
      sql = "update schedule set schedule='"+toString+"'"
              + "where team_id ="+parseInt;
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }
    }
    
}
