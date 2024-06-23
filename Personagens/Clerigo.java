package Personagens;
/*
 * Criando uma classe concreta, chamada de Clerigo
 * Essa classe estende a classe abstrata Personagem
 */

import Armas.ArmaClerigo.ArmaClerigo;

public class Clerigo extends Personagem {
    
    /*
     * Construtor da classe
     */
    public Clerigo(String nomeTipo, double saude, double forca, double destreza, ArmaClerigo arma){

        /*
         * Invocando o construtor da super classe (Personagem)
         */
       super("Clérigo", saude, forca, destreza, arma);

    }
}
