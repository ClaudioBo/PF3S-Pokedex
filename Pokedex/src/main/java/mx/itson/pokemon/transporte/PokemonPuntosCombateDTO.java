package mx.itson.pokemon.transporte;
/**
 * 
 * Clase que contiene informacion de los puntos de combate de cada pokemon.
 */
public class PokemonPuntosCombateDTO {

    private int pokemon_id;
    private int max_cp;
    
    /**
     * 
     * @return Regresa el id del pokemon.
     */
    public int getPokemon_id() {
        return pokemon_id;
    }
    /**
     * 
     * @param pokemon_id Pide un entero que interpreta el id del pokemon.
     */
    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }
    /**
     * 
     * @return Regresa los puntos de combate maximo (max_cp).
     */
    public int getMax_cp() {
        return max_cp;
    }
    /**
     * 
     * @param max_cp Pide un entero que interpreta como los puntos de combate maximos.
     */
    public void setMax_cp(int max_cp) {
        this.max_cp = max_cp;
    }
    
    

}
