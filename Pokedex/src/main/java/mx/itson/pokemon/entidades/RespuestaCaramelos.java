package mx.itson.pokemon.entidades;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import mx.itson.pokemon.transporte.PokemonCaramelosDTO;

/**
 * 
 * Recibe las lista de los caramelos que los pokemones necesitan para evolucionar.
 */
public class RespuestaCaramelos {

    @SerializedName("12")
    private ArrayList<PokemonCaramelosDTO> doceCaramelos;

    @SerializedName("22")
    private ArrayList<PokemonCaramelosDTO> veinteydosCaramelos;

    @SerializedName("25")
    private ArrayList<PokemonCaramelosDTO> veinteycincoCaramelos;

    @SerializedName("45")
    private ArrayList<PokemonCaramelosDTO> cuarentaycincoCaramelos;

    @SerializedName("50")
    private ArrayList<PokemonCaramelosDTO> cincuentaCaramelos;

    @SerializedName("90")
    private ArrayList<PokemonCaramelosDTO> noventaCaramelos;

    @SerializedName("100")
    private ArrayList<PokemonCaramelosDTO> cienCaramelos;

    @SerializedName("360")
    private ArrayList<PokemonCaramelosDTO> trescientossesentaCaramelos;

    @SerializedName("400")
    private ArrayList<PokemonCaramelosDTO> cuatrocientosCaramelos;

    /**
     * Obtiene un lista de la api de los caramelos que los 
     * pokemones que ocupan 12 caramelos para evolucionar.
     
     * @return Un lista de la api de los caramelos que los 
     * pokemones que ocupan 12 caramelos para evolucionar.
     */
    public ArrayList<PokemonCaramelosDTO> getDoceCaramelos() {
        return doceCaramelos;
    }

    /**
     * Cambia la lista de la api de los caramelos que los
     * pokemones que ocupan 12 caramelos para evolucionar.
     * 
     * @param doceCaramelos La lista de la api de los caramelos que los
     * pokemones que ocupan 12 caramelos para evolucionar.
     */
    public void setDoceCaramelos(ArrayList<PokemonCaramelosDTO> doceCaramelos) {
        this.doceCaramelos = doceCaramelos;
    }

    /**
     * Obtiene una lista de la api de los caramelos que los
     * pokemones que ocupan 22 caramelos para evolucionar.
     * @return Una lista de la api de los caramelos que los
     * pokemones que ocupan 22 caramelos para evolucionar.
     */
    public ArrayList<PokemonCaramelosDTO> getVeinteydosCaramelos() {
        return veinteydosCaramelos;
    }

    /**
     * Cambia una lista de la api de los caramelos que los
     * pokemones que ocupan 22 caramelos para evolucionar.
     * 
     * @param veinteydosCaramelos Un lista de la api de los 
     * caramelos que los pokemones que ocupan 22 caramelos para evolucionar.
     */
    public void setVeinteydosCaramelos(ArrayList<PokemonCaramelosDTO> veinteydosCaramelos) {
        this.veinteydosCaramelos = veinteydosCaramelos;
    }

    /**
     * Obtiene una lista de la api de los caramelos que los
     * pokemones que ocupan 25 caramelos para evolucionar.
     * 
     * @return Una lista de la api de los caramelos que los
     * pokemones que ocupan 25 caramelos para evolucionar.
     */
    public ArrayList<PokemonCaramelosDTO> getVeinteycincoCaramelos() {
        return veinteycincoCaramelos;
    }

    /**
     * Cambia una lista de la api de los caramelos que los
     * pokemones que ocupan 25 caramelos para evolucionar.
     * 
     * @param veinteycincoCaramelos Una lista de la api de los caramelos que los
     * pokemones que ocupan 25 caramelos para evolucionar.
     */
    public void setVeinteycincoCaramelos(ArrayList<PokemonCaramelosDTO> veinteycincoCaramelos) {
        this.veinteycincoCaramelos = veinteycincoCaramelos;
    }

    /**
     * Obitiene una lista de la api de los caramelos que los
     * pokemones que ocupan 45 caramelos para evolucionar.
     * 
     * @return Una lista de la api de los caramelos que los
     * pokemones que ocupan 45 caramelos para evolucionar.
     */
    public ArrayList<PokemonCaramelosDTO> getCuarentaycincoCaramelos() {
        return cuarentaycincoCaramelos;
    }

    /**
     * Cambia una lista de la api de los caramelos que los
     * pokemones que ocupan 45 caramelos para evolucionar.
     * 
     * @param cuarentaycincoCaramelos Una lista de la api de los caramelos que los
     * pokemones que ocupan 45 caramelos para evolucionar.
     */
    public void setCuarentaycincoCaramelos(ArrayList<PokemonCaramelosDTO> cuarentaycincoCaramelos) {
        this.cuarentaycincoCaramelos = cuarentaycincoCaramelos;
    }

