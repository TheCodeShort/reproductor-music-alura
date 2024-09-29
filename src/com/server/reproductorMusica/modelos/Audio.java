package com.server.reproductorMusica.modelos;

public class Audio   {

    private int duracion;
    private String titulo;
    private int totalDeReproducciones;
    private int cantidadDeMegudtan;
    private int clasificacion;



    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getDuracion() {
        return duracion;
    }

    public int getCantidadDeMegudtan() {
        return cantidadDeMegudtan;
    }

    public void setCantidadDeMegudtan(int cantidadDeMegudtan) {
        this.cantidadDeMegudtan = cantidadDeMegudtan;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
