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

public class Accion {

    Main main;
    private ArrayList<Pokemon> pokemones;

    public Accion(Main main) {
        this.main = main;
    }

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

    public void preCargarInformacion() {
        //llamo a retrofit
        ArrayList<Pokemon> desordenado = obtenerEstadisticas();
        ArrayList<PokemonTipoDTO> tipos = obtenerTipos();
        ArrayList<PokemonPuntosCombateDTO> puntosCombate = obtenerPuntosCombate();
        RespuestaCaramelos caramelos = obtenerCaramelos();

        if (desordenado != null) {
            pokemones = new ArrayList<Pokemon>();

            //Agrega a la lista solamente los pokemones normales, no los que son oscuros o purificados
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

        //Prueba
//        for (Pokemon p : pokemones) {
//            System.out.println(String.format("#%s> %s \t| Caramelo:%s | MaxCP:%s | %s", p.getId(), p.getNombre().substring(0, (p.getNombre().length() > 8) ? 8 : p.getNombre().length()), p.getCaramelosRequeridos(), p.getPuntosCombateMaximo(), p.getTipos().toString()));
//        }

    }

    public ArrayList<Pokemon> obtenerEstadisticas() {
        Call<ArrayList<Pokemon>> llamada = RetrofitUtil.getApi().getEstadisticas();
        try {
            return llamada.execute().body();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener datos de internet\n" + ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public RespuestaCaramelos obtenerCaramelos() {
        Call<RespuestaCaramelos> llamada = RetrofitUtil.getApi().getCaramelos();
        try {
            return llamada.execute().body();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener datos de internet\n" + ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public ArrayList<PokemonTipoDTO> obtenerTipos() {
        Call<ArrayList<PokemonTipoDTO>> llamada = RetrofitUtil.getApi().getTipos();
        try {
            return llamada.execute().body();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener datos de internet\n" + ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public ArrayList<PokemonPuntosCombateDTO> obtenerPuntosCombate() {
        Call<ArrayList<PokemonPuntosCombateDTO>> llamada = RetrofitUtil.getApi().getPuntosCombate();
        try {
            return llamada.execute().body();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo un error al obtener datos de internet\n" + ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

}
