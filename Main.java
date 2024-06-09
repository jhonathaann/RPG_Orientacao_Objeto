import java.util.Scanner;

import Armas.ArmaClerigo.Maca;
import Armas.ArmaClerigo.Martelo;
import Armas.ArmaMago.MagiaTransmutacao;
import Armas.ArmaMago.Psikappa;
import Armas.ArmaPaladino.Espada;
import Armas.ArmaPaladino.Lanca;
import Personagens.Clerigo;
import Personagens.Mago;
import Personagens.Paladino;
import Personagens.Personagem;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Personagem A = cria_Personagem(input);
        Personagem B = cria_Personagem(input);

        int op[] = new int[2];
        

        System.out.println("Selecione os personagens para o combate:");
        op[0] = input.nextInt();

        // =====================================================================================================================

        // Verificando quais vão ser as Classes dos dois personagens informados
       
        
        // Definindo como será realizada a batalha entre os personagens
        while(op[0] != 0){

            op[1] = input.nextInt();

            if(op[0] == op[1]){
                if(op[0] == 1){

                    // A ataca ele mesmo
                    A.atacar(A);

                }else{

                    // B ataca ele mesmo
                    B.atacar(B);
                }

            }else if(op[0] == 1 && op[1] == 2){

                // A ataca o B A.atacar(B);
                A.atacar(B);

            }else if(op[0] == 2 && op[1] == 1){
               
                // B ataca o A B.atacar(A)
                B.atacar(A);
                
            }else{
                System.out.println("Opcao invalida!\n");
            }

            op[0] = input.nextInt();
            
        }

        input.close();

    }

    /*
     * Definindo uma função para criar um personagem
     */

    public static Personagem cria_Personagem(Scanner input){
        
        //Scanner input = new Scanner(System.in);

        System.out.println("Entre com as informacoes do personagem:");
        // lendo as informações passadas na primeira linha
        String linha1 = input.nextLine();

        // dividindo a "linha1" sempre que um espaço for encontrado
        String[] partes1 = linha1.split(" ");

        // criando um array de floats que ira armazenar as informações importantes do primeiro personagem
        float[] lista1 = new float[partes1.length];
        for (int i = 0; i < partes1.length; i++) {
            lista1[i] = Float.parseFloat(partes1[i]);
        }


        if(lista1[0] == 1.0){

            // =============  MAGO ==================

            // Vericando qual é a arma do personagem
            if(lista1[4] == 1.0){

                return new Mago("Mago", lista1[1], lista1[2], lista1[3], new MagiaTransmutacao());
            }else{

                return new Mago("Mago", lista1[1], lista1[2], lista1[3], new Psikappa());
                
            }
            
        }else if(lista1[0] == 2.0){

            // =============  PALADINO ==================

            // verificando qual é a arma do personagem
            if(lista1[4] == 1.0){

                return new Paladino("Paladino", lista1[1], lista1[2], lista1[3], new Espada());

            }else{

                return new Paladino("Paladino", lista1[1], lista1[2], lista1[3], new Lanca());

            }

           
        }else if(lista1[0] == 3.0){

            // =============  CLERIGO ==================

            // verificando qual é a arma do personagem
            if(lista1[4] == 1.0){

                return new Clerigo("Clerigo", lista1[1], lista1[2], lista1[3], new Martelo());

            }else{
    
                return new Clerigo("Clerigo", lista1[1], lista1[2], lista1[3], new Maca());
            }

        }else{
            return null;
        }

    }
}
