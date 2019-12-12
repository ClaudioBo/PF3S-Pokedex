package mx.itson.pokemon.acciones;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mx.itson.pokemon.entidades.Pokemon;
import mx.itson.pokemon.entidades.RespuestaCaramelos;
import mx.itson.pokemon.presentacion.Main;
import mx.itson.pokemon.transporte.PokemonCaramelosDTO;
import mx.itson.pokemon.transporte.PokemonPuntosCombateDTO;
import mx.itson.pokemon.transporte.PokemonTipoDTO;
import mx.itson.pokemon.utilerias.RetrofitUtil;
import retrofit2.Call;

/**
 * Esta clase contiene todas las funciones del programa para que funcione Como
 * por ejemplo la obtencion de datos, la muestra de la informacion, etc.
 *
 * @author claud
 */
public class Accion {

    Main main;
    private ArrayList<Pokemon> pokemones;

    /**
     * Constructor que recibe la clase Main, para comunicarse entre si.
     *
     * @param main Clase Main
     */
    public Accion(Main main) {
        this.main = main;
    }

    /**
     * Asigna la imagen del Pokemon especificado en dos labels dependiendo si
     * tiene mas tipos
     *
     * @param p Pokemon para poner
     */
    public void setFotoTipos(Pokemon p) {

        try {
            main.lblTipo1.setText("");
            String tipo = p.getTipos().get(0).toLowerCase();
            String url = "http://149.56.130.193/proyecto-claudio/tipos/" + tipo + ".gif";
            Image img = ImageIO.read(new URL(url));
            ImageIcon img2 = new ImageIcon(img.getScaledInstance(100, 40, Image.SCALE_SMOOTH));
            main.lblTipo1.setIcon(img2);
            main.lblTipo2.setText("");

            if (p.getTipos().size() == 2) {

                try {
                    main.lblTipo2.setVisible(true);
                    String tipo2 = p.getTipos().get(1).toLowerCase();
                    url = "http://149.56.130.193/proyecto-claudio/tipos/" + tipo2 + ".gif";
                    img = ImageIO.read(new URL(url));
                    img2 = new ImageIcon(img.getScaledInstance(100, 40, Image.SCALE_SMOOTH));
                    main.lblTipo2.setIcon(img2);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Asigna la imagen del Pokemon especificado en una label
     *
     * @param p Pokemon para poner
     */
    public void setFotoChico(Pokemon p) {

        try {
            main.lblPokemonIcono.setText("");
            String url = "http://149.56.130.193/proyecto-claudio/chicos/" + p.getNombre() + "_icon.png";
            Image img = ImageIO.read(new URL(url));
            ImageIcon img2 = new ImageIcon(img.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
            main.lblPokemonIcono.setIcon(img2);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Asigna la imagen del Pokemon especificado en una label
     *
     * @param p Pokemon para poner
     */
    public void setFotoGrande(Pokemon p) {

        try {
            main.lblFotoPokemon.setText("");
            String url = "http://149.56.130.193/proyecto-claudio/grande/" + p.getId() + ".png";
            Image img = ImageIO.read(new URL(url));
            ImageIcon img2 = new ImageIcon(img.getScaledInstance(300, 300, Image.SCALE_SMOOTH));
            main.lblFotoPokemon.setIcon(img2);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Accion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Funcion que utlizamos para obtener la imagen de una URL especificada
     *
     * @param url Direccion donde esta la imagen alojada
     * @return Objecto que contiene la imagen
     */
    public Image obtenerImagen(String url) {

        try {
            URL linkFoto = new URL(url);
            Image foto = null;

            foto = ImageIO.read(linkFoto);
            return new ImageIcon(foto).getImage();
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    /**
     * Busca a un Pokemon por medio de lo que ingrese el Usuario Puede ser por
     * un numero de pokemon (ID) o tambien por su nombre
     *
     * @param texto Texto ingresado por el usuario
     * @return Objecto de tipo Pokemon
     */
    public Pokemon buscar(String texto) {

        boolean esNumero = false;

        int id = 0;

        try {
            id = Integer.valueOf(texto);
            esNumero = true;
        } catch (Exception e) {
        }

        Pokemon deseado = null;

        if (esNumero) {
            //Busqueda por numero

            for (Pokemon p : pokemones) {

                if (p.getId() == id) {
                    deseado = p;
                    break;
                }

            }
        } else {
            //Busqueda por nombre
            for (Pokemon p : pokemones) {

                if (p.getNombre().equalsIgnoreCase(texto)) {
                    deseado = p;
                    break;
                }
            }

        }
        return deseado;

    }

    /**
     * Hace los llamados a las APIS para obtener los datos sobre: • Estadisticas
     * de los Pokemones (Ej: ID, Nombre, Puntos de ATAQUE, DEFENSA, etc.) •
     * Caramelos para evolucionar cada Pokemon (Ej: 300 caramelos) • Puntos de
     * combate maximos de cada Pokemon (Ej: 3240 CP) • Los tipos de cada Pokemon
     * (Ej: Fuego, Acero, Electrico, etc) y mete toda información de cada
     * Pokemon en su propia clase.
     */
    public void preCargarInformacion() {
        /**
         * Hace los llamados a Retrofit y las respuestas las deserealiza en sus
         * respectivas listas.
         */
        ArrayList<Pokemon> desordenado = obtenerEstadisticas();
        ArrayList<PokemonTipoDTO> tipos = obtenerTipos();
        ArrayList<PokemonPuntosCombateDTO> puntosCombate = obtenerPuntosCombate();
        RespuestaCaramelos caramelos = obtenerCaramelos();

        /**
         * Aqui de la lista de los Pokemones que recibimos de la API, solo
         * utilizaremos los Pokemones que sean de forma 'Normal', descartando
         * los que son 'Purificados' o 'Oscuros' Todos los pokemones quedaran
         * guardados en la variable lista 'pokemones'
         */
        if (desordenado != null) {
            pokemones = new ArrayList<Pokemon>();
            for (Pokemon pkmn : desordenado) {
                if (pkmn.getId() <= 151) {
                    if (pkmn.getForma() != null) {
                        if (pkmn.getForma().equals("Normal")) {
                            pokemones.add(pkmn);
                        }
                    } else {
                        pokemones.add(pkmn);
                    }
                }
            }
        }

        /**
         * Recorreremos la lista de Pokemones con sus respectivos tipos que nos
         * regreso la API, para mandar la lista de los tipos de cada Pokemon en
         * su clase respectiva en la variable lista 'pokemon'
         */
        if (tipos != null) {
            for (PokemonTipoDTO tipo : tipos) {
                if (tipo.getPokemon_id() <= 151) {
                    for (Pokemon pokemon : pokemones) {
                        if (pokemon.getId() == tipo.getPokemon_id()) {
                            if (pokemon.getTipos() == null) {
                                pokemon.setTipos(tipo.getType());
                            }
                            break;
                        }
                    }
                }
            }
        }

        /**
         * Como la API nos regresa varias listas, juntamos todas esas listas en
         * una sola para recorrerlas y realizar lo que se explicara abajo. (Esto
         * evitara copiar el mismo codigo 9 veces y dejar un desorden en el
         * codigo)
         *
         * Recorreremos la lista de Pokemones con sus respectiva cantidad de
         * caramelos para evolucionar que nos regreso la API, para mandar la
         * cantidad de los caramelos de cada Pokemon en su clase respectiva en
         * la variable lista 'pokemon'
         *
         */
        if (caramelos != null) {
            ArrayList<ArrayList<PokemonCaramelosDTO>> listaDeListas = new ArrayList<>();
            listaDeListas.add(caramelos.getCienCaramelos());
            listaDeListas.add(caramelos.getCincuentaCaramelos());
            listaDeListas.add(caramelos.getCuarentaycincoCaramelos());
            listaDeListas.add(caramelos.getCuatrocientosCaramelos());
            listaDeListas.add(caramelos.getDoceCaramelos());
            listaDeListas.add(caramelos.getNoventaCaramelos());
            listaDeListas.add(caramelos.getTrescientossesentaCaramelos());
            listaDeListas.add(caramelos.getVeinteycincoCaramelos());
            listaDeListas.add(caramelos.getVeinteydosCaramelos());
            for (ArrayList<PokemonCaramelosDTO> lista : listaDeListas) {
                for (PokemonCaramelosDTO tipo : lista) {
                    if (tipo.getPokemon_id() <= 151) {
                        for (Pokemon pokemon : pokemones) {
                            if (pokemon.getId() == tipo.getPokemon_id()) {
                                if (pokemon.getCaramelosRequeridos() == 0) {
                                    pokemon.setCaramelosRequeridos(tipo.getCandy_required());
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }

        /**
         * Recorreremos la lista de Pokemones con sus respectivos puntos de
         * combate maximo que nos regreso la API, para mandar el numero de los
         * puntos de combate maximo de cada Pokemon en su clase respectiva en la
         * variable lista 'pokemon'
         */
        for (PokemonPuntosCombateDTO cp : puntosCombate) {
            for (PokemonPuntosCombateDTO pkmn : puntosCombate) {
                if (pkmn.getPokemon_id() <= 151) {
                    for (Pokemon pokemon : pokemones) {
                        if (pokemon.getId() == pkmn.getPokemon_id()) {
                            if (pokemon.getPuntosCombateMaximo() == 0) {
                                pokemon.setPuntosCombateMaximo(pkmn.getMax_cp());
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * Aqui se llama a la API por medio de Retrofit, para obtener a los
     * Pokemones con sus nombres y puntos de combate, etc y retornara la
     * respuesta deserealizada
     *
     * @return Lista que contiene Pokemones
     */
    public ArrayList<Pokemon> obtenerEstadisticas() {
        /**
         * Aqui llama a Retrofit para realizar el llamado a la API
         */
        Call<ArrayList<Pokemon>> llamada = RetrofitUtil.getApi().getEstadisticas();
        try {
            //Aqui se deserealiza
            return llamada.execute().body();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener datos de internet\n" + ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     * Aqui se llama a la API por medio de Retrofit, para obtener los caramelos
     * que necesita cada pokemon para evolucionar y retornara la respuesta
     * deserealizada
     *
     * @return Objecto que contiene ID del Pokemon y su respectiva cantidad para
     * evolucionar
     */
    public RespuestaCaramelos obtenerCaramelos() {
        /**
         * Aqui llama a Retrofit para realizar el llamado a la API
         */
        Call<RespuestaCaramelos> llamada = RetrofitUtil.getApi().getCaramelos();
        try {
            //Aqui se deserealiza
            return llamada.execute().body();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener datos de internet\n" + ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     * Aqui se llama a la API por medio de Retrofit, para obtener a los
     * Pokemones con sus tipos y retornara la respuesta deserealizada
     *
     * @return Lista que contiene una clase con ID de Pokemon y su lista de
     * tipos
     */
    public ArrayList<PokemonTipoDTO> obtenerTipos() {
        /**
         * Aqui llama a Retrofit para realizar el llamado a la API
         */
        Call<ArrayList<PokemonTipoDTO>> llamada = RetrofitUtil.getApi().getTipos();
        try {
            //Aqui se deserealiza
            return llamada.execute().body();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener datos de internet\n" + ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     * Aqui se llama a la API por medio de Retrofit, para obtener a los
     * Pokemones con su puntos maximos de combate y retornara la respuesta
     * deserealizada
     *
     * @return Lista que contiene Pokemones con su ID y puntos maximos de
     * combate
     */
    public ArrayList<PokemonPuntosCombateDTO> obtenerPuntosCombate() {
        /**
         * Aqui llama a Retrofit para realizar el llamado a la API
         */
        Call<ArrayList<PokemonPuntosCombateDTO>> llamada = RetrofitUtil.getApi().getPuntosCombate();
        try {
            //Aqui se deserealiza
            return llamada.execute().body();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener datos de internet\n" + ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     * Esto regresara la lista de todos los Pokemones
     *
     * @return Lista contenedora de Pokemones
     */
    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    /**
     * Esto reemplazara la lista de Pokemones
     *
     * @param pokemones Lista nueva contenedora de Pokemones
     */
    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

}
