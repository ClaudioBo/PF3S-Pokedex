package mx.itson.pokemon.utilerias;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import mx.itson.pokemon.interfaces.PokemonGOAPI;

public class RetrofitUtil {

    public static PokemonGOAPI getApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokemon-go1.p.rapidapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(PokemonGOAPI.class);
    }
}
