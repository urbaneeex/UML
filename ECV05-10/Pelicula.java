package ed.ecv0510;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;

enum Genero {
    DRAMA, COMEDIA, ACCTION, TERROR, ROMANCE, AVENTURA, SCI_FI
}

public class Pelicula {
    // atributos
    private String titulo;
    private Date agno;
    private String sinopsis;
    private Genero genero;
    private String pais;

    // relaciones
    private Collection actores = new ArrayList<Persona>();
    private Collection directores = new ArrayList<Persona>();
    private Collection productores = new ArrayList<Persona>();
    private Collection guionistas = new ArrayList<Persona>();

    private Collection trailers;

    // constructores

    public Pelicula () {
        trailers = new ArrayList<Trailer>();
    }

    // a continuación irían los getters y setters

}
