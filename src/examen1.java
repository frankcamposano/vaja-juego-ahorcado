public class examen1 {
    public static void main(String[] args) {
        /*
         * int[] numbers = new int[10];
         * for (int i = 0; i < numbers.length; i++) {
         * numbers[i] = i + 1;
         * }
         * for (int i = numbers.length - 1; i >= 0; i--) {
         * System.out.println(numbers[i]);
         * }
         */

        int[] arreglo  = new int[10];
        for (int i = 0; i < arreglo .length; i++) {
            arreglo [i]=(i+1)*2;
            System.out.println(arreglo [i]);
            
        }
        int suma=0;
        for (int i = 0; i < arreglo .length; i++) {
            suma+=arreglo [i];
        }
        int promedio;
        promedio=suma/arreglo .length;

        System.out.println("el promedio de los valores del arreglos es:"+ promedio);

    }
}
