public class Operadores {
    public static void main(String[] args) {
        /*
         * String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        System.out.println("----------------------------");

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
         */

         /*
        int numero = 5;

         System.out.println(- numero);

         numero = - numero;

         System.out.println(numero);

         numero = numero * -1;
         System.out.println(numero);
          */
        System.out.println("-------------------------------");
        System.out.println("----Uso de operador unário---");
        System.out.println("-------------------------------");

          int numero = 5;
          // x repeticao
          //numero = numero + 2;
          //numero += 2;
          //numero++;

        System.out.println(numero++);// -> imprime depois incrementa
        System.out.println(numero);
        System.out.println(++numero);// -> incrementa depois imprime

        System.out.println(numero);

        System.out.println("-------------------------------");
        System.out.println("----Uso de operador ternário---");
        System.out.println("-------------------------------");
          // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);




    }
    
}
