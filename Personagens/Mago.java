package Personagens;
/*
 * Criando uma classe concreta, chamada de Paladino
 * Essa classe estende a classe abstrata Personagem
 */

import Armas.ArmaMago.ArmaMago;

public class Mago extends Personagem {

    /*
     * Construtor da classe Mago
     */
    public Mago(String nomeTipo, double saude, double forca, double destreza, ArmaMago arma){

        /*
         * Chamando o Construtor da classe super classe (Personagem)
         */
        super("Mago", saude, forca, destreza, arma);
    }
    
}