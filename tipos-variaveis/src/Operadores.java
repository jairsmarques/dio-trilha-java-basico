
public class Operadores {

    public static void main(String[] args) {
        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);

        // negação
        boolean variavel = true;

        variavel = !variavel;
        System.out.println(variavel);

        // ternário
        int a, b;
        a = 6;
        b = 6;

        int resultado = a == b ? 1 : 2;

        System.out.println(resultado);
    }
}
