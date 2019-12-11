package mx.itson.pokemon.transporte;

import java.util.ArrayList;

public class PokemonTipoDTO {
    
    private int pokemon_id;
    private ArrayList<String> type;

    public int getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public ArrayList<String> getType() {
        return type;
    }

    public void setType(ArrayList<String> type) {
        this.type = type;
    }
    
    

}
