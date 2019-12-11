package mx.itson.pokemon.entidades;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Pokemon {

    @SerializedName("pokemon_id")
    private int id;
    @SerializedName("pokemon_name")
    private String nombre;

    @SerializedName("form")
    private String forma;

    @SerializedName("base_attack")
    private int puntosAtaque;
    @SerializedName("base_defense")
    private int puntosDefensa;
    @SerializedName("base_stamina")
    private int puntosEnergia;

    //https://pokemon-go1.p.rapidapi.com/pokemon_candy_to_evolve.json
    private int caramelosRequeridos;

    //https://pokemon-go1.p.rapidapi.com/pokemon_types.json
    private ArrayList<String> tipos;

    //https://pokemon-go1.p.rapidapi.com/pokemon_max_cp.json
    private int puntosCombateMaximo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getPuntosEnergia() {
        return puntosEnergia;
    }

    public void setPuntosEnergia(int puntosEnergia) {
        this.puntosEnergia = puntosEnergia;
    }

    public int getCaramelosRequeridos() {
        return caramelosRequeridos;
    }

    public void setCaramelosRequeridos(int caramelosRequeridos) {
        this.caramelosRequeridos = caramelosRequeridos;
    }

    public ArrayList<String> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<String> tipos) {
        this.tipos = tipos;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getPuntosCombateMaximo() {
        return puntosCombateMaximo;
    }

    public void setPuntosCombateMaximo(int puntosCombateMaximo) {
        this.puntosCombateMaximo = puntosCombateMaximo;
    }

}
