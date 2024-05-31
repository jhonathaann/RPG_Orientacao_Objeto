package Personagens;
/*
 * Definindo a Classe Personagem
 * Essa classe é a primeira classe na hierarquia de classes
*/

import Armas.Arma;

public abstract class Personagem{
    /*
     * Definindo os atributos de instância da Classe
    */
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    /*
     * Criando o Método Construtor da Classe
    */

    public Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma){
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;

        printStatus();
    }

    /* --------- Descrevendo os Métodos da Classe Personagem -------------- */

    /*
     * Função para mostrar na tela os status de cada personagem
     */
    public void  printStatus(){

        // Verificando se o personagem esta morto
        if(estaMorto() == false){
            System.out.printf("%s [Saude: %.1f, Forca: %.1f, Destreza: %.1f, %s]\n",this.nomeTipo, this.saude, this.forca, this.destreza, this.arma.getNome());
        }else{
            System.out.printf("%s [Morreu, Forca: %.1f, Destreza: %.1f, %s]\n",this.nomeTipo, this.saude, this.forca, this.destreza, this.arma.getNome());
        }

       
    }

    // "boneco" é quem esta sofrendo o ataque 
    public void atacar(Personagem boneco){

        /*
         * Personagem A (que esta atacando) esta vivo
        */
        if(this.saude >= 1.0){

            System.out.printf("O personagem %s ataca o personagem %s com arma %s.\n", this.nomeTipo, boneco.nomeTipo, this.arma.getNome());

            // Verificando se o personagem B (atacado) esta vivo no momento em que sofre o ataque
            if(boneco.estaMorto() == true){

                // B ja esta morto
                System.out.printf("Pare! O personagem %s ja esta morto!\n", boneco.nomeTipo);

            }else{

                /*
                 * Ataque bem sucedido
                 * Força E Destreza do atacante devem ser maiores que a Força e a Destreza do atacado
                 */
                if(this.forca > boneco.forca && this.destreza > boneco.destreza){

                    /*
                     * Subtraindo a vida do personagem B
                     */

                    boneco.recebeDano(calculaDano());

                    System.out.printf("O ataque foi efetivo com %.1f pontos de dano!\n", calculaDano());

                // =================================================================================================================


                /* Ataque mal sucedido(defendido E revidado pelo personagem B (inicialmente era quem estava sendo atacado)) 
                * personagem A possui força OU destreza menores que as respectivas força ou destreza do personagem B
                */  
                }else if(this.forca < boneco.forca || this.destreza < boneco.destreza){

                    // saude do personagem A (que era inicialmente o atacante) deve ser subtraida

                    recebeDano(boneco.calculaDano()); // calculando o dano causado pelo personagem B

                    System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!\n", boneco.calculaDano());


                // =================================================================================================================

                /*
                 * Ataque defendido(é anulado por B)
                 * força de A é igual a força de B OU destreza de A é igual a destreza de B
                 * Nesse caso, ninguem toma dano
                */
                
                }else if(this.forca == boneco.forca || this.destreza == boneco.destreza){

                    System.out.printf("O ataque foi defendido, ninguem se machucou!\n");
                }
                
            }

        }else{  
            
            // Caso o personagem selecionado para atacar ja estiver morto

            System.out.printf("O personagem %s não consegue atacar, pois esta morto.\n", this.nomeTipo);
        }

        printStatus();
        boneco.printStatus();
    }

    /*
     * Função que calcula o dano que um personagem causa
     * forca do personagem * modificador de dano da sua arma, não?
     */
    private double calculaDano(){

        return this.forca  *  this.arma.getModificadorDano();
    }

    /*
     * Função que recebe sofrido por um personagem
     */
    private void recebeDano(double pontosDanos){
        
        if(pontosDanos > this.saude){
            this.saude = 0.0;
        }else{
            this.saude = this.saude - pontosDanos;
        }
        
    }

    /*
     * Função que determina se um personagem esta morto ou não
     */
    private boolean estaMorto(){

        if(this.saude < 1.0){
            return true;
        }else{
            return false;
        }

    }
}