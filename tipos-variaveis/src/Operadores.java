public class Operadores {
    public static void main(String[] args) {

        // Utilizando operadores

        System.out.println("Exemplo de concatenação:");

        String nomeCompleto = "Linguagem" + "JAVA";
        System.out.println(nomeCompleto);

        // Operador de atribuição (=), operador de adição (+), no exemplo, atribuindo a concatenação de palavras à variável nomeCompleto, do tipo String.

        System.out.println("Exemplo de operador unário (negativação)");
        // Operador unário, negativando um valor a partir do operador (-)
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        // Incrementando um valor a partir do operador (+)

        System.err.println("Exemplo de incrementação de valor:");

        numero = numero * - 1;

        numero = numero + 1;
        System.out.println(numero);

        // Operadores ternários: condição "if" cuja estrutura é escrita em apenas uma linha, com os operadores "?:"

        // <expressão condicional> ? <caso seja true> : <caso seja false>

        int a,b;

        a = 5;
        b = 6;

        // Forma tradicional:

        System.out.println("Exemplo da forma tradicional: resultado = falso");
        if (a==b){
            String resultado = "verdadeiro";
            System.out.println(resultado);
        }
        else{
            String resulado = "falso";
            System.out.println(resulado);
        }

        System.out.println("Exemplo utilizando operadores ternários");

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

         // Operadores lógicos: && (E lógico) e || (OU lógico)

         boolean condicao1 = true;
         boolean condicao2 = false;
 
         // Exemplo do operador E lógico (&&)
 
         System.out.println("Exemplo de operador lógico E (&&):");
 
         if (condicao1 && condicao2) {
             System.out.println("As duas condições são verdadeiras");
         } else {
             System.out.println("Pelo menos uma das condições é falsa");
         }
 
         // Exemplo do operador OU lógico (||)
 
         System.out.println("Exemplo de operador lógico OU (||):");
 
         if (condicao1 || condicao2) {
             System.out.println("Pelo menos uma das condições é verdadeira");
         } else {
             System.out.println("As duas condições são falsas");
         }

       
    }
}
