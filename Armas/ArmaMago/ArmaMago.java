package Armas.ArmaMago;
/*
 * Definindo a classe abstrata ArmaMago, que estende a classe Arma
 */

import Armas.Arma;

public abstract class ArmaMago extends Arma {
    
    /*
     * Construtor da classe
     */
    public ArmaMago(String nome, double modDano){

        /*
         * Invocando o construtor da super classe (Arma)
         */
        super(nome, modDano);
    }
}
