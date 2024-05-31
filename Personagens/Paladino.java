package Personagens;
/*
 * Criando uma classe concreta, chamada de Paladino
 * Essa classe estende a classe abstrata Personagem
 */

import Armas.Arma;

public class Paladino extends Personagem {
    
    /*
     * Construtor da classe Paladino
     */
    public Paladino(String nomeTipo, double saude, double forca, double destreza, Arma arma){

        /*
         * Invocando o Construtor da classe pai
         */
        super("Paladino", saude, forca, destreza, arma);
    }
}