    /**
     * Obitiene una lista de la api de los caramelos que los
     * pokemones que ocupan 50 caramelos para evolucionar.
     * 
     * @return Una lista de la api de los caramelos que los
     * pokemones que ocupan 50 caramelos para evolucionar.
     */
    public ArrayList<PokemonCaramelosDTO> getCincuentaCaramelos() {
        return cincuentaCaramelos;
    }

    /**
     * Cambia una lista de la api de los caramelos que los
     * pokemones que ocupan 50 caramelos para evolucionar.
     * 
     * @param cincuentaCaramelos Una lista de la api de los caramelos que los
     * pokemones que ocupan 50 caramelos para evolucionar.
     */
    public void setCincuentaCaramelos(ArrayList<PokemonCaramelosDTO> cincuentaCaramelos) {
        this.cincuentaCaramelos = cincuentaCaramelos;
    }

    /**
     * Obitiene una lista de la api de los caramelos que los
     * pokemones que ocupan 90 caramelos para evolucionar.
     * 
     * @return Una lista de la api de los caramelos que los
     * pokemones que ocupan 90 caramelos para evolucionar.
     */
    public ArrayList<PokemonCaramelosDTO> getNoventaCaramelos() {
        return noventaCaramelos;
    }

    /**
     * Cambia una lista de la api de los caramelos que los
     * pokemones que ocupan 90 caramelos para evolucionar.
     * 
     * @param noventaCaramelos Una lista de la api de los caramelos que los
     * pokemones que ocupan 90 caramelos para evolucionar.
     */
    public void setNoventaCaramelos(ArrayList<PokemonCaramelosDTO> noventaCaramelos) {
        this.noventaCaramelos = noventaCaramelos;
    }

    /**
     * Obitiene una lista de la api de los caramelos que los
     * pokemones que ocupan 100 caramelos para evolucionar.
     * 
     * @return Obitiene una lista de la api de los caramelos que los
     * pokemones que ocupan 100 caramelos para evolucionar.
     */
    public ArrayList<PokemonCaramelosDTO> getCienCaramelos() {
        return cienCaramelos;
    }

    /**
     * Cambia una lista de la api de los caramelos que los
     * pokemones que ocupan 100 caramelos para evolucionar
     * 
     * @param cienCaramelos Una lista de la api de los caramelos que los
     * pokemones que ocupan 100 caramelos para evolucionar.
     */
    public void setCienCaramelos(ArrayList<PokemonCaramelosDTO> cienCaramelos) {
        this.cienCaramelos = cienCaramelos;
    }

    /**
     * Obitiene una lista de la api de los caramelos que los
     * pokemones que ocupan 360 caramelos para evolucionar.
     * 
     * @return Una lista de la api de los caramelos que los
     * pokemones que ocupan 360 caramelos para evolucionar.
     */
    public ArrayList<PokemonCaramelosDTO> getTrescientossesentaCaramelos() {
        return trescientossesentaCaramelos;
    }

    /**
     * Cambia una lista de la api de los caramelos que los
     * pokemones que ocupan 360 caramelos para evolucionar
     * 
     * @param trescientossesentaCaramelos Cambia una lista de la api de los caramelos que los
     * pokemones que ocupan 360 caramelos para evolucionar
     */
    public void setTrescientossesentaCaramelos(ArrayList<PokemonCaramelosDTO> trescientossesentaCaramelos) {
        this.trescientossesentaCaramelos = trescientossesentaCaramelos;
    }

    /**
     * Obitiene una lista de la api de los caramelos que los
     * pokemones que ocupan 400 caramelos para evolucionar.
     * 
     * @return Una lista de la api de los caramelos que los
     * pokemones que ocupan 400 caramelos para evolucionar.
     */
    public ArrayList<PokemonCaramelosDTO> getCuatrocientosCaramelos() {
        return cuatrocientosCaramelos;
    }

    /**
     * Cambia una lista de la api de los caramelos que los
     * pokemones que ocupan 400 caramelos para evolucionar.
     * 
     * @param cuatrocientosCaramelos Una lista de la api de los caramelos que los
     * pokemones que ocupan 400 caramelos para evolucionar.
     */
    public void setCuatrocientosCaramelos(ArrayList<PokemonCaramelosDTO> cuatrocientosCaramelos) {
        this.cuatrocientosCaramelos = cuatrocientosCaramelos;
    }

}
