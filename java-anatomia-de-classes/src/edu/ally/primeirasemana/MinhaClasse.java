package edu.ally.primeirasemana;
public class MinhaClasse {

    public static void main(String[] args) {

        
        String primeiroNome = "Ally";
        String segundoNome = "Santana";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    
    
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do mtodo " +  primeiroNome.concat(" ").concat(segundoNome);
    }
    
} 