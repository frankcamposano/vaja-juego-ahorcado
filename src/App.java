import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la maquina expendedora de bebidas");
        System.out.println("Elegí una opción de las siguientes:");
        System.out.println("*1 - Café");
        System.out.println("*2 - Mate");
        System.out.println("*3 - Gaseosa");
        System.out.println("*4 - Vino");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("buenisima eleccion");
                break;

            case 2:
                System.out.println("Debes ser Argentino");
                break;

            case 3:
                System.out.println("Yara con el azucar ");
                break;
            case 4:
                System.out.println("si tomaste vino, no manejes ");
                break;

            default:
                System.out.println("Opcion no valida.Fin del programa");
                break;
            
        }
        if (opcion<=4) {
            System.out.println("!Disfrute su bebida!");
        }
        scanner.close();

    }
}