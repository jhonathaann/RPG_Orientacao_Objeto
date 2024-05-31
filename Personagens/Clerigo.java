package Personagens;
/*
 * Criando uma classe concreta, chamada de Clerigo
 * Essa classe estende a classe abstrata Personagem
 */

import Armas.Arma;

public class Clerigo extends Personagem {
    
    /*
     * Construtor da classe
     */
    public Clerigo(String nomeTipo, double saude, double forca, double destreza, Arma arma){

        /*
         * Invocando o construtor da super classe (Personagem)
         */
       super("Clerigo", saude, forca, destreza, arma);

    }
}
