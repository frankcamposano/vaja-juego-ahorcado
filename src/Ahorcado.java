import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta="inteligencia";
        int intentosMaximos=10;
        int intentos=0;
        boolean palabraAdivinada=false;

        // Arreglos:
        char[]letrasAdivinadas =new char[palabraSecreta.length()];

        // Estructura de control: iteractiva(Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i]='-';
            
        }
        // Estructura de control: iteractiva(Bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                     //palabra de chars
            System.out.println("palabras a adivinar:" + String.valueOf(letrasAdivinadas)+" ( "+ palabraSecreta.length()+" letras)");
            System.out.println("Introduce una letra,porfavor:");
            // Usamos la libreria scanner para pedir una letra
            char letra=Character.toLowerCase(scanner.next().charAt(0)) ;

            boolean letraCorrecta=false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i)==letra) {
                    letrasAdivinadas[i]=letra;
                    letraCorrecta=true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("!Incorrecto te quedan " + (intentosMaximos - intentos)+" intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada=true;
                System.out.println("!Felicidades!! , has adivinado la palabra secreta:" +palabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("!Que pena te haz quedado sin intentos !GAME OVER");
        }
        scanner.close();
    }
}
