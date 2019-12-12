package mx.itson.pokemon.utilerias;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import mx.itson.pokemon.interfaces.PokemonGOAPI;

/**
 * El unico proposito de esta clase es para crear "el cliente" por medio
 * de Retrofit para que podamos utilizarla para poder obtener los
 * resultados proporcionados por la API que elegimos.
 * @author claud
 */
public class RetrofitUtil {

    /**
     * Prepara el cliente para conectarse a la api. 
     * @return El cliente para conectarse a la api 
     */
    public static PokemonGOAPI getApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokemon-go1.p.rapidapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(PokemonGOAPI.class);
    }
}
