package Armas.ArmaClerigo;
/*
 * Definindo a classe abstrata ArmaClerigo, que estende a classe Arma
 * 
 */

import Armas.Arma;

public abstract class ArmaClerigo extends Arma {
    
    /*
     * Construtor da classe
     */
    public ArmaClerigo(String nome, double modDano){

        /*
         * Chamando o construtor da classe pai, no caso é a classe Arma
         */
        super(nome, modDano);
    }
}
