


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package cronometro;


// IMPORTAÇÃO DE BIBLIOTECAS:
import funcoes.Cronometrar;
import funcoes.Temporizar;
import java.util.InputMismatchException;
import java.util.Scanner;


// MÉTODO PRINCIPAL DA CLASSE:
public class Menu {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    int repetir = 0;
    int escolha_usuario = 0;
    Cronometrar funcao_cronometro = new Cronometrar();
    Temporizar funcao_temporizar = new Temporizar();
    
    
    // FUNÇÃO QUE IRÁ EXIBIR O MENU:
    public void exibir_menu() {
        
        while(repetir != 1) {
            
            try {
                
                System.out.println("");
                System.out.println("MENU - GERAL");
                System.out.println("");
                System.out.println("0 - SAIR.");
                System.out.println("1 - CRONOMETRO.");
                System.out.println("2 - TEMPORIZADOR.");
                System.out.println("");
                System.out.printf("DIGITE SUA RESPOSTA: ");
                Scanner escolha_user = new Scanner(System.in);
                escolha_usuario = escolha_user.nextInt();

                switch(escolha_usuario) {

                    // CASO "0" - SAIR:
                    case 0:
                        repetir = 1;
                    break;

                    // CASO "1" - CRONOMETRO:
                    case 1:
                        funcao_cronometro.menu_cronometro();
                    break;
                    
                    // CASO "2" - TEMPORIZADOR:
                    case 2:
                        funcao_temporizar.menu_temporizador();
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
    
    
}




