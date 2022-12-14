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

        System.out.println("-------------------------------");
        System.out.println("----Uso de operador relacional---");
        System.out.println("-------------------------------");

        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

            //Verificar strings
            String nomeUm = "Jair";
            String nomeDois = "Jair";

            System.out.println(nomeUm == nomeDois);

            //Verifica conteúdos(equals)
            nomeDois = new String("Jair");
            System.out.println(nomeUm.equals(nomeDois));

        System.out.println("-------------------------------");
        System.out.println("----Uso de operador lógico---");
        System.out.println("-------------------------------");

        // Operadores.java
        boolean condicao1=true;

        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

    }
    
    
}
