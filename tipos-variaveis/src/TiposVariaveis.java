public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        int idade; // tipo "int", nome "idade", nenhum valor atribuído

        int anoFabricacao = 2024; // tipo "int", nome "anoFabricacao", com valor 2024 (inteiro)

        double salarioMinimo = 2500; // tipo "double", nome "salarioMinimo", com valor milhar 2.500 (ou 2500.00)

        int cep = 21070333; // se começar com zero, pode-se necessitar mudar o tipo, pois o zero pode ser ignorado. ex: String cep = "02170333"

        long cpf = 98765432109L; // variáveis do tipo long devem terminar com L para especificar que são Long

        float pi = 3.14F; // variáveis do tipo float devem terminar com F.

        // Casting: forçando explicitamente a conversão de um int em short.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Constantes: Variáveis que não podem ter o seu valor modificado após sua declaração. São representadas pela palavra reservada "final".

        final double VALOR_DE_PI = 3.14;
    
    }

    
}
