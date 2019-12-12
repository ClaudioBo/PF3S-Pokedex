package mx.itson.pokemon.entidades;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 *
 * Es la clase principal en la cual se junta la informacion que suelta al api en
 * una sola clase.
 */
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

    private int caramelosRequeridos;
    private ArrayList<String> tipos;
    private int puntosCombateMaximo;

    /**
     * Obtine la id del pokemon.
     *
     * @return La id del pokemon.
     */
    public int getId() {
        return id;
    }

    /**
     * Cambia la id del pokemon.
     *
     * @param id La id del pokemon.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del pokemon.
     *
     * @return El nombre del pokmon.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del pokemon.
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los puntos de ataque del pokemon.
     *
     * @return Los puntos de ataque del pokemon.
     */
    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    /**
     * Cambia los puntos de ataque del pokemon.
     *
     * @param puntosAtaque Los puntos de ataque del pokemon.
     */
    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    /**
     * Obtiene los puntos de defensa del pokemon.
     *
     * @return Los puntos de defensa del pokemon.
     */
    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    /**
     * Cambia los puntos de denfensa del pokemon.
     *
     * @param puntosDefensa Los puntos de defensa de pokemon.
     */
    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    /**
     * Obtiene los puntos de energia del pokemon.
     *
     * @return Los puntos de energia del pokemon.
     */
    public int getPuntosEnergia() {
        return puntosEnergia;
    }

    /**
     * Cambia los puntos de energis del pokemon.
     *
     * @param puntosEnergia Los puntosd e energia del pokemon.
     */
    public void setPuntosEnergia(int puntosEnergia) {
        this.puntosEnergia = puntosEnergia;
    }

    /**
     * Obtiene los caramelos requeridos para evolucionar del pokemon.
     *
     * @return Los caramelos requeridos para evolucionar del pokemon.
     */
    public int getCaramelosRequeridos() {
        return caramelosRequeridos;
    }

    /**
     * Cambia los caramelos requeridos para evolucionar del pokemon.
     *
     * @param caramelosRequeridos Los caramelos requeridos para evolucionar.
     */
    public void setCaramelosRequeridos(int caramelosRequeridos) {
        this.caramelosRequeridos = caramelosRequeridos;
    }

    /**
     * Obtiene una lista de los tipos del pokemon.
     *
     * @return Una lista de de los tipos del pokemon.
     */
    public ArrayList<String> getTipos() {
        return tipos;
    }

    /**
     * Cambia la lista de los tipos del pokemon.
     *
     * @param tipos La lisra de los tipos del pokemon.
     */
    public void setTipos(ArrayList<String> tipos) {
        this.tipos = tipos;
    }

    /**
     * Obtiene si el pokemon es normal, obscuro, purificado, o nulo.
     *
     * @return Si el pokemon es normal, obscuro, purificado, o nulo.
     */
    public String getForma() {
        return forma;
    }

    /**
     * Cambia si el pokemon es nomal, obscuro, purificado, o nulo.
     *
     * @param forma Si el pokemon es normal, obscuro, purificado, o nulo.
     */
    public void setForma(String forma) {
        this.forma = forma;
    }

    /**
     * Obtiene los puntos maximos combate que puede tener un pokemon.
     *
     * @return Los puntos maximos combate que puede tener un pokemon.
     */
    public int getPuntosCombateMaximo() {
        return puntosCombateMaximo;
    }

    /**
     * Cambia los puntos maximos de combate que puede tener un pokemon.
     *
     * @param puntosCombateMaximo Los puntos maximos de combate que puede tener
     * un pokemon.
     */
    public void setPuntosCombateMaximo(int puntosCombateMaximo) {
        this.puntosCombateMaximo = puntosCombateMaximo;
    }

}
