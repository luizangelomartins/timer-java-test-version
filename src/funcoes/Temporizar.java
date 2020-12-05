


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package funcoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


// MÉTODO PRINCIPAL DA CLASSE:
public class Temporizar {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    int aux1 = 0;
    int aux2 = 0;
    int tempo2 = 0;
    int tempo3 = 0;
    int tempo4 = 0;
    int tempo5 = 0;
    int tempo6 = 0;
        
    int repetir = 0;
    int escolha_usuario = 0;
    
    
    // FUNÇÃO PARA EXIBIÇÃO DO MENU DO TEMPORIZADOR:
    public void menu_temporizador() {
        
        repetir = 0;
        
        while(repetir != 1) {
            
            try {
                
                System.out.println("");
                System.out.println("MENU - TEMPORIZADOR");
                System.out.println("TEMPO LIMITE: 10 ( DEZ ) HORAS");
                System.out.println("");
                System.out.println("0 - VOLTAR AO MENU PRINCIPAL.");
                System.out.println("1 - ACERTAR O TEMPO E INICIAR CONTAGEM.");
                System.out.println("");
                System.out.printf("DIGITE SUA RESPOSTA: ");
                Scanner escolha_user = new Scanner(System.in);
                escolha_usuario = escolha_user.nextInt();

                switch(escolha_usuario) {

                    // CASO "0" - SAIR:
                    case 0:
                        repetir = 1;
                    break;

                    // CASO "1" - ACERTAR O TEMPO E INICIAR CONTAGEM:
                    case 1:
                        System.out.println("");
                        this.acerto_temporizador();
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
    
    
    // FUNÇÃO QUE "ACERTA" O TEMPO A SER CONTADO:
    public void acerto_temporizador() {
        
        int tempo_aux1 = 0;
        int tempo_aux2 = 0;
        int tempo_aux3 = 0;
        int tempo_aux4 = 0;
        
        while( tempo_aux4 != 1 ) {
            
            // "SEGUNDOS":
            while(tempo_aux1 != 1) {

                System.out.println("");
                System.out.printf("DIGITE OS SEGUNDOS PARTE 1 - ( 0 - 9 ): ");
                Scanner segundos1 = new Scanner(System.in);
                tempo6 = segundos1.nextInt();
                System.out.printf("DIGITE OS SEGUNDOS PARTE 2 - ( 0 - 5 ): ");
                Scanner segundos2 = new Scanner(System.in);
                tempo5 = segundos2.nextInt();
                if ( tempo6 <= 9 && tempo5 <= 5 ) { tempo_aux1 = 1; }

            }

            // "MINUTOS":
            while(tempo_aux2 != 1) {

                System.out.println("");
                System.out.printf("DIGITE OS MINUTOS PARTE 1 - ( 0 - 9 ): ");
                Scanner minutos1 = new Scanner(System.in);
                tempo4 = minutos1.nextInt();
                System.out.printf("DIGITE OS MINUTOS PARTE 2 - ( 0 - 5 ): ");
                Scanner minutos2 = new Scanner(System.in);
                tempo3 = minutos2.nextInt();
                if ( tempo4 <= 9 && tempo3 <= 5 ) { tempo_aux2 = 1; }

            }

            // "HORAS":
            while(tempo_aux3 != 1) {

                System.out.println("");
                System.out.printf("DIGITE AS HORAS PARTE 1 - ( 0 - 9 ): ");
                Scanner horas1 = new Scanner(System.in);
                tempo2 = horas1.nextInt();
                if ( tempo2 <= 9 ) { tempo_aux3 = 1; }

            }

            if ( tempo_aux1 == 1 && tempo_aux2 == 1 && tempo_aux3 == 1 ) { tempo_aux4 = 1; this.tempo_temporizador(); }
            
        }
    
    }
    
    
    // FUNÇÃO QUE EXIBE E CALCULA O TEMPO:
    public void tempo_temporizador() {
        
        aux1 = 0;
        aux2 = 1;
        
        Timer timer = null;
        final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    if (timer == null) {      
        
        timer = new Timer();  
        TimerTask tarefa = new TimerTask() {     
           
            public void run() {      

                try {      
                    
                    System.out.println("TEMPORIZADOR - [ " + tempo2 + "h:" + tempo3 + tempo4 + "m:" + tempo5 + tempo6 + "s ]");
                    tempo6--;

                    // "SEGUNDOS":
                    if (tempo6 < 0) { tempo6 = 9; tempo5--; }
                    if (tempo5 < 0) { tempo5 = 5; tempo4--; }

                    // "MINUTOS":
                    if (tempo4 < 0) { tempo4 = 9; tempo3--; }
                    if (tempo3 < 0) { tempo3 = 5; tempo2--; }

                    // "HORAS":
                    if (tempo2 == 0 && tempo3 == 0 && tempo4 == 0 && tempo5 == 0 && tempo6 == 0) {  
                    
                        tempo2 = 1;
                        tempo3 = 0;
                        tempo4 = 0;
                        tempo5 = 5;
                        tempo6 = 9;
                        
                    }
                     
                } catch (Exception e) {      
                    
                }      
                
            }   
               
         };      
           
        timer.scheduleAtFixedRate(tarefa, 0, 1000);      
        
    }    

    }
    
    
}




