package com.server.reproductorMusica.modelos;

public class MisFavoritos extends Podcasts {

    public void adiciona (Audio audio){
        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + "Es uno de los favaoritos del momneto");
        }else {
            System.out.println(audio.getTitulo() + "No entran en los favoritos");
        }
    }

}
