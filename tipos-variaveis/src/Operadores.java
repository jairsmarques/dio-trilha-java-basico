public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " "+  "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println("Exemplo 01 = " + concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("Exemplo 02 = " + concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("Exemplo 03 = " + concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("Exemplo 04 = " + concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println("Exemplo 05 = " + concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println("Exemplo 06 = " + concatenacao);    
    }
}
