public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println(numeroCurto2);

        int numero = 1;
        numero = 2;

        System.out.println(numero);

        final double VALOR_PI = 3.14;//constante -> o valor amarzenado não pode ser modificado

        System.out.println(VALOR_PI);
    }
}
