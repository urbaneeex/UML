package ed.ecv0520;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;

enum Genero {
    DRAMA, COMEDIA, ACCTION, TERROR, ROMANCE, AVENTURA, SCI-FI
}

public class Pelicula {
    // atributos
    private String titulo;
    private Date agno;
    private String sinopsis;
    private Genero genero;
    private String pais;

    // relaciones
    private Collection actores = new ArrayList<Actor>();
    private Collection directores = new ArrayList<Director>();
    private Collection productores = new ArrayList<Productor>();
    private Collection guionistas = new ArrayList<Guionista>();

    private Collection trailers;

    // constructores

    public Pelicula () {
        trailers = new ArrayList<Trailer>();
    }

    // a continuación irían los getters y setters

}