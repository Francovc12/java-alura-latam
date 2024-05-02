import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // ===================== Imprimiendo en pantalla ========================
        //aqui se imprime un hola mundo con el metodo System, aqui en texto siempre con comillas dobles
        System.out.println("Hola Mundo!");
        //con sout puedo escribir mas rapido el System.out.println
        System.out.println("Pelicula Matrix");

        // ==================== Declaracion de variables ========================
        //aqui se declara variables anioDeLanzamiento,evaluacion y incluidoEnElPlanBasico,
        //en el caso de ocupar punto decimal es recomendable usar mas double.
        int anioDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        //La clase string no es tipo de dato primitivo, para trabajar con un bloque de texto se usa tres comillas
        String titulo = "Matrix";
        String sinopsis = """
                Matrix la mejor pelicula del fin del milenio
                """;

        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: "+ titulo);
        System.out.println("Sinopsis: "+ sinopsis);
        System.out.println("Año de lanzamiento: "+anioDeLanzamiento);
        System.out.println("Calificacion: "+evaluacion);
        System.out.println("Disponible: "+incluidoEnElPlanBasico);

        // ==================== Primeros calculos en Java ==================
        // Promedios
        double mediaEvaluacion = (4.5 +4.8+ 3) / 3;
        System.out.println("Media de Calificacion de Matrix: "+mediaEvaluacion);

        // =================== uso de condicional ====================
        //Bloque condicional de anio de lanzamiento para calificar
        if (anioDeLanzamiento >= 2023){
            System.out.println("Pelicula muy reciente");
        }else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        // ================== Uso de los ciclo iterativo for ================
        /* ciclo for para capturar los datos del usuario y despues imprimo un calculo
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula Matrix es: "+ mediaEvaluacionUsuario/3);*/

        // ================ Uso del ciclo while ===================================
        int it = 0;
        while (it < 3){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota de la pelicula Matrix no debe superar a 5");
            double nota = teclado.nextDouble();
            it = it+1;
            if (nota > 5){ nota = 5.0;}
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + nota;
        }
        System.out.println("La media de la pelicula Matrix es: "+ mediaEvaluacionUsuario/3);
    }
}