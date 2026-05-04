

package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");

        //CREACION DE NUEVAS SUBCLASES
        //PELICULASSTREAMING
        PeliculaStreaming peliculaStreaming = new PeliculaStreaming(
            "Glass Onion",
            139,
            "Misterio",
            "Netflix",
            "4K",
            true
        );
        
        //TRANSMISIONENVIVO
        TransmisionEnVivo transmision = new TransmisionEnVivo(
            "Torneo internacional de eSports",
            120,
            "Gaming",
            "Twitch",
            "Latam Gaming",
            8500
        );
        
        //CREACION DE NUEVOS OBJETOS
        //ACTOR
        pelicula.agregarActor(new Actor("Sigourney Weaver", 74, "Dra. Grace Augustine"));
        pelicula.agregarActor(new Actor("Stephen Lang", 71, "Coronel Miles Quaritch"));
        
        //TEMPORADA
        serie.agregarTemporada(3, 10, "31 de marzo de 2013");
        serie.agregarTemporada(4, 10, "6 de abril de 2014");
        
        //INVESTIGADOR
        documental.agregarInvestigador(new Investigador("Neil deGrasse Tyson", "Astrofísica", "Hayden Planetarium"));
        documental.agregarInvestigador(new Investigador("Ann Druyan", "Divulgación científica", "Cosmos Studios"));
        	
        contenidos[0] = pelicula;
        contenidos[1] = serie;
        contenidos[2] = documental;
        contenidos[3] = peliculaStreaming;
        contenidos[4] = transmision;
        
        
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}