package mx.itson.pokemon.transporte;
/**
 * 
 * @author Clase que contiene los caramelos de cada pokemon.
 */
public class PokemonCaramelosDTO {

    private int pokemon_id;
    private int candy_required;
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
     * @return Regresa la cantidad de caramelos requeridos para evolucionar.
     */
    public int getCandy_required() {
        return candy_required;
    }
    /**
     * 
     * @param candy_required Pide un entero que interpreta como la catidad de caramelos que tiene.
     */
    public void setCandy_required(int candy_required) {
        this.candy_required = candy_required;
    }
    
    

}
