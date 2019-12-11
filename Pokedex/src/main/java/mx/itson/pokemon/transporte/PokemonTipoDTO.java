package mx.itson.pokemon.transporte;

import java.util.ArrayList;
/**
 * 
 * Clase que guarda los tipos de pokemones.
 */

public class PokemonTipoDTO {
    
    private int pokemon_id;
    private ArrayList<String> type;
    
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
     * @return Obtiene la lista en donde se encuentran todos los tipos de ese pokemon.
     */
    public ArrayList<String> getType() {
        return type;
    }
    /**
     * 
     * @param type Pide una lista que interpreta como los pokemones existentes de ese tipo.
     */
    public void setType(ArrayList<String> type) {
        this.type = type;
    }
    
    

}
