package com.server.reproductorMusica.modelos;

public class Podcasts extends Canciones {

    private String nombrePod;

    public String getNombrePod() {
        return nombrePod;
    }

    public void setNombrePod(String nombrePod) {
        this.nombrePod = nombrePod;
    }

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones() > 15){
            return 6;
        }else {
            return 1;
        }
    }

    public void muestraInformacionPodcasts(){
        System.out.println("***************************************************************");
        System.out.println("com.server.reproductorMusica.modelos.Podcasts: " + getNombrePod());
        System.out.println("Duracion del com.server.reproductorMusica.modelos.Podcasts: " + getDuracion());
        System.out.println("Reproduciones: " + getTotalDeReproducciones());
        System.out.println("Like´s: " +getCantidadDeMegudtan());
        System.out.println("Casificacion: " +getClasificacion());
    }
}
