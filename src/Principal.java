import com.server.reproductorMusica.modelos.Canciones;
import com.server.reproductorMusica.modelos.MisFavoritos;
import com.server.reproductorMusica.modelos.Podcasts;

public class Principal {

    public static void main (String[] args){

        Canciones misCanciones = new Canciones();
        misCanciones.setCancion("theLokos");
        misCanciones.setClasificacion(2);
        misCanciones.setCantidadDeMegudtan(200);
        misCanciones.setDuracion(50);
        misCanciones.setTotalDeReproducciones(1500);
        misCanciones.muestraInformacionCancion();

        Podcasts misPodcasts = new Podcasts();
        misPodcasts.setNombrePod("Hola Mundo");
        misPodcasts.setClasificacion(5);
        misPodcasts.setCantidadDeMegudtan(60);
        misPodcasts.setDuracion(80);
        misPodcasts.setTotalDeReproducciones(9000);
        misPodcasts.muestraInformacionPodcasts();

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(misPodcasts);
        favoritos.adiciona(misCanciones);
    }
}
