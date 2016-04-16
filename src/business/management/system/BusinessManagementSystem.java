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
