package Armas.ArmaPaladino;
/*
 * Definindo a classe abstrata ArmaPaladino, que estende a classe Arma
 */

import Armas.Arma;

public abstract class ArmaPaladino extends Arma {
    
    /*
     * Construtor da classe
     */
    public ArmaPaladino(String nome, double modDano){

        /*
         * chamando o construtor da super classe (Arma)
         */
        super(nome, modDano);
    }
}
