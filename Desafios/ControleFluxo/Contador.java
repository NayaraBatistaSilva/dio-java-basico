import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try{
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
          }

        for(int contagem = 1; contagem <= parametroDois-parametroUm; contagem ++){
            System.out.println("imprimindo o número " + contagem);
        
        }
        }catch(Exception e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

}