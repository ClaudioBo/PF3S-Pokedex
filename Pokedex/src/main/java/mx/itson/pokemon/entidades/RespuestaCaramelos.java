package mx.itson.pokemon.entidades;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import mx.itson.pokemon.transporte.PokemonCaramelosDTO;

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

    public ArrayList<PokemonCaramelosDTO> getDoceCaramelos() {
        return doceCaramelos;
    }

    public void setDoceCaramelos(ArrayList<PokemonCaramelosDTO> doceCaramelos) {
        this.doceCaramelos = doceCaramelos;
    }

    public ArrayList<PokemonCaramelosDTO> getVeinteydosCaramelos() {
        return veinteydosCaramelos;
    }

    public void setVeinteydosCaramelos(ArrayList<PokemonCaramelosDTO> veinteydosCaramelos) {
        this.veinteydosCaramelos = veinteydosCaramelos;
    }

    public ArrayList<PokemonCaramelosDTO> getVeinteycincoCaramelos() {
        return veinteycincoCaramelos;
    }

    public void setVeinteycincoCaramelos(ArrayList<PokemonCaramelosDTO> veinteycincoCaramelos) {
        this.veinteycincoCaramelos = veinteycincoCaramelos;
    }

    public ArrayList<PokemonCaramelosDTO> getCuarentaycincoCaramelos() {
        return cuarentaycincoCaramelos;
    }

    public void setCuarentaycincoCaramelos(ArrayList<PokemonCaramelosDTO> cuarentaycincoCaramelos) {
        this.cuarentaycincoCaramelos = cuarentaycincoCaramelos;
    }

    public ArrayList<PokemonCaramelosDTO> getCincuentaCaramelos() {
        return cincuentaCaramelos;
    }

    public void setCincuentaCaramelos(ArrayList<PokemonCaramelosDTO> cincuentaCaramelos) {
        this.cincuentaCaramelos = cincuentaCaramelos;
    }

    public ArrayList<PokemonCaramelosDTO> getNoventaCaramelos() {
        return noventaCaramelos;
    }

    public void setNoventaCaramelos(ArrayList<PokemonCaramelosDTO> noventaCaramelos) {
        this.noventaCaramelos = noventaCaramelos;
    }

    public ArrayList<PokemonCaramelosDTO> getCienCaramelos() {
        return cienCaramelos;
    }

    public void setCienCaramelos(ArrayList<PokemonCaramelosDTO> cienCaramelos) {
        this.cienCaramelos = cienCaramelos;
    }

    public ArrayList<PokemonCaramelosDTO> getTrescientossesentaCaramelos() {
        return trescientossesentaCaramelos;
    }

    public void setTrescientossesentaCaramelos(ArrayList<PokemonCaramelosDTO> trescientossesentaCaramelos) {
        this.trescientossesentaCaramelos = trescientossesentaCaramelos;
    }

    public ArrayList<PokemonCaramelosDTO> getCuatrocientosCaramelos() {
        return cuatrocientosCaramelos;
    }

    public void setCuatrocientosCaramelos(ArrayList<PokemonCaramelosDTO> cuatrocientosCaramelos) {
        this.cuatrocientosCaramelos = cuatrocientosCaramelos;
    }

}
