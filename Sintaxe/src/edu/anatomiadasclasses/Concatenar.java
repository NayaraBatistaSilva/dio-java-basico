package edu.nayara.anatomiadasclasses;
public class Concatenar {
   
    
    
public static void main (String [] args) {

    String primeiroNome = "Nayara";
    String segundoNome = "Batista";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}
// aplicação do conceito de concatenar (.concat)
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}
