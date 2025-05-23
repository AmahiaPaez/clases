public class algoritmos {

    public static void main(String[] args) {
        int numero = 6;
        String palabra = "reconocer";
        int numeroF = 20;

        boolean resultadoPrimo = esPrimo(numero);
        System.out.println(resultadoPrimo);
        boolean resultadoPalabra = esPalindromo(palabra);
        System.out.println(resultadoPalabra);
        secuenciaFizzBuzz(numeroF);

    }

    public static boolean esPrimo(int numero){
        if(numero % 2 ==0){
            return true;
        }else{
            return false;
        }
    }

    public static String stringReversa(String palabra) {
        String reversaPalabra = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            reversaPalabra += palabra.charAt(i); // incide y posicion
        }
        return reversaPalabra;
    }

    public static boolean esPalindromo(String palabra) {
        String palabraEnReversa = stringReversa(palabra);
        return palabra.equals(palabraEnReversa);
    }

    public static void secuenciaFizzBuzz(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}