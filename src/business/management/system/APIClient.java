/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.management.system;


import business.management.system.APImodels.Stock;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 *
 * @author saketh
 */
public class APIClient {
    /**
     *
     * @return
     */
    public static YahooService getAPI(){
         Retrofit retrofit = new Retrofit.Builder()
    .baseUrl("https://query.yahooapis.com/v1/public/")
    .addConverterFactory(GsonConverterFactory.create())
    .build();

    YahooService service = retrofit.create(YahooService.class);
    return service;
    }
    public interface YahooService {
        @GET
        Call<Stock> getStocks(@Url String url);
}
    
}
