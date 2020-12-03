


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package funcoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimerTask;


// MÉTODO PRINCIPAL DA CLASSE:
public class Cronometrar {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    int repetir = 0;
    int escolha_usuario = 0;
    
    
    // FUNÇÃO PARA EXIBIÇÃO DO MENU DO CRONOMETRO:
    public void menu_cronometro() {
        
        while(repetir != 1) {
            
            try {
                
                System.out.println("");
                System.out.println("0 - VOLTAR AO MENU PRINCIPAL.");
                System.out.println("1 - INICIAR CONTAGEM.");
                System.out.println("");
                System.out.printf("DIGITE SUA RESPOSTA: ");
                Scanner escolha_user = new Scanner(System.in);
                escolha_usuario = escolha_user.nextInt();

                switch(escolha_usuario) {

                    // CASO "0" - SAIR:
                    case 0:
                        repetir = 1;
                    break;

                    // CASO "1" - INICIAR CONTAGEM:
                    case 1:
                        this.tempo_cronometro();
                    break;

                    default:
                        System.err.println("VALOR INVALIDO!");
                        System.err.println("POR FAVOR TENTE NOVAMENTE!");

                }
        
            }catch(InputMismatchException e) {
                
                System.err.println("VALOR INVALIDO!");
                System.err.println("POR FAVOR TENTE NOVAMENTE!");
                    
            }
            
        }
        
        
    }
    
    
    // FUNÇÃO QUE CALCULA E EXIBE O TEMPO:
    public void tempo_cronometro() {
        
        int aux1 = 1;
        int aux2 = 0;
        
        int tempo1 = 0;
        int tempo2 = 0;
        int tempo3 = 0;
        int tempo4 = 0;
        int tempo5 = 0;
        int tempo6 = 0;
        
        
        new java.util.Timer().schedule(new TimerTask() {
        @Override
        public void run() {
            
            while(aux1 != aux2) {
            
                System.out.println(tempo1 + tempo2 + ":" + tempo3 + tempo4 + ":" + tempo5 + tempo6);
                
            }
            
        }
        }, 1000);

    }
    
    
}




