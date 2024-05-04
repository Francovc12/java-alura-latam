import modelo.Pelicula;

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
                case 9:
                    System.out.println("Saliendo del programa");
                default:
                    System.out.println("Opcion no valida");
                    break;
                    //calculadora de maratonear una serie en horas o dias y tambien hacer el caso 2
            }

        }
    }
}
