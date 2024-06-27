import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {

    public static void main(String[] args) {
        /*case 1
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(3000.0);
        */
    
    }
    static void selecaoCandidatos(){
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatoSelecionado <5 && candidatoAtual < candidatos.length){
            String canditado = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditado "+ canditado + "Solicitou este valor de salario" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O canditato"+canditado+"Foi selecionado para a vaga");
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }
    }
    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o canditado com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais canditatos");
        }
        
    }
}