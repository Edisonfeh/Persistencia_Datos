package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Optional;

public class Serie {

    private String titulo;
    private Integer totalTemporadas;
    private  Double evaluacion;
    private String poster;
    private  Categoria genero;
    private String actores;
    private String sinopsis;
    //Constructor
    public Serie(DatosSerie datosSerie) {
        this.titulo = datosSerie.titulo();
        this.totalTemporadas = datosSerie.totalTemporadas();
        //Transformacion de conversion Satring a Double
        this.evaluacion = Optional.of(Double.valueOf(datosSerie.evaluacion())).orElse(0.0);
        this.poster = datosSerie.poster();
        //convierte tops de dato String a Doubel
        this.genero = Categoria.valueOf(datosSerie.genero().split(",")[0].trim());
        this.actores = datosSerie.actores();
        this.sinopsis = datosSerie.sinopsis();
    }

//creacion de getter y setter con click derecho generate y to string que funciona para mapear o traer la informaciones

    @Override
    public String toString() {
        return
                " genero=" + genero +
                "titulo='" + titulo + '\'' +
                ", totalTemporadas=" + totalTemporadas +
                ", evaluacion=" + evaluacion +
                ", poster='" + poster + '\'' +

                ", actores='" + actores + '\'' +
                ", sinopsis='" + sinopsis + '\'' ;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Categoria getGenero() {
        return genero;
    }

    public void setGenero(Categoria genero) {
        this.genero = genero;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public Double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
