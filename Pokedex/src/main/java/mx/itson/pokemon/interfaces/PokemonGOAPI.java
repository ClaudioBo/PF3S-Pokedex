package mx.itson.pokemon.interfaces;

import java.util.ArrayList;
import mx.itson.pokemon.entidades.Pokemon;
import mx.itson.pokemon.transporte.RespuestaCaramelosDTO;
import mx.itson.pokemon.transporte.PokemonPuntosCombateDTO;
import mx.itson.pokemon.transporte.PokemonTipoDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Esta clase contiene a que direccion URL hara el llamado Retrofit
 * para proporcionar la informacion deseada.
 * @author claud
 */
public interface PokemonGOAPI {

    /**
     * Llamado que solicita a los Pokemones y sus respectivas caracteristicas.
     * 
     * URL:
     *  - https://pokemon-go1.p.rapidapi.com/pokemon_stats.json
     * @return Llamado de RetroFit
     */
    @Headers({
        "x-rapidapi-host: pokemon-go1.p.rapidapi.com",
        "x-rapidapi-key: e3981d1a64msh434517943223e49p1f4e4cjsn9da7123fda32"
    })
    @GET("pokemon_stats.json")
    Call<ArrayList<Pokemon>> getEstadisticas();

    /**
     * Llamado que solicita a los caramelos que necesita
     * cada Pokemon para evolucionar.
     * 
     * URL:
     *  - https://pokemon-go1.p.rapidapi.com/pokemon_candy_to_evolve.json
     * @return Llamado de RetroFit
     */
    @Headers({
        "x-rapidapi-host: pokemon-go1.p.rapidapi.com",
        "x-rapidapi-key: e3981d1a64msh434517943223e49p1f4e4cjsn9da7123fda32"
    })
    @GET("pokemon_candy_to_evolve.json")
    Call<RespuestaCaramelosDTO> getCaramelos();

    /**
     * Llamado que solicita que tipos son cada Pokemon.
     * 
     * URL:
     *  - https://pokemon-go1.p.rapidapi.com/pokemon_types.json
     * @return Llamado de RetroFit
     */
    @Headers({
        "x-rapidapi-host: pokemon-go1.p.rapidapi.com",
        "x-rapidapi-key: e3981d1a64msh434517943223e49p1f4e4cjsn9da7123fda32"
    })
    @GET("pokemon_types.json")
    Call<ArrayList<PokemonTipoDTO>> getTipos();

    /**
     * Llamado que solicita cuantos puntos de combate maximo
     * puede llegar cada Pokemon.
     * 
     * URL:
     *  - https://pokemon-go1.p.rapidapi.com/pokemon_max_cp.json
     * @return Llamado de RetroFit
     */
    @Headers({
        "x-rapidapi-host: pokemon-go1.p.rapidapi.com",
        "x-rapidapi-key: e3981d1a64msh434517943223e49p1f4e4cjsn9da7123fda32"
    })
    @GET("pokemon_max_cp.json")
    Call<ArrayList<PokemonPuntosCombateDTO>> getPuntosCombate();
}
