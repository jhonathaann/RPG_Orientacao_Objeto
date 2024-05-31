package Personagens;
/*
 * Criando uma classe concreta, chamada de Paladino
 * Essa classe estende a classe abstrata Personagem
 */

import Armas.Arma;

public class Mago extends Personagem {

    /*
     * Construtor da classe Mago
     */
    public Mago(String nomeTipo, double saude, double forca, double destreza, Arma arma){

        /*
         * Chamando o Construtor da classe super classe (Personagem)
         */
        super("Mago", saude, forca, destreza, arma);
    }
    
}