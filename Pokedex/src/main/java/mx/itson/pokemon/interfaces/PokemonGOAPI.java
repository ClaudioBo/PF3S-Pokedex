package mx.itson.pokemon.interfaces;

import java.util.ArrayList;
import mx.itson.pokemon.entidades.Pokemon;
import mx.itson.pokemon.entidades.RespuestaCaramelos;
import mx.itson.pokemon.transporte.PokemonPuntosCombateDTO;
import mx.itson.pokemon.transporte.PokemonTipoDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface PokemonGOAPI {

    @Headers({
        "x-rapidapi-host: pokemon-go1.p.rapidapi.com",
        "x-rapidapi-key: e3981d1a64msh434517943223e49p1f4e4cjsn9da7123fda32"
    })
    @GET("pokemon_stats.json")
    Call<ArrayList<Pokemon>> getEstadisticas();

    @Headers({
        "x-rapidapi-host: pokemon-go1.p.rapidapi.com",
        "x-rapidapi-key: e3981d1a64msh434517943223e49p1f4e4cjsn9da7123fda32"
    })
    @GET("pokemon_candy_to_evolve.json")
    Call<RespuestaCaramelos> getCaramelos();

    @Headers({
        "x-rapidapi-host: pokemon-go1.p.rapidapi.com",
        "x-rapidapi-key: e3981d1a64msh434517943223e49p1f4e4cjsn9da7123fda32"
    })
    @GET("pokemon_types.json")
    Call<ArrayList<PokemonTipoDTO>> getTipos();

    @Headers({
        "x-rapidapi-host: pokemon-go1.p.rapidapi.com",
        "x-rapidapi-key: e3981d1a64msh434517943223e49p1f4e4cjsn9da7123fda32"
    })
    @GET("pokemon_max_cp.json")
    Call<ArrayList<PokemonPuntosCombateDTO>> getPuntosCombate();
}
