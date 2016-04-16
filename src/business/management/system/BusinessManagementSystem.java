/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.management.system;

import business.management.system.APImodels.Query;
import business.management.system.APImodels.Quote;
import business.management.system.APImodels.Stock;
import java.sql.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 *
 * @author saketh
 */
public class BusinessManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
        Connection con=DriverManager.getConnection(  
            "jdbc:oracle:thin:@localhost:1521:xe","saketh","kaparthi");  
  
//step3 create the statement object  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from emp");  
        while(rs.next())  
            System.out.println(rs.getString(1)+"  "+rs.getInt(2));  
  
//step5 close the connection object  
        con.close();  
        Call<Stock> call = APIClient.getAPI().getStocks();
        call.enqueue(new Callback<Stock>() {

            @Override
            public void onResponse(Call<Stock> call, Response<Stock> rspns) {
                for(Quote quote : rspns.body().getQuery().getResults().getQuote()){
                    System.out.println(quote.getName() + " " + quote.getChange());
                }
            }

            @Override
            public void onFailure(Call<Stock> call, Throwable thrwbl) {
                
            }
        });
        
    }
    
}
