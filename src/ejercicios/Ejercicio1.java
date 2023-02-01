package ejercicios;

public class Ejercicio1 {
    public static int sumaArray(int array[]) {
        int suma = array[0];
        for (int pos = 1; pos < array.length; pos++) {
            suma += array[pos];
        } return suma;
    }

    
}
