import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
            Bienvenido/a a Screenmatch
            1) Registrar una nueva pelicula
            2) Registrar una nueva serie
            3) Maratoneo "calcule los dias que necesitara para visualizar un titulo"
            9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1 :
                    System.out.println("Ingrese el nombre de la pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la pelicula");
                    int anioDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos de la pelicula ");
                    int tiempoDeDuracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setAnioDeLanzamiento(anioDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(tiempoDeDuracionEnMinutos);

                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int anioDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese las temporadas de la serie ");
                    int temporadas = teclado.nextInt();
                    System.out.println("Ingrese los capitulos por temporada de la serie ");
                    int capitulosPorTemporada = teclado.nextInt();
                    System.out.println("Ingrese la duracion en minutos de los capitulos de la serie ");
                    int tiempoDeDuracionEnMinutosSerie = teclado.nextInt();
                    teclado.nextLine();

                    Serie serieNueva = new Serie();
                    serieNueva.setNombre(nombreSerie);
                    serieNueva.setAnioDeLanzamiento(anioDeLanzamientoSerie);
                    serieNueva.setTemporadas(temporadas);
                    serieNueva.setEpisodiosPorTemporada(capitulosPorTemporada);
                    serieNueva.setMinutosPorCapitulo(tiempoDeDuracionEnMinutosSerie);

                    serieNueva.muestraFichaTecnica();
                    break;
                case 3:
                    System.out.println("Ingresa las horas del titulo a ver");
                    int horas = teclado.nextInt();
                    System.out.println("Ingresa las horas que le dedicarias a este titulo todos los dias");
                    int horasUsuario = teclado.nextInt();
                    if (horasUsuario <= 24){
                        double dias = horas/horasUsuario;
                        System.out.println("Maratonea "+ horasUsuario +"hs: " + dias+" dias");
                    }else{
                        double dias = horas/24;
                        System.out.println("Maratonea 24 hs: " + dias);
                    };
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }

        }
    }
}
