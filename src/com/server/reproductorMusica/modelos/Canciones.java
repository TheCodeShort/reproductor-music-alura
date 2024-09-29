package com.server.reproductorMusica.modelos;

public class Canciones extends Audio{

    private String cancion;
    private String genero;

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    @Override
    public int getClasificacion() {
        if (getCantidadDeMegudtan() > 1000){
            return 8;
        }else {
            return 4;
        }
    }

    public void muestraInformacionCancion(){
        System.out.println("***************************************************************");
        System.out.println("com.server.reproductorMusica.modelos.Podcasts: " + getCancion());
        System.out.println("Duracion del com.server.reproductorMusica.modelos.Podcasts: " + getDuracion());
        System.out.println("Reproduciones: " + getTotalDeReproducciones());
        System.out.println("Like´s: " +getCantidadDeMegudtan());
        System.out.println("Casificacion: " +getClasificacion());
    }
}
