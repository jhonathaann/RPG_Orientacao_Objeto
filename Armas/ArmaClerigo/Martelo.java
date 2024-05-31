package Armas.ArmaClerigo;
/*
 * Criando outra classe concreta que estende a classe ArmaClerigo
 * Essa é uma das armas da classe clerigo
 */

public class Martelo extends ArmaClerigo {
    
    /*
     * Criando o construtor da classe
     */
    public Martelo(){

        /*
         * Chamando o construtor da super classe, que no caso é a classe abstrata ArmaClerigo
         */
        super("Martelo", 0.6);
    }
}
