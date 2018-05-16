package Utils;

import com.google.gson.JsonObject;

import java.util.List;

import model.User;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {


    @GET("/bins/w10ke")
    Call<JsonObject> doGetUsers(


    );


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.myjson.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
